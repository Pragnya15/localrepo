package com.ibm.movie.service;

import java.util.List;

import com.ibm.movie.entity.Movie;



public interface MovieService {

	List<Movie> findAll();
	Movie findById(int id);
	void save(Movie panentity);
	void deleteById(int id);
}

