package com.example.springmongodbdealership.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Document
@JsonInclude(Include.NON_NULL)
public class Car {
	@Id
	private String id;
	private String make;
	private String model;
	private int year;
	private Double price;
	
	
	public Car(String id, String make, String model, int year, Double price) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	public Car() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

}
