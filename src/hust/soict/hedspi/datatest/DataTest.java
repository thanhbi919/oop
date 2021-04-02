package hust.soict.hedspi.datatest;

import hust.soict.hedspi.utils.MyDate;

public class DataTest {
    public static void main(String[] args) {
        MyDate md1 = new MyDate(2,3,2020);
        System.out.println(md1.toString());
        MyDate md2 = new MyDate("February 20th 2020");
        System.out.println(md2.toString());
        MyDate md = new MyDate();
        md.printCurrentDate();
    }
}

