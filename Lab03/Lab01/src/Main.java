import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       System.out.println("Enter a, b, c: ");
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        double c=scan.nextDouble();
        double d;
        double r1;
        double r2;
        double s=0;
        d=(b*b)-(4*a*c);
        if (d>0) {s=2;}
        if (d==0) {s=1;}
        if (d<0) {s=0;}
        r1=((-b)+Math.sqrt(d))/(2*a);
        r2=((-b)-Math.sqrt(d))/(2*a);
        if (s==2) System.out.println("The equation has two roots " + r1 + " and " + r2);
        if (s==1) System.out.println("The equation has one root " +r1);
        if (s==0) System.out.println("The equation han no real roots");

         }
}
