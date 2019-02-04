package com.example.springmongodbdealership.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmongodbdealership.domain.Car;
import com.example.springmongodbdealership.repository.CarRepository;

@RestController
@RequestMapping(value = "/dealership")
public class CarController {

	@Autowired
	CarRepository carRepository;

	@GetMapping(value = "/cars")
	public List<Car> getAllCars() {
		return carRepository.findAll();
	}

	// Filtering by make
	@GetMapping(value = "/cars/{make}")
	public List<Car> findCarsByMake(@PathVariable("make") String make) {
		return carRepository.findByMake(make);
	}
	
	@GetMapping(value = "/cars1/{make}")
	public List<Car> getCarsForSale(@PathVariable("make") String make) {
		return carRepository.getCarsForSale(make);
	}

	@PostMapping(value = "/cars")
	public Car addCar(@RequestBody Car car) {
		return carRepository.save(car);
	}

	@PutMapping(value = "/cars/{id}")
	public Car updateCar(@PathVariable("id") String id, @RequestBody Car car) {
		if (carRepository.existsById(id))
			return carRepository.save(car);
		return null;
	}

	@DeleteMapping(value = "/cars/{id}")
	public void deleteCar(@PathVariable String id) {
		carRepository.deleteById(id);
	}
	
	

}
