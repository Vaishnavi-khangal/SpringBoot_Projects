package com.constructorinj.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.constructorinj.entity.Subject;
import com.constructorinj.entity.Trainer;

//configuration annotation indicates that the class @Bean definition methods
@Configuration

//To define subject and trainer class
public class Config {
	// @Bean Annotation is applied on a method to specify that it returns a bean to be managed by Spring context
	@Bean
	public Subject subject ()
	{
       return new Subject ("comp");
  
    }
	
	@Bean
	public Trainer trainer ()
	{
       return new Trainer (subject());
  
    }
	
}


