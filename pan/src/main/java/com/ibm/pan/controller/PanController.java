package com.ibm.pan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.pan.service.PanService;
import com.ibm.pan.entity.*;

@RestController
public class PanController {
	@Autowired
	PanService panservice;
	
	@GetMapping("/pan")
	List<Pan> findAll(){
		return panservice.findAll();
	}
	
	@GetMapping("/pan/{id}")
	Pan findById(@PathVariable int id)
	{
		return panservice.findById(id);
		
	}
	@PutMapping("/pan")
	void update(@RequestBody Pan panentity)
	{
		 panservice.save(panentity);
		
	}
	
	@PostMapping("/pan")
	void save(@RequestBody Pan panentity)
	{
		 panservice.save(panentity);
		
	}
	@DeleteMapping("/pan/{id}")
	void deleteById(@PathVariable int id)
	{
		  panservice.deleteById(id);
		
	}
}
