package service;

import model.Airport;
import model.City;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirportService {
    private List<Airport> airports = new ArrayList<>();

    public Airport generateAirport(int id, String name, String code, City city) {
        Airport airport = new Airport(id, name, code, city);
        airports.add(airport);
        return airport;
    }

    public Airport getAirport(int id) {
        return airports.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }

    public List<Airport> getAllAirports() {
        return airports;
    }

    public Airport createAirport(Airport newAirport) {
        airports.add(newAirport);
        return newAirport;
    }

    public Airport updateAirport(int id, Airport updatedAirport) {
        for (int i = 0; i < airports.size(); i++) {
            if (airports.get(i).getId() == id) {
                airports.set(i, updatedAirport);
                return updatedAirport;
            }
        }
        return null;
    }

    public void deleteAirport(int id) {
        airports.removeIf(airport -> airport.getId() == id);
    }

    public List<Airport> getAirportsByCity(String cityName) {
        List<Airport> airportsInCity = new ArrayList<>();
        for (Airport airport : airports) {
            if (airport.getCity() != null && airport.getCity().getName().equalsIgnoreCase(cityName)) {
                airportsInCity.add(airport);
            }
        }
        return airportsInCity;
    }
}

