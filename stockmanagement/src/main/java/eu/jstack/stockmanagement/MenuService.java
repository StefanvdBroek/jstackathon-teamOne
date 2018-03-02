package eu.jstack.stockmanagement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/menu")
public class MenuService {
    @RequestMapping("/meals")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Meal> getMeals() {
        List<Meal> meals = new ArrayList<>();
        meals.add(new Meal(UUID.fromString("b985bfc2-a64a-40e7-9aa3-6025f3434f6c"), "Spaghetti Bolognese", "Lorem ipsum dolor sit amet", "spaghetti.png"));
        meals.add(new Meal(UUID.fromString("7590840d-5de0-4712-a8b1-cc2528fec529"), "Burrito kip", "Consectetur adipiscing elit", "burrito.png"));
        meals.add(new Meal(UUID.fromString("66edde37-dc9a-4587-b204-337d37664e41"), "Roti", "Lorem ipsum dolor sit amet", "roti.png"));
        meals.add(new Meal(UUID.fromString("8216ff13-49df-4c8a-a26b-7a89cee513c8"), "Boerenkool met worst", "Consectetur adipiscing elit", "boerenkool.png"));
        meals.add(new Meal(UUID.fromString("4034f2db-7989-4563-aa73-50cd9199d9b7"), "Tournedos", "Jammie!", "tournedos.png"));
        return meals;
    }
}
