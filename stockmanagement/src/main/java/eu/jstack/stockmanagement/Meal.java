package eu.jstack.stockmanagement;

import java.util.UUID;

public class Meal {
    public static final Meal MEAL_1 = new Meal(UUID.fromString("b985bfc2-a64a-40e7-9aa3-6025f3434f6c"), "Spaghetti Bolognese", "Lorem ipsum dolor sit amet", "spaghetti.png");
    public static final Meal MEAL_2 = new Meal(UUID.fromString("7590840d-5de0-4712-a8b1-cc2528fec529"), "Burrito kip", "Consectetur adipiscing elit", "burrito.png");
    public static final Meal MEAL_3 = new Meal(UUID.fromString("66edde37-dc9a-4587-b204-337d37664e41"), "Roti", "Lorem ipsum dolor sit amet", "roti.png");
    public static final Meal MEAL_4 = new Meal(UUID.fromString("8216ff13-49df-4c8a-a26b-7a89cee513c8"), "Boerenkool met worst", "Consectetur adipiscing elit", "boerenkool.png");
    public static final Meal MEAL_5 = new Meal(UUID.fromString("4034f2db-7989-4563-aa73-50cd9199d9b7"), "Tournedos", "Jammie!", "tournedos.png");

    private UUID id;
    private String title;
    private String description;
    private String picture;

    public Meal() {
    }

    public Meal(UUID id, String title, String description, String picture) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.picture = picture;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPicture() {
        return picture;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
