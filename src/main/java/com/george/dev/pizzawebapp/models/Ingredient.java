package com.george.dev.pizzawebapp.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Created by George on 08/01/2019
 */

@Data
@RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final String type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}
