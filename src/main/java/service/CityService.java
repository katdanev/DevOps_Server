
package service;

import model.City;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CityService {

    private Map<Integer, City> cityMap = new HashMap<Integer, City>();

    public City generateCity(Long id, String name, String province, int population) {

        City city = new City();
        city.setId(id);
        city.setName(name);
        city.setProvince(province);
        city.setPopulation(population);

        return city;
    }

    public City getCity(Integer index) {
        return cityMap.get(index);
    }

    public City createCity(City newCity) {
        cityMap.put(cityMap.size() + 1, newCity);

        return newCity;
    }

    public City updateCity(Integer index, City updatedCity) {
        if (cityMap.containsKey(index)) {
            cityMap.put(index, updatedCity);
            return updatedCity;
        } else {
            throw new RuntimeException("City not found with index: " + index);
        }
    }

    public void deleteCity(Integer index) {
        if (cityMap.containsKey(index)) {
            cityMap.remove(index);
        } else {
            throw new RuntimeException("City not found with index: " + index);
        }
    }

    public List<City> getAllCities() {
        return List.copyOf(cityMap.values());
    }
}


