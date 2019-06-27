package com.jt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jt.pojo.Shiro;

//该类中标识的就是xml中的数据
@Configuration  //=xml配置文件
public class ShiroConfig {
	
	//public 返回值类型 方法名称（参数列表）
	@Bean
	public Shiro shiro() {
		
		return new Shiro();
	}
}
