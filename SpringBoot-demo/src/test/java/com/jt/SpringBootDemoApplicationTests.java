package com.jt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jt.pojo.Dog;
import com.jt.pojo.Shiro;
import com.jt.pojo.User;

@RunWith(SpringRunner.class)
@SpringBootTest //springboot启动加载对象

public class SpringBootDemoApplicationTests {
	
	//测试为属性赋值
	@Autowired
	private User user;
	@Autowired
	private Dog dog;
	@Autowired
	private Shiro shiro;
	@Test
	public void user() {
		System.out.println(user);
		
		
	}
	@Test
	public void dog() {
		System.out.println(dog);
	}
	@Test
	public void shiro() {
		shiro.pri();
	}
}
