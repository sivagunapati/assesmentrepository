package com.accenture.test.assesment;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.accenture.test.assesment.entites.Role;
import com.accenture.test.assesment.entites.Users;
import com.accenture.test.assesment.service.UserRoleCreateServiceImpl;

@SpringBootApplication
public class AssesmentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(AssesmentApplication.class,
				args);

		UserRoleCreateServiceImpl userRoleCreateService = applicationContext.getBean("userRoleCreateServiceImpl", UserRoleCreateServiceImpl.class);
		
		Role role = new Role();
		role.setRoleName("ADMIN");
		
		Set<Role> roleSet = new HashSet<Role>();
		roleSet.add(role);
		
		Users user = new Users();
		user.setActive(1);
		user.setEmail("test@gmail.com");
		user.setLastName("G");
		user.setName("siva");
		user.setPassword("siva");
		user.setRoles(roleSet);
		
		userRoleCreateService.createUser(user);
	}

}

