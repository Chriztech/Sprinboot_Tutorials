package com.example.demofirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sprinboot.first.app.FirstProjectApplication;
import com.sprinboot.first.app.Student;

@SpringBootApplication
public class DemofirstApplication {

	public static void main(String[] args) {
		//to get object
				ConfigurableApplicationContext context=SpringApplication.run(FirstProjectApplication.class, args);
				Student s=context.getBean(Student.class);
				s.show();
				System.out.println("welcome to boot");
				//normal way to create object
			    //Student s= new Student();
	}

}
