package com.hungry.hopelesslyhungrybackend.model;

import java.util.ArrayList;

public class Recipe {
    private int id;
    private String name;
    private String description;
    private String imageUrl;
    private String category;
    private ArrayList<String> ingredients;
    private ArrayList<String> steps;
    private String author;
    private int time;

    public Recipe() {}

    public Recipe(int id, String name, String description, String imageUrl, String category, ArrayList<String> ingredients, ArrayList<String> steps) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.category = category;
        this.ingredients = ingredients;
        this.steps = steps;
        this.author = author;
        this.time = time;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

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

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<String> getSteps() {
        return steps;
    }
    public void setSteps(ArrayList<String> steps) {
        this.steps = steps;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }


}
