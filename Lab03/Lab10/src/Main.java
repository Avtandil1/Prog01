import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double x=scan.nextDouble();
        double y=scan.nextDouble();
        double q;
        q=Math.sqrt((x*x)+(y*y));
        if (q<=10) {System.out.println("Point ("+x+", "+y+") is in the circle");}
        if (q>10) {System.out.println("Point ("+x+", "+y+") is not in the circle");}



        // write your code here
    }
}
