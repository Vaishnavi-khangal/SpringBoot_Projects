package com.constructorinj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.constructorinj.entity.Trainer;


//RestController annotation is used to create RESTful web services using Spring MVC
@RestController

//it is use constructor injection to get trainer
public class TrainerController {
	private Trainer trainer;

	public TrainerController(Trainer trainer) {
		super();
		this.trainer = trainer;
	}
	
	@GetMapping("/teach")
	//printing the constructor injection
	public String teach()
	{
		trainer.teach();
		
		return "Training completed sucessfully!";
	}

}


