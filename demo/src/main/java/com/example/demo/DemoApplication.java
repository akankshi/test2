package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.example.model.User;
import com.example.service.UserService;

@SpringBootApplication(scanBasePackages={"com.example.service","com.example.repository"})
@PropertySource(value="classpath:config.properties")
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	    User user= new User();
	    user.setUserId("ak.02");
	    user.setPwd("ppp");
	    user.setName("akanksha");
	    user.setEmail("93.ak@gmail.com");
	    user.setContact("94393");
	    
	    String res=userService.registerUser(user);
	/*    System.out.println(env.getProperty(res));
	    System.out.println(env.getProperty("server.port"));
	    System.out.println(env.getProperty("logging.level.root"));
	    */
	    
		
	}
	
	
}
