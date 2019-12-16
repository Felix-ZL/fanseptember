package com.fanseptember.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	private @Id @GeneratedValue Long id;
	private String wx_id;
	private String username;
	private String nickname;
	private int gender;
	private String avator_url;
	private String proflie;
	private String password;

	
	@OneToMany(mappedBy = "reporter_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Comment> comments;

	public User() {

	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWx_id() {
		return wx_id;
	}

	public void setWx_id(String wx_id) {
		this.wx_id = wx_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getAvator_url() {
		return avator_url;
	}

	public void setAvator_url(String avator_url) {
		this.avator_url = avator_url;
	}

	public String getProflie() {
		return proflie;
	}

	public void setProflie(String proflie) {
		this.proflie = proflie;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
