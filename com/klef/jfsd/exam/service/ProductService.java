package com.klef.jfsd.exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Product;

@Service
public interface ProductService {
	public List<Product> getAll();
}
