package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Laptop;

@RestController
@RequestMapping("/laptop")

public class LaptopController {
	Laptop lap;
	@PostMapping
	public  String createLaptop(@RequestBody Laptop lap) {
		
		this.lap=lap;
		return "Laptop object is created";
		
	}
	@GetMapping(value ="{srNo}")
	public  Laptop readLaptop(@PathVariable String srNo) {
		
		return lap;
		
	}
	@PutMapping
	public  String updateLaptop(@RequestBody Laptop lap) {
		this.lap=lap;
		
		
		return "laptop object is updated";
	}
	@DeleteMapping(value ="{srNo}")
	public  String deleteLaptop(@PathVariable String srNo) {
		lap=null;
		return "laptop object is deleted";
	}
	

}
