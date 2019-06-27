package com.jt.pojo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
//为当前对象交给spring容器管理
@Component
@ConfigurationProperties(prefix="user")
public class User implements Serializable{
	
	private static final long serialVersionUID = -8553474428908813331L;
	//@Value("${user.id}")
	private Integer id;   //默认值 0
	//@Value("${user.username}")
	private String username;
	//
	@Value("${user.age}")
	private Integer age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", age=" + age + "]";
	}
	
	

}
