package eu.jstack.stockmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderService {
    @Autowired
    private MealInventory mealInventory;

    @RequestMapping(method = RequestMethod.POST)
    public void addOrder(@RequestBody Order order) {
        this.mealInventory.orderMeal(order.getMealId());
    }
}
