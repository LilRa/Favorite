package com.favorite.model;

public class User {
	private int user_id;
	private String email;
	private String name;
	private int block_flag;
	
	public int getBlock_flag() {
		return block_flag;
	}
	public void setBlock_flag(int block_flag) {
		this.block_flag = block_flag;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
