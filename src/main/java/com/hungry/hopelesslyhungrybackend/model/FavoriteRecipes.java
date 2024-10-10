package com.hungry.hopelesslyhungrybackend.model;

import java.util.ArrayList;
import java.util.List;

public class FavoriteRecipes {
    private List<Item> items;

    // Constructors
    public FavoriteRecipes() {
        this.items = new ArrayList<>();
    }

    public FavoriteRecipes(List<Item> items) {
        this.items = items;
    }

    // Getter and Setter for the recipes list
    public List<Item> getRecipes() {
        return items;
    }

    public void setRecipes(List<Item> items) {
        this.items = items;
    }

    // Add a single recipe to the list
    public void addRecipe(Item item) {
        this.items.add(item);
    }
}

