package com.project.tourist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.project.tourist.entity.Tourist;
import com.project.tourist.repository.TouristRepository;

@Service
public class TouristServicesImpl implements TouristServices {
	@Autowired
	private TouristRepository tr;
	@Override
	public List<Tourist> getTourist() {
		return tr.findAll(Sort.by(Sort.Direction.DESC, "fname" ,"lname"));
	}
	@Override
	public Tourist addTourist(Tourist t) {
		return tr.save(t);
	}

}

