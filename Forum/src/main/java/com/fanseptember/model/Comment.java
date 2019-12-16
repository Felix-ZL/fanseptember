package com.fanseptember.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fanseptember.define.CommentStatus;

@Entity
public class Comment {
	private @Id @GeneratedValue Long id;
	private Long article_id;
	// private Long reporter_id;
	private Long replyto_id;
	private Date commit_time;
	private String content;
	private CommentStatus status;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, optional = false)
	@JoinColumn(name = "reporter_id")
	private User reporter_id;

	public Comment() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getArticle_id() {
		return article_id;
	}

	public void setArticle_id(Long article_id) {
		this.article_id = article_id;
	}

	public Long getReplyto_id() {
		return replyto_id;
	}

	public void setReplyto_id(Long replyto_id) {
		this.replyto_id = replyto_id;
	}

	public Date getCommit_time() {
		return commit_time;
	}

	public void setCommit_time(Date commit_time) {
		this.commit_time = commit_time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public CommentStatus getStatus() {
		return status;
	}

	public void setStatus(CommentStatus status) {
		this.status = status;
	}

	public String getReporter_nickname() {
		return reporter_id.getNickname();
	}

	public String getReporter_avator_url() {
		return reporter_id.getAvator_url();
	}
}
