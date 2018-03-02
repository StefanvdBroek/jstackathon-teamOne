package eu.jstack.stockmanagement;

import java.util.UUID;

public class Meal {
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
