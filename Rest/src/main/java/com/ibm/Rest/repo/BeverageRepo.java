package com.ibm.Rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.Rest.entity.Beverage;

@Repository
public interface BeverageRepo extends JpaRepository<Beverage, Integer> {

}
