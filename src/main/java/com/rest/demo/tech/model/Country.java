package com.rest.demo.tech.model;

public class Country {
    private Long id;
    private String name;

    public Country(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
}