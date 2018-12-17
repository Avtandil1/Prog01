import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        if (a>5 && b>2.5) {System.out.print("Point (" + a + ", " + b + ") is not in the rectangle");}
        else {System.out.print("Point (" + a + ", " + b + ") is in the rectangle");}
        }
    }
