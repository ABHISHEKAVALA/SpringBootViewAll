package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Product;
import com.klef.jfsd.exam.repository.Repo;


@RestController
@RequestMapping("products")
public class Controller1 {

	@Autowired
	private Repo repo;
	
	
	@GetMapping("/viewall")
	public List<Product> viewAll(){
		return repo.findAll();
	}
	
}
