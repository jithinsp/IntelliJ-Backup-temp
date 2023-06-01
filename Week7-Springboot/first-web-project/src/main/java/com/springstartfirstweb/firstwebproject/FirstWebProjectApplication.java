package com.springstartfirstweb.firstwebproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class FirstWebProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstWebProjectApplication.class, args);
		System.out.println("First spring project");
	}
	//To return hello and show it on the main page
	@GetMapping("/")
	public String greet(){
		return "hello";
	}
	//to direct to http://localhost:8080/greeting
	@GetMapping("/greeting")
	public GreetResponse greeting(){
		return new GreetResponse("Hello",
				List.of("Java","Python"),
				new Person("Jithin",30,30_000)
		);
	}//return new GreetResponse("Hello") Returning a json object {"greeting":"Hello"}
//	{
//		"greeting": "Hello",
//			"favProgrammingLanguages": [
//		"Java",
//				"Python"
//  ],
//		"person": {
//		"name": "Jithin"
//	}
//	}

	record Person(String name,
				  int age,
				   double savings
	){
	}
	record GreetResponse(String greeting,
						 List<String> favProgrammingLanguages,
						 Person person
	){
	}

}
