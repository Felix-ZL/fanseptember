package com.fanseptember.controller;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fanseptember.assembler.CommentAssembler;
import com.fanseptember.exception.NotFoundException;
import com.fanseptember.model.Comment;
import com.fanseptember.repository.CommentRepository;

@RestController
public class CommentController {
	private final CommentRepository repository;
	private final CommentAssembler assembler;

	public CommentController(CommentRepository repository, CommentAssembler assembler) {
		this.repository = repository;
		this.assembler = assembler;
	}

	// Aggregate root
	@GetMapping("/comments")
	public CollectionModel<EntityModel<Comment>> all() {

		List<EntityModel<Comment>> comments = repository.findAll().stream().map(assembler::toModel)
				.collect(Collectors.toList());
		return new CollectionModel<>(comments, linkTo(methodOn(CommentController.class).all()).withSelfRel());
	}

	@PostMapping("/comments")
	Comment newEmployee(@RequestBody Comment newComment) {
		return repository.save(newComment);
	}

	// Single item
	@GetMapping("/comments/{id}")
	public EntityModel<Comment> one(@PathVariable Long id) {

		Comment comment = repository.findById(id).orElseThrow(() -> new NotFoundException("comment", id));
		return assembler.toModel(comment);
	}

//	  @PutMapping("/employees/{id}")
//	  Comment replaceEmployee(@RequestBody Comment newEmployee, @PathVariable Long id) {
//
//	    return repository.findById(id)
//	      .map(employee -> {
//	        employee.setName(newEmployee.());
//	        employee.setRole(newEmployee.getRole());
//	        return repository.save(employee);
//	      })
//	      .orElseGet(() -> {
//	        newEmployee.setId(id);
//	        return repository.save(newEmployee);
//	      });
//	  }

	@DeleteMapping("/employees/{id}")
	void deleteEmployee(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
