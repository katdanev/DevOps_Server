package com.keyin.sprint1s4t8.api.classes.controller;

import model.Airport;
import model.City;
import model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CityService;

import java.util.List;

@RestController
@CrossOrigin
public class CityController {

    @Autowired
    private CityService cityService;

    // Retrieve City object by parameters
    @GetMapping("/city")
    public City city(@RequestParam(value = "id", required = false) Long id,
                     @RequestParam(value = "name", required = false) String name,
                     @RequestParam(value = "province", required = false) String province,
                     @RequestParam(value = "population", defaultValue = "0") int population) {

        return cityService.generateCity(id, name, province, population);
    }

    // Search for a City object by index
    @GetMapping("/city/{index}")
    public City getCity(@PathVariable Integer index) {
        return cityService.getCity(index);
    }

    // Retrieve all City objects
    @GetMapping("/cities")
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }

    // Create a new City object
    @PostMapping("/city")
    public City createCity(@RequestBody City newCity) {
        return cityService.createCity(newCity);
    }

    // Update an existing City object by index
    @PutMapping("/city/{index}")
    public City updateCity(@PathVariable Integer index, @RequestBody City updatedCity) {
        return cityService.updateCity(index, updatedCity);
    }

    // Delete a City object by index
    @DeleteMapping("/city/{index}")
    public void deleteCity(@PathVariable Integer index) {
        cityService.deleteCity(index);
    }

    // Retrieve list of airports in a city by index
    @GetMapping("/city/{index}/airports")
    public List<Airport> getAirportsInCity(@PathVariable Integer index) {
        return cityService.getAirportsInCity(index);
    }

    // Retrieve list of passengers in a city by index
    @GetMapping("/city/{index}/passengers")
    public List<Passenger> getPassengersInCity(@PathVariable Integer index) {
        return cityService.getPassengersInCity(index);
    }
}

