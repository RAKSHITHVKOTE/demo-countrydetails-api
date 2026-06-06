package com.rest.demo.tech.service;

import com.rest.demo.tech.model.City;
import com.rest.demo.tech.model.Country;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CountryCityService {

    private final List<Country> countries = List.of(
            new Country(1L, "India"),
            new Country(2L, "Germany"),
            new Country(3L, "Luxembourg")
    );

    private final List<City> cities = List.of(
            new City(1L, "Bangalore", 1L, 12000000L, "560001", "Tech City"),
            new City(2L, "Hyderabad", 1L, 9000000L, "500001", "IT Hub"),
            new City(3L, "Berlin", 2L, 3500000L, "10115", "Capital"),
            new City(4L, "Hamburg", 2L, 1800000L, "20095", "Port City"),
            new City(5L, "Luxembourg City", 3L, 130000L, "L-1111", "Capital")
    );

    public List<Country> getCountries() {
        return countries;
    }

    public List<City> getCitiesByCountry(Long countryId) {
        return cities.stream()
                .filter(c -> c.getCountryId().equals(countryId))
                .collect(Collectors.toList());
    }

    public City getCityById(Long cityId) {
        return cities.stream()
                .filter(c -> c.getId().equals(cityId))
                .findFirst()
                .orElse(null);
    }
}