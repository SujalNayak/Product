package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.ProductBean;
import com.dao.ProductDao;

@Controller
public class ProductController {
	
	@Autowired
	ProductDao productDao;
	
	
	@GetMapping("/product")
	public String product(Model model) {
		model.addAttribute("product", new ProductBean());
		System.out.println("Product()");
		return "Productjsp"; 
	
	}
	@PostMapping("/saveproduct")
	public String saveproduct(@jakarta.validation.Valid @ModelAttribute("product") ProductBean product, BindingResult result, Model model) {
		System.out.println(result.hasErrors());
		model.addAttribute("product", product);

		if (result.hasErrors()) {
			System.out.println(result.getAllErrors());
			return "Productjsp";
		} else {
			
			productDao.addProduct(product);
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getPrice());
			System.out.println(product.getQty());
			System.out.println(product.getCty());
		}
		return "Home";
}
}
