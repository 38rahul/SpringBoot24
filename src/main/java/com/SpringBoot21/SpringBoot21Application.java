package com.SpringBoot21;

import com.SpringBoot21.Repository.UserRepo;
import com.SpringBoot21.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot21Application  implements CommandLineRunner {

	@Autowired
	private UserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot21Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User firstUser = new User(11,"Surbhi Kumari", 27);
		User secondUser = new User(12,"Annapurna kumari", 27);

		userRepo.save(firstUser);
		userRepo.save(secondUser);

	}
}
