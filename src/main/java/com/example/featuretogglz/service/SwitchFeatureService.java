package com.example.featuretogglz.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.featuretogglz.dto.Product;

@Service
public class SwitchFeatureService {

	public List<Product> getAllProducts() {
		return Stream.of(new Product(1, "mobile", 50000), 
						 new Product(2, "headphone", 2000),
						 new Product(3, "watch", 14999), 
						 new Product(4, "glass", 999))
				.collect(Collectors.toList());
	}
}
