package com.fanseptember.model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.fanseptember.define.ArticleStatus;
import lombok.Data;


@Entity
public class Article {
	private @Id @GeneratedValue Long id;	
	private String wx_article_url;
	private String title;
	private String content_url;
	private Long  author_id;	
	private Date create_time;
	private Date edit_time;
	private ArticleStatus status;
	//private int read_amount;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getWx_article_url() {
		return wx_article_url;
	}
	public void setWx_article_url(String wx_article_url) {
		this.wx_article_url = wx_article_url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent_url() {
		return content_url;
	}
	public void setContent_url(String content_url) {
		this.content_url = content_url;
	}
	public Long getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(Long author_id) {
		this.author_id = author_id;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getEdit_time() {
		return edit_time;
	}
	public void setEdit_time(Date edit_time) {
		this.edit_time = edit_time;
	}
	public ArticleStatus getStatus() {
		return status;
	}
	public void setStatus(ArticleStatus status) {
		this.status = status;
	}
	
}
