package hust.soict.hedspi.order;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.digitalvideodisc.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Order {
    Scanner sc = new Scanner(System.in);
    public static final int MAX_NUMBERS_ORDERED = 10;
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    public Order() {
    }

    public Media addMedia() {
        int choose;
        Media media = new Media();
        System.out.print("You want to add book or dvd (book enter 1,dvd enter 2): ");
        choose = sc.nextInt();
        sc.nextLine();
        switch (choose) {
            case 1:
                Book book = new Book();
                System.out.print("Title: ");
                book.setTitle(sc.nextLine());
                System.out.print("Catelogy: ");
                book.setCategory(sc.nextLine());
                System.out.print("Cost: ");
                book.setCost(sc.nextFloat());
                System.out.print("how many authors:");
                int ath = sc.nextInt();
                sc.nextLine();
                for (int i = 1; i <= ath; i++) {
                    System.out.print("Author " + i + ": ");
                    book.addAuthor(sc.nextLine());
                }
                if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
                    if (choose == 1) {
                        itemsOrdered.add(book);
                    } else {
                        System.out.println("maximum " + MAX_NUMBERS_ORDERED + " products in 1 ordered");
                    }
                }
                return book;
            case 2:
                DigitalVideoDisc dvd = new DigitalVideoDisc();
                System.out.print("Title: ");
                dvd.setTitle(sc.nextLine());
                System.out.print("Catelogy: ");
                dvd.setCategory(sc.nextLine());
                System.out.print("Director: ");
                dvd.setDirectory(sc.nextLine());
                System.out.print("Length: ");
                dvd.setLength(sc.nextInt());
                System.out.print("Cost:");
                dvd.setCost(sc.nextFloat());
                if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
                    if (choose == 2) {
                        itemsOrdered.add(dvd);
                    } else {
                        System.out.println("maximum " + MAX_NUMBERS_ORDERED + " products in 1 ordered");
                    }
                }
                return dvd;
            default:
                System.out.println("Input error");
                break;
        }
        return media;
    }

    public void addMedia(ArrayList<Media> medias) {
        if (MAX_NUMBERS_ORDERED > medias.size()) {
            for (Media x : medias) {
                itemsOrdered.add(x);
            }
        } else {
            for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
                itemsOrdered.add(medias.get(i));
            }
            System.out.println("the dvd(s) that could not be added:");
            for (int i = MAX_NUMBERS_ORDERED; i < medias.size(); i++) {
                System.out.println(medias.get(i).toString());
            }
        }
    }

    public void removeMedia() {
        String title;
        if (itemsOrdered.size() == 0) {
            System.out.println("Order empty!");
            return;
        }
        System.out.print("Enter the name of media you want to delete: ");
        title = sc.nextLine();
        for (Media x : itemsOrdered) {
            if (title.equals(x.getTitle())) {
                itemsOrdered.remove(x);
            }
        }
    }

    public float totalCost() {
        float total = 0;
        for (Media x : itemsOrdered) {
            total += x.getCost();
        }
        return total;
    }

    public void printOrdered() {
        for (Media x : itemsOrdered) {
            System.out.println(x.toString());
        }
    }

    public Media getALuckyItem() {
        int total = itemsOrdered.size();
        int luckynumber;
        Random rd = new Random();
        luckynumber = rd.nextInt(total);
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (i == luckynumber) {
                itemsOrdered.get(i).setCost(0);
                break;
            }
        }
        return itemsOrdered.get(luckynumber);
    }

}
