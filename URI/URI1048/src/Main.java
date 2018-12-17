import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Double a=scan.nextDouble();
        if (a>0 && a<=400.00) {
            double s= a*0.15;
            System.out.printf("Novo salario: %.2f\n",s+a);
            System.out.printf("Reajuste ganho: %.2f\n",s);
            System.out.println("Em percentual: 15 %"); }
        if (a>=400.01 && a<=800.00) {
            double s= a*0.12;
            System.out.printf("Novo salario: %.2f\n",s+a);
            System.out.printf("Reajuste ganho: %.2f\n",s);
            System.out.println("Em percentual: 12 %"); }
        if (a>=800.01 && a<=1200.00) {
            double s= a*0.10;
            System.out.printf("Novo salario: %.2f\n",s+a);
            System.out.printf("Reajuste ganho: %.2f\n",s);
            System.out.println("Em percentual: 10 %"); }
        if (a>=1200.01 && a<=2000.00) {
            double s= a*0.07;
            System.out.printf("Novo salario: %.2f\n",s+a);
            System.out.printf("Reajuste ganho: %.2f\n",s);
            System.out.println("Em percentual: 7 %"); }
        if (a>2000.00) {
            double s= a*0.04;
            System.out.printf("Novo salario: %.2f\n",s+a);
            System.out.printf("Reajuste ganho: %.2f\n",s);
            System.out.println("Em percentual: 4 %"); }






    }
}
