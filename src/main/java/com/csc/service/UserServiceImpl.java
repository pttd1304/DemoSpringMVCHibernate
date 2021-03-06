package com.csc.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc.dao.UserDAO;
import com.csc.model.PersonDTO;
import com.csc.model.UserDTO;


@Service
public class UserServiceImpl implements UserService {

	UserDAO u;
	

	public UserDAO getU() {
		return u;
	}

	@Autowired
	public void setU(UserDAO u) {
		this.u = u;
	}

	public void save(UserDTO u) {
		getU().save(u);
	}
	public void update(UserDTO u) {
		getU().update(u);
	}

	@Override
	public ArrayList<UserDTO> getAll() {
		return getU().getAll();
	}
	@Override
	public UserDTO checkUser(String uname) {
		return getU().checkUser(uname);
	}
	@Override
	public void delete(UserDTO u) {
		getU().delete(u);
		
	}


	
}
