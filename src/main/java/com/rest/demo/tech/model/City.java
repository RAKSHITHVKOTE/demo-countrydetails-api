package com.rest.demo.tech.model;

public class City {
    private Long id;
    private String name;
    private Long countryId;
    private Long population;
    private String zipCode;
    private String description;

    public City(Long id, String name, Long countryId,
                Long population, String zipCode, String description) {
        this.id = id;
        this.name = name;
        this.countryId = countryId;
        this.population = population;
        this.zipCode = zipCode;
        this.description = description;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public Long getCountryId() { return countryId; }
}