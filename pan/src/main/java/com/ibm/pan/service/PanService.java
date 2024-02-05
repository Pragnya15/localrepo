package com.ibm.pan.service;
import java.util.List;
import com.ibm.pan.entity.*;

public interface PanService {

	List<Pan> findAll();
	Pan findById(int id);
	void save(Pan panentity);
	void deleteById(int id);
}
