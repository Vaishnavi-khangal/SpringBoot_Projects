package com.coffee.coffeeproduction.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coffee.coffeeproduction.entity.Coffee;



@RestController
public class CoffeeProduction {

	private List<Coffee> coffee = new ArrayList<>();

	public CoffeeProduction()
		//adding coffee to the list
	{
	
		coffee.addAll(List.of(new Coffee(200, "Americano"), new Coffee(300, "Iced"), new Coffee(450, "Lungo"),
				new Coffee(500, "Latte"), new Coffee(350, "Brewed coffee"), new Coffee(550, "Flat White")));
		
	}
	//To display all the coffee in the list
	@RequestMapping(value = "/coffee", method = RequestMethod.GET)
	Iterable<Coffee> getAllLeds()
	{
		return coffee;
	}

	}


