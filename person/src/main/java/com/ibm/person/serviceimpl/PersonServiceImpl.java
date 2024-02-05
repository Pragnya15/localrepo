package com.ibm.person.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.ibm.person.entity.PersonEntity;
import com.ibm.person.repo.PersonRepo;
import com.ibm.person.service.PersonService;
import com.ibm.person.vo.Pan;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	PersonRepo personRepo;
	
	@Override
	public List<PersonEntity> findAll() {
		// TODO Auto-generated method stub
		List<PersonEntity> personList=personRepo.findAll();
		 
		String baseUrl="http://localhost:8080/pan/";
		for(PersonEntity p:personList)
		{
			String url=baseUrl+p.getPanId();
			RestClient restClient=  RestClient.create(url);
			Pan pan = restClient.get() 
					  .uri(url) 
					  .retrieve() 
					  .body(Pan.class); 
			
			p.setPanNumber(pan.getPanNumber());
			//prodListOp.add(p);
			
		}
	 
		return personList;
		
	}

	@Override
	public PersonEntity findById(int id) {
		// TODO Auto-generated method stub
		PersonEntity p= personRepo.findById(id).get();
		
		String url="http://localhost:8080/pan/"+id;
 		RestClient restClient=  RestClient.create(url);
 
		Pan pan = restClient.get() 
				  .uri(url) 
				  .retrieve() 
				  .body(Pan.class); 
		p.setPanNumber(pan.getPanNumber());
		
		return p;
	}

	@Override
	public void save(PersonEntity Person) {
		// TODO Auto-generated method stub
		personRepo.save(Person);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

}
