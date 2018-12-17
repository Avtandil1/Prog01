import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        double q= 4.0/3.0;
        double a=scan.nextDouble();
        double pi=3.14159;
        double sum=q*pi*(a*a*a);
        System.out.printf("VOLUME = %.3f\n",sum);
  }
}
