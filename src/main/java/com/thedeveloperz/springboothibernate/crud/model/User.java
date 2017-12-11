package com.thedeveloperz.springboothibernate.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="users")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;

@NotNull
private String email;
@NotNull
private String name;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
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

public User(String email, String name){
	this.email = email;
	this.name = name;
}
public User(){
	
}
public User(long id2) {
	this.id = id2;
}
}