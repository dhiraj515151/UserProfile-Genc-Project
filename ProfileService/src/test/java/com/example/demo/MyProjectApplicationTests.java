package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.cognizant.myProject.controller.UserController;
@ContextConfiguration
@SpringBootTest
public class MyProjectApplicationTests {
	@Autowired
	private UserController controller;
	@Test
	void contextLoads() {
	assertThat(controller).isNotNull();
	}
	

}
