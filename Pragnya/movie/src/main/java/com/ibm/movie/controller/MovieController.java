package com.ibm.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.movie.entity.Movie;
import com.ibm.movie.service.MovieService;



@RestController
public class MovieController {
	@Autowired
	MovieService movieservice;
	
	@GetMapping("/movie")
	List<Movie> findAll(){
		return movieservice.findAll();
	}
	
	@GetMapping("/movie/{id}")
	Movie findById(@PathVariable int id)
	{
		return movieservice.findById(id);
		
	}
	@PutMapping("/movie")
	void update(@RequestBody Movie movieentity)
	{
		movieservice.save(movieentity);
		
	}
	
	@PostMapping("/movie")
	void save(@RequestBody Movie movieentity)
	{
		movieservice.save(movieentity);
		
	}
	@DeleteMapping("/movie/{id}")
	void deleteById(@PathVariable int id)
	{
		movieservice.deleteById(id);
		
	}
	
}