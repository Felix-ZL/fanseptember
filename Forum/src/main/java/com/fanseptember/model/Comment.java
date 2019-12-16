package com.fanseptember.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.fanseptember.define.CommentStatus;

import lombok.Data;

@Data
@Entity
public class Comment {
	private @Id @GeneratedValue Long id;
	private Long article_id;
	private Long reporter_id;
	private Long replyto_id;
	private Date commit_time;
	private String content;
	private CommentStatus status;
}
