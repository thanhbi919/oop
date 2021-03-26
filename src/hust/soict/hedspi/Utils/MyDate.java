package hust.soict.hedspi.Utils;
import java.util.Date;

public class MyDate {
    private int day;
    private int month;
    private int year;
    public MyDate() {
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public MyDate(String date){
        accept(date);
    }
    public MyDate(String date,String month,String year){

    }
    public int checkMonth(String month){
        if(month.equalsIgnoreCase("January")==true){
            return 1;
        }
        if(month.equalsIgnoreCase("February")==true){
            return 2;
        }
        if(month.equalsIgnoreCase("March")==true){
            return 3;
        }
        if(month.equalsIgnoreCase("April")==true){
            return 4;
        }
        if(month.equalsIgnoreCase("May")==true){
            return 5;
        }
        if(month.equalsIgnoreCase("June")==true){
            return 6;
        }
        if(month.equalsIgnoreCase("July")==true){
            return 7;
        }
        if(month.equalsIgnoreCase("August")==true){
            return 8;
        }
        if(month.equalsIgnoreCase("September")==true){
            return 9;
        }
        if(month.equalsIgnoreCase("October")==true){
            return 10;
        }
        if(month.equalsIgnoreCase("November")==true){
            return 11;
        }
        if(month.equalsIgnoreCase("December")==true){
            return 12;
        }

        else return 0;
    }
    public void accept(String date){
            String words[] = date.split("\\s");
            if(words.length>3||checkMonth(words[0])==0||words[1].length()>=5){
                System.out.println("Input valid");
            }
            try {
                Integer.parseInt(words[2]);
            }catch (Exception e){
                System.out.println("Input valid");
            }
            this.month=checkMonth(words[0]);
            if(words[1].length()==3){
                this.day=Integer.parseInt(words[1].substring(0,1));
            }else {
                this.day=Integer.parseInt(words[1].substring(0,2));
            }
            this.year=Integer.parseInt(words[2]);
        }
    public void printCurrentDate(){
        Date date= new Date();
        System.out.println("Current date: "+date.toString());
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
