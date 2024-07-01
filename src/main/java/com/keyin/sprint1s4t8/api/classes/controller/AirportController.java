package com.keyin.sprint1s4t8.api.classes.controller;

import model.Airport;
import model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.AirportService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/airport")
public class AirportController {

    @Autowired
    private AirportService airportService;

    // Get Airport with params
    @PostMapping("/generate")
    public Airport airport(@RequestParam(value = "id", required = false) int id,
                           @RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "code", required = false) String code,
                           @RequestBody City city) {
        return airportService.generateAirport(id, name, code, city);
    }

    // Get airport by ID
    @GetMapping("/{id}")
    public Airport getAirport(@PathVariable int id) {
        return airportService.getAirport(id);
    }

    // Get all airports
    @GetMapping
    public List<Airport> getAllAirports(@RequestParam(value = "city", required = false) String cityName) {
        if (cityName != null) {
            return airportService.getAirportsByCity(cityName);
        } else {
            return airportService.getAllAirports();
        }
    }

    // Create a new airport
    @PostMapping
    public Airport createAirport(@RequestBody Airport newAirport) {
        return airportService.createAirport(newAirport);
    }

    // Update an airport by ID
    @PutMapping("/{id}")
    public Airport updateAirport(@PathVariable int id, @RequestBody Airport updatedAirport) {
        return airportService.updateAirport(id, updatedAirport);
    }

    // Delete an airport by ID
    @DeleteMapping("/{id}")
    public void deleteAirport(@PathVariable int id) {
        airportService.deleteAirport(id);
    }
}
