package com.keyin.sprint1s4t8.api.classes.controller;

import model.Aircraft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.AircraftService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/aircraft")
public class AircraftController {

    @Autowired
    private AircraftService aircraftService;

    // Get all aircrafts  http://localhost:8080/aircraft
    @GetMapping
    public List<Aircraft> getAllAircrafts() {
        return aircraftService.getAllAircrafts();
    }

    // Get aircraft by index  http://localhost:8080/aircraft/{index}
    @GetMapping("/{index}")
    public Aircraft getAircraft(@PathVariable int index) {
        return aircraftService.getAircraft(index);
    }
    // Create new aircraft
    @PostMapping
    public Aircraft createAircraft(@RequestBody Aircraft newAircraft) {
        return aircraftService.createAircraft(newAircraft);
    }

    // Edit an aircraft http://localhost:8080/aircraft/{index}
    @PutMapping("/{index}")
    public Aircraft updateAircraft(@PathVariable int index, @RequestBody Aircraft updatedAircraft) {
        return aircraftService.updateAircraft(index, updatedAircraft);
    }

    //  DELETE an aircraft  http://localhost:8080/aircraft/{index}
    @DeleteMapping("/{index}")
    public void deleteAircraft(@PathVariable int index) {
        aircraftService.deleteAircraft(index);
    }
}

