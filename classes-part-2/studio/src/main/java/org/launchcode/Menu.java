package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
    public void addItem(MenuItem item) {
        if (!items.contains(item)){
            items.add(item);
        } else {
            System.out.println("Unable to add " + item.getDescription() + ". " + "This item already exists.");
        }
    }

    public void deleteItem(MenuItem item) {
        items.remove(item);
    }

    public void printMenu() {
        System.out.println("Last updated: " + getLastUpdated());
        for (MenuItem item : items) {
            System.out.println(item);
        }
        System.out.println("-----------------");
    }

    public void printItem(MenuItem item) {
        System.out.println(item);
    }
}


