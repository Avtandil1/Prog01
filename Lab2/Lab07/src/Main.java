import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.print("Enter a degree in Celsius: ");
        double n=scan.nextDouble();
        double q=(9.0/5.0)*n+32;
        System.out.printf("%.2f Celsius is %.2f Fahrenheit",n,q);



        // / write your code here
    }
}
