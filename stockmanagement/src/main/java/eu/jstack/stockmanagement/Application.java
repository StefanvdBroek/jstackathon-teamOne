package eu.jstack.stockmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private MealInventory mealInventory;

    @Autowired
    private KafkaTemplate<String, String> template;

    @Override
    public void run(String... args) throws Exception {
        this.mealInventory.addMeals(Meal.MEAL_1, 20);
        this.mealInventory.addMeals(Meal.MEAL_2, 20);
        this.mealInventory.addMeals(Meal.MEAL_3, 20);
        this.mealInventory.addMeals(Meal.MEAL_4, 20);
        this.mealInventory.addMeals(Meal.MEAL_5, 20);
    }
}