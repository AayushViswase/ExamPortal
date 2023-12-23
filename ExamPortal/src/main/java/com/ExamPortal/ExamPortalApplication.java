package com.ExamPortal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ExamPortal.Service.UserService;

@SpringBootApplication
public class ExamPortalApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(ExamPortalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Staring code");
		//		User user = new User();
		//		user.setFirstName("Aayush");
		//		user.setLastName("Viswase");
		//		user.setUserName("AayushViswase");
		//		user.setPassword("aayush");
		//		user.setEmail("aayush@gmail.com");
		//		user.setProfile("deafult.png");
		//
		//		Role role1=new Role();
		//		role1.setRoleId(44L);
		//		role1.setRoleName("ADMIN");
		//
		//		Set<UserRole> userRoleSet=new HashSet<>();
		//		UserRole userRole = new UserRole();
		//		userRole.setRole(role1);
		//		userRole.setUser(user);
		//		userRoleSet.add(userRole);
		//
		//		User user1 = this.userService.createUser(user, userRoleSet);
		//		System.out.println(user1.getUserName());

	}

}
