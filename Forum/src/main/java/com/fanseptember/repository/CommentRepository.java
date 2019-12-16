package com.fanseptember.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fanseptember.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
