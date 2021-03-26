package hust.soict.hedspi.Aims;
import hust.soict.hedspi.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.hedspi.Order.Order;
import java.util.ArrayList;
public class Aims {
    public static void main(String[] args) {
        Order order = new Order();
        ArrayList<DigitalVideoDisc> digitalVideoDiscs =new ArrayList<>();
        DigitalVideoDisc dv1 = new DigitalVideoDisc("The Lions King","Animation","Roger Allers",87,19.95f);
        DigitalVideoDisc dv2 = new DigitalVideoDisc("Star Wars","Science Fiction","Geogre Lucas",124,24.95f);
        DigitalVideoDisc dv3 = new DigitalVideoDisc("Aladdin","Annimation","John Musker",90,18.99f);
        for(int i=0;i<5;i++){
            digitalVideoDiscs.add(dv1);
        }
        order.addDigitalVideoDisc(dv2);
        order.addDigitalVideoDisc(dv1);
        order.addDigitalVideoDisc(dv3);
        order.addDigitalVideoDisc(digitalVideoDiscs);
       


        System.out.println("***********************Order***********************");
        order.getDateOrdered().printCurrentDate();
        System.out.println("Ordered items");
        order.printOrdered();
        System.out.println("Total cost:"+order.totalCost());
        System.out.println("***********************Order***********************");

    }
}
