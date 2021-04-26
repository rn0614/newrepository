package com.spring_di_annotation.comfiguration_bean;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.spring_di_annotation.comfiguration_bean")
@Configuration
public class ApplicationConfig {
	@Bean
	public BMI bmi() {
		BMI bmi = new BMI();
		return bmi;
	}
	
	public Member member() {
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("수영");
		courses.add("헬스");
		courses.add("에어로빅");
		
		Member member = new Member();
		member.setBmi(bmi());
		member.setName("홍길동");
		member.setAge(30);
		member.setHeight(175);
		member.setWeight(70);
		member.setCourses(null);
		
		
	}
	
}
