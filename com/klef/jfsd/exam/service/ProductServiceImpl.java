package com.klef.jfsd.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.klef.jfsd.exam.model.Product;
import com.klef.jfsd.exam.repository.Repo;

public class ProductServiceImpl implements ProductService{

	@Autowired
	private Repo repo;
	
	@Override
	public List<Product> getAll() {
		return repo.findAll();
	}

}
