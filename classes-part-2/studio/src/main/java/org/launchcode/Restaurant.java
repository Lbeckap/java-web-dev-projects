package org.launchcode;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {
        // write your code here
        MenuItem salad = new MenuItem(4.60, "salad", "lunch");
        MenuItem eggs = new MenuItem(2.50, "eggs", "lunch");
        MenuItem chicken = new MenuItem(10.50, "chicken", "dinner");

        ArrayList<MenuItem> items = new ArrayList<>();
        Menu menu = new Menu (Date.valueOf(LocalDate.now()), items);

        menu.addItem(salad);
        menu.addItem(eggs);
        menu.addItem(chicken);
        menu.printMenu();

        menu.deleteItem(eggs);
        menu.printMenu();

        menu.printItem(chicken);
        menu.addItem(chicken);

        System.out.println(salad.getDateAdded());
        salad.setDateAdded(LocalDate.of(2011, 1, 1));
        System.out.println(salad.getDateAdded());
        menu.printItem(salad);
    }

}
