package com.accenture.test.assesment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.accenture.test.assesment.entites.Users;
import com.accenture.test.assesment.repository.UsersRepository;


@Service
public class UserRoleCreateServiceImpl implements UserRoleCreateService {
	
	 @Autowired
	    private UsersRepository usersRepository;

	@Override
	public Users createUser(Users user) {
		
		return usersRepository.save(user);
	}

}
