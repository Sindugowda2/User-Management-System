package com.vvfgc.B90_User;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User 
{
	private Integer id;
	private String name;
	private String type;
	private String password;
	
	//getters and setters
	@Id 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//generate constructor
	public User(Integer id, String name, String type, String password) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.password = password;
	}
	public User()
	{
		
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", type=" + type + ", password=" + password + "]";
	}

}
