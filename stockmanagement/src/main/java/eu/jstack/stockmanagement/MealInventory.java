package eu.jstack.stockmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
@ApplicationScope
public class MealInventory {
    private Map<UUID, Integer> inventory = new HashMap<>();

    @Autowired
    private KafkaTemplate<String, String> template;

    public void addMeals(UUID mealId, int numberOfMeals) {
        Integer newValue = this.inventory.compute(mealId, (k, v) -> v != null ? v + numberOfMeals : numberOfMeals);
        this.template.send("inventory", mealId.toString() + "," + newValue);
    }

    public void addMeals(Meal meal, int numberOfMeals) {
        this.addMeals(meal.getId(), numberOfMeals);
    }

    public int getMealInventory(UUID mealId) {
        return this.inventory.getOrDefault(mealId, 0);
    }

    public void orderMeal(UUID mealId) {
        Integer newValue = this.inventory.computeIfPresent(mealId, (k, v) -> v--);
        this.template.send("inventory", mealId.toString() + "," + newValue);
    }
}
