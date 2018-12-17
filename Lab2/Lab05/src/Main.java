import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double b;
        double a=scan.nextDouble();
        System.out.print("Tempereture in degrees Fahrenheit? "+a);
        b=(a-32)*(5.0/9.0);
        System.out.printf("The temperature in degrees Celcius is %.2f",b);
        // write your code here
    }
}
