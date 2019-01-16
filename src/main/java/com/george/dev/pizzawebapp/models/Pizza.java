package com.george.dev.pizzawebapp.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

/**
 * Created by George on 16/01/2019
 */

public class Pizza {

    private Long id;

    private Date createdAt;

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @Size(min = 1, message = "Must choose at least 1 ingredient")
    private List<String> ingredients;
}
