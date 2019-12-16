package com.fanseptember.controller;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fanseptember.exception.NotFoundException;
import com.fanseptember.model.Comment;
import com.fanseptember.repository.CommentRepository;


@RestController
public class CommentController {
	private final CommentRepository repository;

	public CommentController(CommentRepository repository) {
	    this.repository = repository;
	  }

	  // Aggregate root
	  @GetMapping("/comments")
	  List<Comment> all() {
	    return repository.findAll();
	  }

	  @PostMapping("/comments")
	  Comment newEmployee(@RequestBody Comment newComment) {
	    return repository.save(newComment);
	  }

	  // Single item
	  @GetMapping("/comments/{id}")
	  Comment one(@PathVariable Long id) {

	    return repository.findById(id)
	      .orElseThrow(() -> new NotFoundException("comment",id));
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






  

