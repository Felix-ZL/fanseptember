package com.fanseptember.assembler;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import com.fanseptember.controller.CommentController;
import com.fanseptember.model.Comment;

@Component
public class CommentAssembler implements RepresentationModelAssembler<Comment, EntityModel<Comment>> {
	@Override
	public EntityModel<Comment> toModel(Comment comment) {

		return new EntityModel<>(comment, linkTo(methodOn(CommentController.class).one(comment.getId())).withSelfRel(),
				linkTo(methodOn(CommentController.class).all()).withRel("comments"));
	}
}
