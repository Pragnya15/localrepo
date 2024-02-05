package com.ibm.person.service;
import java.util.List;
import com.ibm.person.entity.*;

public interface PersonService {
		List<PersonEntity> findAll();
		PersonEntity findById(int id);
		void save(PersonEntity Person);
		void deleteById(int id);
		
	
}
