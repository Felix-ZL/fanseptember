package com.fanseptember.model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.fanseptember.define.ArticleStatus;
import lombok.Data;

@Data
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
}
