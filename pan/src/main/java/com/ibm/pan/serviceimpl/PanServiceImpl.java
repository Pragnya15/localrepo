package com.ibm.pan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.pan.entity.Pan;
import com.ibm.pan.service.PanService;
import com.ibm.pan.repo.PanRepo;


@Service
public class PanServiceImpl implements PanService {
	@Autowired
	PanRepo panrepo;
	
	@Override
	public List<Pan> findAll() {
		// TODO Auto-generated method stub
		return panrepo.findAll();
	}

	@Override
	public Pan findById(int id) {
		// TODO Auto-generated method stub
		return panrepo.findById(id).get();
	}

	@Override
	public void save(Pan panentity) {
		// TODO Auto-generated method stub
		panrepo.save(panentity);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		panrepo.deleteById(id);

	}

}
