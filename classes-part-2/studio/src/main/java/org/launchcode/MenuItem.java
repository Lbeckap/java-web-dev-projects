package org.launchcode;

import java.time.LocalDate;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private LocalDate dateAdded;

    public MenuItem(double price, String description, String category) {
        this.dateAdded = LocalDate.now();
        this.isNew = isNew();
        this.category = category;
        this.description = description;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public boolean isNew() {
        LocalDate testDate = LocalDate.of(2023, 8, 17);
        if (dateAdded.isBefore(testDate)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return  description + ", " + price + ", " + category + ", " + isNew;
    }
}

