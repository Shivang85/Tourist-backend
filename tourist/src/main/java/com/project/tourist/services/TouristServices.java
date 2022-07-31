package com.project.tourist.services;
import java.util.List;
import com.project.tourist.entity.Tourist;
public interface TouristServices {
	
	public List<Tourist> getTourist();
	public Tourist addTourist(Tourist t);
	
}
