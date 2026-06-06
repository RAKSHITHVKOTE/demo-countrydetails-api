package com.rest.demo.tech.controller;

import com.rest.demo.tech.dto.PagedResponse;
import com.rest.demo.tech.model.City;
import com.rest.demo.tech.model.Country;
import com.rest.demo.tech.service.CountryCityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryCityService service;

    public CountryController(CountryCityService service) {
        this.service = service;
    }

    @GetMapping
    public List<Country> getCountries() {
        return service.getCountries();
    }

    @GetMapping("/{countryId}/cities")
    public PagedResponse<City> getCities(
            @PathVariable Long countryId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "2") int size
    ) {

        List<City> all = service.getCitiesByCountry(countryId);

        int start = page * size;
        int end = Math.min(start + size, all.size());

        List<City> paged = (start >= all.size()) ? List.of() : all.subList(start, end);

        int totalPages = (int) Math.ceil((double) all.size() / size);

        return new PagedResponse<>(paged, page, size, all.size(), totalPages);
    }
}