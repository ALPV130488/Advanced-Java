package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.Services;

@RestController
@RequestMapping("/product")//http:10.0.20.41:1010/product
public class Controller {
	
	@Autowired
	Services service;
	@PostMapping("/addproduct")//http//localhost:1010/product/addproduct
	public String addProduct(@RequestBody Product product)
	{
		return service.addProduct(product);
	}
	
	@PutMapping("/updateproduct")//http//localhost:1010/product/updateproduct
	public String updateProduct(@RequestBody Product product)
	{
		return service.updateProdcut(product);
	}
	
	@DeleteMapping("/deleteproduct/{pid}")
	public String deleteProduct(@PathVariable("pid") int productId)
	{
		return service.deleteProduct(productId);
	}
	
	@GetMapping("/getprodcut/{pid}")
	public Product getProduct(@PathVariable("pname") int productId)
	{
		return service.getProduct(productId);
	}
}
