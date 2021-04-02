package hust.soict.hedspi.aims;

import hust.soict.hedspi.order.Order;

import java.util.ArrayList;
import java.util.Scanner;

public class Aims {
    public static void showMenu() {
        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by title");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: ");
    }

    public static void main(String[] args) {
        byte choose;

        ArrayList<Order> orders = new ArrayList<>();

        int i = 0;
        do {
            showMenu();
            Scanner scanner = new Scanner(System.in);
            choose = scanner.nextByte();
            switch (choose) {
                case 1:
                    Order order1 = new Order();
                    if (i == Order.MAX_NUMBERS_ORDERED) {
                        System.out.println("can't add new order");
                    }
                    i++;
                    orders.add(order1);
                    System.out.println("Created new order");

                    break;
                case 2:
                    orders.get(i - 1).addMedia();
                    break;
                case 3:
                    orders.get(i - 1).removeMedia();
                    break;
                case 4:
                    System.out.println("the items list of order: ");
                    orders.get(i - 1).printOrdered();
                    break;
                default:
                    break;
            }
        }
        while (choose != 0);
    }
}
