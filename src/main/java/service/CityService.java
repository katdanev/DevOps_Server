package service;

import model.Airport;
import model.City;
import model.Passenger;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CityService {

    private Map<Integer, City> cityMap = new HashMap<>();

    // Generate a City object with initial values
    public City generateCity(Long id, String name, String province, int population) {
        City city = new City();
        city.setId(id);
        city.setName(name);
        city.setProvince(province);
        city.setPopulation(population);
        city.setAirports(new ArrayList<>());  // Initialize airports list
        city.setPassengers(new ArrayList<>());  // Initialize passengers list

        return city;
    }

    // Get a City object by index
    public City getCity(Integer index) {
        return cityMap.get(index);
    }

    // Create a new City object
    public City createCity(City newCity) {
        cityMap.put(cityMap.size() + 1, newCity);
        return newCity;
    }

    // Update an existing City object
    public City updateCity(Integer index, City updatedCity) {
        if (cityMap.containsKey(index)) {
            cityMap.put(index, updatedCity);
            return updatedCity;
        } else {
            throw new RuntimeException("City not found with index: " + index);
        }
    }

    // Delete a City object by index
    public void deleteCity(Integer index) {
        if (cityMap.containsKey(index)) {
            cityMap.remove(index);
        } else {
            throw new RuntimeException("City not found with index: " + index);
        }
    }

    // Get all City objects
    public List<City> getAllCities() {
        return new ArrayList<>(cityMap.values());
    }

    // Get list of airports in a city by index
    public List<Airport> getAirportsInCity(Integer index) {
        City city = getCity(index);
        if (city != null) {
            return city.getAirports();
        } else {
            throw new RuntimeException("City not found with index: " + index);
        }
    }

    // Get list of passengers in a city by index
    public List<Passenger> getPassengersInCity(Integer index) {
        City city = getCity(index);
        if (city != null) {
            return city.getPassengers();
        } else {
            throw new RuntimeException("City not found with index: " + index);
        }
    }
}
