package eu.jstack.stockmanagement;

import java.util.UUID;

public class Order {
    private String user;
    private UUID mealId;

    public void setMealId(UUID mealId) {
        this.mealId = mealId;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public UUID getMealId() {
        return mealId;
    }

    public String getUser() {
        return user;
    }
}
