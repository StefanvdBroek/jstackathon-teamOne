package eu.jstack.stockmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/menu")
public class MenuService {
    private Map<UUID, Meal> meals = Stream.of(Meal.MEAL_1, Meal.MEAL_2, Meal.MEAL_3, Meal.MEAL_4, Meal.MEAL_5)
            .collect(Collectors.toMap(m -> m.getId(), m -> m));

    @Autowired
    private MealInventory mealInventory;

    @RequestMapping("/meals")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Collection<Meal> getMeals() {
        return this.meals.values();
    }

    @RequestMapping("/meals/{mealId}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Meal getMeal(@PathVariable String mealId) {
        return this.meals.get(UUID.fromString(mealId));
    }

    @RequestMapping("/meals/{mealId}/inventory")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public int getInventory(@PathVariable String mealId) {
        return this.mealInventory.getMealInventory(UUID.fromString(mealId));
    }
}
