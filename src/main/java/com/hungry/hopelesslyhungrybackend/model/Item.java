package com.hungry.hopelesslyhungrybackend.model;

public class Item {
    private String name;
    private String description;

    // Constructors
    public Item() {}

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
