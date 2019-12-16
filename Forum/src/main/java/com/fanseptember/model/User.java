package com.fanseptember.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
	  private @Id @GeneratedValue Long id;
	  private String wx_id;
	  private String name;
	  private int gender;
	  private String avator_url;
	  private boolean is_author;
}







