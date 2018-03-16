package com.csc.service;

import java.util.ArrayList;

import com.csc.model.AllergyDTO;

public interface AllergyService {

	public void save(AllergyDTO u);
	public void update(AllergyDTO u);
	public ArrayList<AllergyDTO> getAll();
	public ArrayList<AllergyDTO> getAllById(int id);
	public void delete(AllergyDTO u);
}
