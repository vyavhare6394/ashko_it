package com.ashokit.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="Product")
public class Product {

	private String productType;
	private Double discount;

}
