package com.george.dev.pizzawebapp.repository;


import com.george.dev.pizzawebapp.models.Ingredient;

/**
 * Created by George on 11/01/2019
 */

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
