package com.example.springmongodbdealership.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Data
@NoArgsConstructor
@Document
@JsonInclude(Include.NON_NULL)
public class Car {
	@Id
	private String id;
	private String make;
	private String model;
	private int year;
	private Double price;

}
