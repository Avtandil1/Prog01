import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        double c=scan.nextDouble();
        double d;
        double r1;
        double r2;
        double s=0;
        d=(b*b)-(4*a*c);
        if (d<0) {s=s+1;}
        if (a==0) s=s+1;
        r1=((-b)+Math.sqrt(d))/(2*a);
        r2=((-b)-Math.sqrt(d))/(2*a);
        if (r1==r2) {s=-1;}
        if (s==0) System.out.printf("The equation has two roots %.6f and %.5f\n" ,r1,r2);
        if (s==-1) {System.out.printf("The equation has one root %.0f\n" ,r1);}
        if (s>=1) System.out.println("The equation has no real roots"); // write your code here
    }
}
