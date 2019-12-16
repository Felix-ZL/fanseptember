package com.fanseptember.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.fanseptember.define.AttitudeType;
import lombok.Data;


@Entity
public class Attitude {
	private @Id @GeneratedValue Long id;
	private Long article_id;
	private Long comment_id;
	private Long reporter_id;	
	private Date commit_time;
	private AttitudeType attitude;
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
	public Long getComment_id() {
		return comment_id;
	}
	public void setComment_id(Long comment_id) {
		this.comment_id = comment_id;
	}
	public Long getReporter_id() {
		return reporter_id;
	}
	public void setReporter_id(Long reporter_id) {
		this.reporter_id = reporter_id;
	}
	public Date getCommit_time() {
		return commit_time;
	}
	public void setCommit_time(Date commit_time) {
		this.commit_time = commit_time;
	}
	public AttitudeType getAttitude() {
		return attitude;
	}
	public void setAttitude(AttitudeType attitude) {
		this.attitude = attitude;
	}
	
}
