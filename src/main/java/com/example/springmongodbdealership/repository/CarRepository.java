package com.example.springmongodbdealership.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.springmongodbdealership.domain.Car;

public interface CarRepository extends MongoRepository<Car, String> {

	List<Car> findByMake(String make);
	
	@Query(value="{'make':?0}", fields="{price : 0, _id : 0}")
	List<Car> getCarsForSale(String make);

}
