package com.ibm.Rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.Rest.entity.Beverage;
import com.ibm.Rest.repo.BeverageRepo;
import com.ibm.Rest.service.BeverageService;

@Service
public class BeverageImpl implements BeverageService {

	@Autowired
	BeverageRepo beverageRepo;
	
	
	@Override
	public List<Beverage> findAll() {
		// TODO Auto-generated method stub
		return beverageRepo.findAll();
	}

	@Override
	public Beverage findById(int id) {
		 
		return beverageRepo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		 
		beverageRepo.deleteById(id);
	}

	@Override
	public void save(Beverage b) {
		 
		beverageRepo.save(b);
	}

}