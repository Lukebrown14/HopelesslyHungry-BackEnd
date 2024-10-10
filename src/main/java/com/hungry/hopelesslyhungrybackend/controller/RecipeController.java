package com.hungry.hopelesslyhungrybackend.controller;


import com.hungry.hopelesslyhungrybackend.model.FavoriteRecipes;
import com.hungry.hopelesslyhungrybackend.model.Item;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipes")
@CrossOrigin(origins = "http://localhost:5173/")
public class RecipeController {

    @GetMapping("/favorite-recipe")
    public FavoriteRecipes getFavoriteRecipes() {
        FavoriteRecipes favRecipes = new FavoriteRecipes();

        //Add multiple recipes
        favRecipes.addRecipe(new Item("Chicken Soup", "The world's best soup"));
        favRecipes.addRecipe(new Item("Spaghetti Bolognese", "A classic Italian dish"));
        favRecipes.addRecipe(new Item("Grilled Cheese", "Simple and delicious"));

        // Return the favorite recipes object
        return favRecipes;
    }



    }
