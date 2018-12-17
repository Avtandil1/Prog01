import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double n1=scan.nextDouble();
        double n2=scan.nextDouble();
        double n3=scan.nextDouble();
        double n4=scan.nextDouble();
        double z1=n1*2.0;
        double z2=n2*3.0;
        double z3=n3*4.0;
//        System.out.println(z1);
//        System.out.println(z2);
//        System.out.println(z3);
//        System.out.println(n4);
//        System.out.println(z1+z2+z3+n4);
        double n=(z1+z2+z3+n4-0.00001)/10.0;

        System.out.printf("Media: %.1f\n",n);
        if (n>=7.0) {System.out.println("Aluno aprovado.");}
        if (n<=4.999) {System.out.println("Aluno reprovado.");}
        if (n>4.999 && n<=6.9) {
            System.out.println("Aluno em exame.");
            double n5=scan.nextDouble();
            double n6=((n+n5-0.00001)/2.0);
            System.out.println("Nota do exame: "+n5);

            if (n>=4.999) {System.out.println("Aluno aprovado.");}
            if (n<4.999) {System.out.println("Aluno reprovado.");}
            System.out.printf("Media final: %.1f\n",n6);
        }
        /// / write your code here
    }
}
