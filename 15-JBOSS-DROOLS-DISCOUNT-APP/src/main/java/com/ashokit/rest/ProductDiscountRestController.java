package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.model.Product;
import com.ashokit.service.DiscountFinderService;

@RestController
public class ProductDiscountRestController {
	
	@Autowired
	private DiscountFinderService service;

	
	@GetMapping(
			value = "/discount/{type}",
			produces = {"application/xml","application/json"}
	)
	public ResponseEntity<Product> getDiscount(@PathVariable("type") String productType) {
		Double discount = null;
		
		try {
			discount = service.fireDiscountRules(productType);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//preparing response
		Product p = new Product();
		p.setProductType(productType);
		p.setDiscount(discount);

		return new ResponseEntity<Product>(p, HttpStatus.OK);
	}
}
