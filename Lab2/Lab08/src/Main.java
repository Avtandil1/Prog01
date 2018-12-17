import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	    System.out.print("Enter a number in pounds: ");
        double a=scan.nextDouble();
        double b=a*0.454;
        System.out.printf("%.2f pounds is %.3f kilograms",a,b );
        // write your code here
    }
}
