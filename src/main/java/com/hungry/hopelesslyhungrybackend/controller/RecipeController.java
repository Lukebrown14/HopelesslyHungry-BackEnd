package com.hungry.hopelesslyhungrybackend.controller;


import com.hungry.hopelesslyhungrybackend.model.FavoriteRecipes;
import com.hungry.hopelesslyhungrybackend.model.Item;
import com.hungry.hopelesslyhungrybackend.model.Recipe;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

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

    @GetMapping("/chicken-soup")
    public Recipe getChickenSoup() {

        ArrayList<String> ingredients = new ArrayList<String>();
        ingredients.add("Chicken");
        ingredients.add("Water");
        ingredients.add("Potato");
        ingredients.add("Salt");

        ArrayList<String> steps = new ArrayList<String>();
        steps.add("Cook Chicken");
        steps.add("Add Potato's");
        steps.add("Add Salt");
        steps.add("Add Water");

        Recipe recipe = new Recipe();
        recipe.setId(1);
        recipe.setName("Chicken Soup");
        recipe.setDescription("The world's best soup");
        recipe.setIngredients(ingredients);
        recipe.setAuthor("Beth Benson");
        recipe.setSteps(steps);
        recipe.setCategory("Home");
        recipe.setTime(10);
        recipe.setImageUrl("http:localhost:5173/images/chicken-soup.png");

        return recipe;

    }



    }
