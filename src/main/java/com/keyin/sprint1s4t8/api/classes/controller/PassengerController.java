package com.keyin.sprint1s4t8.api.classes.controller;

import model.Aircraft;
import model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PassengerService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/passenger")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    //  GET all Passengers http://localhost:8080/passenger
    @GetMapping
    public List<Passenger> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    // GET Passengers by index http://localhost:8080/passenger/{index}
    @GetMapping("/{index}")
    public Passenger getPassenger(@PathVariable Integer index) {
        return passengerService.getPassenger(index);
    }

    // GET plane for Passenger http://localhost:8080/passenger/{index}/aircraft
    @GetMapping("/{index}/aircraft")
    public List<Aircraft> getAircraftForPassenger(@PathVariable Integer index) {
        return passengerService.getAircraftForPassenger(index);
    }

    // POST Passenger http://localhost:8080/passenger
    @PostMapping
    public Passenger createPassenger(@RequestBody Passenger newPassenger) {
        return passengerService.createPassenger(newPassenger);
    }

    //  PUT Passenger http://localhost:8080/passenger/{index}
    @PutMapping("/{index}")
    public Passenger updatePassenger(@PathVariable Integer index, @RequestBody Passenger updatedPassenger) {
        return passengerService.updatePassenger(index, updatedPassenger);
    }

    //  DELETE Passengers by index http://localhost:8080/passenger/{index}
    @DeleteMapping("/{index}")
    public void deletePassenger(@PathVariable Integer index) {
        passengerService.deletePassenger(index);
    }
}

