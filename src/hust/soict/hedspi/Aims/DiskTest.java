package hust.soict.hedspi.Aims;

import hust.soict.hedspi.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.hedspi.Order.Order;

import java.util.ArrayList;

public class DiskTest {
    public static void main(String[] args) {
        Order order = new Order();
        ArrayList<DigitalVideoDisc> digitalVideoDiscs =new ArrayList<>();
        DigitalVideoDisc dv1 = new DigitalVideoDisc("The Lions King","Animation","Roger Allers",87,19.95f);
        DigitalVideoDisc dv2 = new DigitalVideoDisc("Star Wars","Science Fiction","Geogre Lucas",124,24.95f);
        DigitalVideoDisc dv3 = new DigitalVideoDisc("Aladdin","Annimation","John Musker",90,18.99f);
        DigitalVideoDisc dv5 = new DigitalVideoDisc("Alain","Annimation","John Musker",90,18.99f);
        DigitalVideoDisc dv6 = new DigitalVideoDisc("Aaddin","Annimation","John Musker",90,18.99f);
        DigitalVideoDisc dv7 = new DigitalVideoDisc("Aladin","Annimation","John Musker",90,18.99f);
        DigitalVideoDisc dv8 = new DigitalVideoDisc("Aladdi","Annimation","John Musker",90,18.99f);
        DigitalVideoDisc dv9 = new DigitalVideoDisc("Aladdn","Annimation","John Musker",90,18.99f);
        digitalVideoDiscs.add(dv5);
        digitalVideoDiscs.add(dv6);
        digitalVideoDiscs.add(dv7);
        digitalVideoDiscs.add(dv8);
        digitalVideoDiscs.add(dv9);
        order.addDigitalVideoDisc(digitalVideoDiscs);
        order.addDigitalVideoDisc(dv2);
        order.addDigitalVideoDisc(dv1);
        order.addDigitalVideoDisc(dv3);
        order.addDigitalVideoDisc(digitalVideoDiscs);
        System.out.printf(order.getALuckyItem().toString());
        System.out.println(dv1.search("King King the the King ahihi lions"));
    }
}
