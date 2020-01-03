package stream;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Dish {
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                '}';
    }


    public boolean printOverCalrories() {
        System.out.println("filtering " + this.getCalories());
        return this.getCalories() > 300;
    }


    public enum Type { MEAT, FISH, OTHER }
}