package com.keyin.sprint1s4t8.api.classes.controller;

import model.Airport;
import model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.AirportService;

import java.util.List;

@RestController
@CrossOrigin
public class AirportController {

    @Autowired
    private AirportService airportService;

    // Get Airport with params
    // http://localhost:8080/airport
    // http://localhost:8080/airport?id=1&name=Heathrow&code=LHR&cityId=1&cityName=London&cityProvince=Greater London&cityPopulation=8900000
    @GetMapping("/airport")
    public Airport airport(@RequestParam(value = "id", required = false) int id,
                           @RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "code", required = false) String code,
                           @RequestParam(value = "cityId", required = false) Long cityId,
                           @RequestParam(value = "cityName", required = false) String cityName,
                           @RequestParam(value = "cityProvince", required = false) String cityProvince,
                           @RequestParam(value = "cityPopulation", required = false, defaultValue = "0") int cityPopulation) {

        City city = new City(cityId, cityName, cityProvince, cityPopulation);
        return airportService.generateAirport(id, name, code, city);
    }

    // http://localhost:8080/airport/1
    @GetMapping("/airport/{id}")
    public Airport getAirport(@PathVariable int id) {
        return airportService.getAirport(id);
    }

    // http://localhost:8080/airports - get a list of airports
    @GetMapping("/airports")
    public List<Airport> getAllAirports(@RequestParam(value = "city", required = false) String cityName) {
        if (cityName != null) {
            return airportService.getAirportsByCity(cityName);
        } else {
            return airportService.getAllAirports();
        }
    }


    // http://localhost:8080/airport - post a new json airport object
    @PostMapping("/airport")
    public Airport createAirport(@RequestBody Airport newAirport) {
        return airportService.createAirport(newAirport);
    }

    // http://localhost:8080/airport/1 - put new value in created json object
    @PutMapping("/airport/{id}")
    public Airport updateAirport(@PathVariable int id, @RequestBody Airport updatedAirport) {
        return airportService.updateAirport(id, updatedAirport);
    }

    // http://localhost:8080/airport/1 - delete a specific json object by id
//    @DeleteMapping("/airport/{id}")
//    public void deleteAirport(@PathVariable int id) {
//        airportService.deleteAirport(id);
   // }
}
