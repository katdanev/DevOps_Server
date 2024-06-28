
package com.keyin.sprint1s4t8.api.classes.controller;

import jakarta.websocket.server.PathParam;
import model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CityService;
import java.util.List;

@RestController
@CrossOrigin

public class CityController {

    @Autowired
    private CityService cityService;

    // Get City with param
    // http://localhost:8080/town
    // http://localhost:8080/town?name=Toronto&id=1&province=Ontario&population=3000000     - request in Postman
    @GetMapping("/town")
    public City city(@RequestParam(value = "id", required = false) Long id,
                     @RequestParam(value = "name", required = false) String name,
                     @RequestParam(value = "province", required = false) String province,
                     @RequestParam(value = "population", required = false, defaultValue = "0") int population) {

        return cityService.generateCity(id, name, province, population);
    }

    // http://localhost:8080/search_city?index=1   search by index
    @GetMapping("/search_city")
    public City searchtCity (@RequestParam(value="index", required = false) Integer index) {
        return cityService.getCity(index);
    }

    // http://localhost:8080/city/3
    @GetMapping("/city/{index}")
    public City getCity (@PathVariable Integer index) {
        return cityService.getCity(index);
    }

    // http://localhost:8080/cities - get a list of cities
    @GetMapping("/cities")
    public List<City> getAllCities(){
        return cityService.getAllCities();
    }

    // http://localhost:8080/city post a new json city object
    @PostMapping("/city")
    public City createCity(@RequestBody City newCity){
        return cityService.createCity(newCity);

    }
    // http://localhost:8080/city/1 put new value in created json object
    @PutMapping("/city/{index}")
    public City updateCity(@PathVariable Integer index, @RequestBody City updatedCity) {
        return cityService.updateCity(index, updatedCity);
    }

    // http://localhost:8080/city/3 - delete a specific json object by index
    @DeleteMapping("/city/{index}")
    public void deleteCity(@PathVariable Integer index) {
        cityService.deleteCity(index);
    }

}



