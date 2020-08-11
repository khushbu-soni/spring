package com.crud.service;
import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.jpa.repository.UserRepository;
import com.crud.model.User;

@Service
@Transactional
public class UserService {

	
	    @Autowired
	    private UserRepository repo;
	     
	    public List<User> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(User product) {
	        repo.save(product);
	    }
	     
	    public User get(Integer id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(Integer id) {
	        repo.deleteById(id);
	    }
	}

