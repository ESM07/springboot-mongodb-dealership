package com.example.springmongodbdealership.controller;

import java.util.List;


import com.example.springmongodbdealership.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmongodbdealership.domain.Car;

@RestController
@RequestMapping(value = "/dealership")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public List<Car> getAllCars() {
        return carService.findAll();
    }

    // Filtering by make
    @GetMapping(value = "/cars/{make}")
    public List<Car> findCarsByMake(@PathVariable("make") String make) throws Exception {

        if (carService.findByMake(make).size() == 0) {
            throw new Exception("There are no cars on the list");
        }

        return carService.findByMake(make);
    }
	
	/*@GetMapping(value = "/cars1/{make}")
	public List<Car> getCarsForSale(@PathVariable("make") String make) {
		return carService.getCarsForSale(make);
	}*/

    @PostMapping(value = "/cars")
    public Car addCar(@RequestBody Car car) {
        return carService.save(car);
    }

    @DeleteMapping(value = "/cars/{id}")
    public void deleteCar(@PathVariable String id) {
        carService.deleteById(id);
    }

}
