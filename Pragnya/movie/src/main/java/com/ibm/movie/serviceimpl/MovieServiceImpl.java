package com.ibm.movie.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.movie.entity.Movie;
import com.ibm.movie.repo.MovieRepo;
import com.ibm.movie.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	MovieRepo movierepo;
	
	@Override
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return movierepo.findAll();
	}

	@Override
	public Movie findById(int id) {
		// TODO Auto-generated method stub
		return movierepo.findById(id).get();
	}

	@Override
	public void save(Movie movieentity) {
		// TODO Auto-generated method stub
		movierepo.save(movieentity);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		movierepo.deleteById(id);

	}
}