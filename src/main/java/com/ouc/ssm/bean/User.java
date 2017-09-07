package com.ouc.ssm.bean;

/**
 * @title：User.java
 * @author：被抛弃的猫咪 @version：1.0
 * @date：2017年9月6日 下午2:44:06 @description：
 */
public class User {
	private int Id;
	private String username;
	private String password;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
