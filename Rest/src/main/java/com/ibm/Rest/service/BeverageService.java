package com.ibm.Rest.service;

import java.util.List;

import com.ibm.Rest.entity.Beverage;

public interface BeverageService {
	List<Beverage> findAll();
	Beverage findById(int id);
	void deleteById(int id);
	void save(Beverage b);
}
