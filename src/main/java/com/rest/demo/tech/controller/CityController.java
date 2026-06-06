package com.rest.demo.tech.controller;

import com.rest.demo.tech.model.City;
import com.rest.demo.tech.service.CountryCityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cities")
public class CityController {

    private final CountryCityService service;

    public CityController(CountryCityService service) {
        this.service = service;
    }

    @GetMapping("/{cityId}")
    public City getCity(@PathVariable Long cityId) {
        return service.getCityById(cityId);
    }
}