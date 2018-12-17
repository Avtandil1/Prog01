import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        double A=scan.nextDouble();
        double B=scan.nextDouble();
        double C=scan.nextDouble();
        double max=A;
        double min=A;
        int s=0;
        int n=0;
        if (A==B && B==C) {s=s+1;}
        if (A==B && A!=C || B==C && B!=A || A==C && C!=B) {n=n+1;}
        if (max<B) {max=B;}
        if (max<C) {max=C;}
        if (min>B) {min=B;}
        if (min>C) {min=C;}
        double avr=(A+B+C)-(max+min);
        A=max;
        B=avr;
        C=min;

        if (A >= (B + C)) {System.out.println("NAO FORMA TRIANGULO");return;}
        if (A*A == (B*B + C*C)) {System.out.println("TRIANGULO RETANGULO");}
        if (A*A > (B*B + C*C)) {System.out.println("TRIANGULO OBTUSANGULO");}
        if (A*A < (B*B + C*C)) {System.out.println("TRIANGULO ACUTANGULO");}
        if (s==1) {System.out.println("TRIANGULO EQUILATERO");}
        if (n==1) {System.out.println("TRIANGULO ISOSCELES");}
    }
}