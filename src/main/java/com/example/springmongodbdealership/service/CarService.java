package com.example.springmongodbdealership.service;

import com.example.springmongodbdealership.domain.Car;
import com.example.springmongodbdealership.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public List<Car> findByMake(String make) {
        return carRepository.findByMake(make);
    }

    /*public List<Car> getCarsForSale(String make) {
        return carRepository.getCarsForSale(make);
    }*/

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public Optional<Car> findById(String id) {
        return carRepository.findById(id);
    }

    public void deleteById(String id) {
        carRepository.deleteById(id);
    }
}
