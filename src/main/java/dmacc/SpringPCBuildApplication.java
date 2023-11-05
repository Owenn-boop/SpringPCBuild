package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.PCBuild;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PCBuildRepository;

/**
* @author Owennn - osherrmann
* CIS175 - Fall 2023
* Nov 4, 2023
* A little description:
* 
* This is a Spring application that tracks Computer builds. You can input the amount of ram you have
* as well as the name of the graphics card and clock speed of your PC. There is also an option
* to mention whether your motherboard has build in wifi or not (some PCs have wifi, while
* mine does not).
*/

@SpringBootApplication
public class SpringPCBuildApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringPCBuildApplication.class, args);
	}
	
	@Autowired
	PCBuildRepository repo;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using an existing bean
		PCBuild c = appContext.getBean("pcBuild", PCBuild.class);
		c.setGigsOfRam(64);
		repo.save(c);
		
		//Create a bean to use - not managed by Spring
		PCBuild d = new PCBuild("Owenn's PC", 64, "RTX 2060", 2.9f, false);
		repo.save(d);
		
		List<PCBuild> allMyContacts = repo.findAll();
		for(PCBuild people: allMyContacts) {
			System.out.println(people.toString());
		}
		
		//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
		((AbstractApplicationContext) appContext).close();
	
	}

}
