package eu.jstack.notification;

import java.util.UUID;

public class InventoryUpdated {
    private UUID mealId;
    private int inventory;

    static InventoryUpdated fromString(String input){
        InventoryUpdated instance = new InventoryUpdated();
        String[] split = input.split(",");
        instance.setMealId(UUID.fromString(split[0]));
        instance.setInventory(Integer.parseInt(split[1]));
        return instance;
    }

    public int getInventory() {
        return inventory;
    }

    public UUID getMealId() {
        return mealId;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public void setMealId(UUID mealId) {
        this.mealId = mealId;
    }
}
