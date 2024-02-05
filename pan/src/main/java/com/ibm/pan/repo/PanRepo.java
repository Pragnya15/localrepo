package com.ibm.pan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.pan.entity.Pan;

@Repository
public interface PanRepo extends JpaRepository<Pan, Integer> {

}
