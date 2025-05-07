package fooddelivery;

import fooddelivery.model.*;
import fooddelivery.service.DeliveryService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DeliveryService service = new DeliveryService();

        User u1 = new User("Ana", "ana@gmail.com");
        Restaurant r1 = new Restaurant("Pizza Time");
        MenuItem m1 = new MenuItem("Pizza Margherita", 32.5);
        MenuItem m2 = new MenuItem("Pizza Pepperoni", 38.0);

        service.addUser(u1);
        service.addRestaurant(r1);
        service.addMenuItem(r1, m1);
        service.addMenuItem(r1, m2);

        System.out.println("Meniu pentru " + r1.getName() + ":");
        for (MenuItem m : service.getMenu(r1)) {
            System.out.println(m);
        }
    }
}