import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan= new Scanner(System.in);
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        double c=scan.nextDouble();
        double pi=3.14159;
        double q=(a*c)/2;
        double q1=(c*c)*pi;
        double q2=(c*(1.0/2.0))*(a+b);
        double q3=b*b;
        double q4=a*b;

        System.out.printf("TRIANGULO: %.3f\n",q );
        System.out.printf("CIRCULO: %.3f\n",q1 );
        System.out.printf("TRAPEZIO: %.3f\n",q2 );
        System.out.printf("QUADRADO: %.3f\n",q3 );
        System.out.printf("RETANGULO: %.3f\n",q4 );



    }
}
