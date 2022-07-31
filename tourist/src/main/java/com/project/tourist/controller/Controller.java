package com.project.tourist.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.tourist.entity.Tourist;
import com.project.tourist.services.TouristServices;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/tourists")
public class Controller {
	@Autowired
	private TouristServices ts;
	
	@GetMapping("/get")
	public List<Tourist> gettourist(){
		return ts.getTourist();
	}
	@PostMapping("/add")
	public Tourist addtourist(@RequestBody Tourist t) {
		return ts.addTourist(t);
	}
	
}




