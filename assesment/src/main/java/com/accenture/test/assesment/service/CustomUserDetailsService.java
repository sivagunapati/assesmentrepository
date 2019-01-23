package com.accenture.test.assesment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.accenture.test.assesment.entites.CustomUserDetails;
import com.accenture.test.assesment.entites.Users;
import com.accenture.test.assesment.repository.UsersRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
Optional<Users> optionalUsers = usersRepository.findByName(username);
        
        if(!optionalUsers.isPresent()) {
        	throw new UsernameNotFoundException("Username not found");
        	
        }
        
        Optional<UserDetails> userdetOptional = optionalUsers.map(CustomUserDetails::new);
        
        UserDetails userDetails = null;
        if(userdetOptional.isPresent()) {
        	userDetails = userdetOptional.get();
        }
      
        return userDetails;
        
    }
}
