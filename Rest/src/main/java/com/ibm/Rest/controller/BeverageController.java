package com.ibm.Rest.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.Rest.entity.Beverage;
import com.ibm.Rest.service.BeverageService;

@RestController
public class BeverageController {
	@Autowired
	BeverageService beverageService;
	
	Log logger= LogFactory.getLog(BeverageController.class) ;
	
	@GetMapping("/movie")
	List<Beverage> findAll()
	{
		logger.info("--findAll--");
		return beverageService.findAll();
		
		
	}
	@GetMapping("/movie/{id}")
	Beverage  findById(@PathVariable int id)
	{
		logger.info("--findById--");
		return beverageService.findById(id);
		
		
	}
	
	@PostMapping("/movie")
	void  create(@RequestBody Beverage b)
	{
		logger.info("--create--"); 
		beverageService.save(b);
		
	}
	
	@PutMapping("/movie")
	void  update(@RequestBody Beverage m)
	{
		logger.info("--update--"); 
		beverageService.save(m);
		
	}
	
	
	@DeleteMapping("/movie/{id}")
	void   deleteById(@PathVariable int id)
	{
		
		  logger.info("--deleteById--"); 
		  beverageService.deleteById(id);
		
		
	}
}
