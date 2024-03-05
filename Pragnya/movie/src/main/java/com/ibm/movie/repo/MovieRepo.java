package com.ibm.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.movie.entity.Movie;



@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

}
