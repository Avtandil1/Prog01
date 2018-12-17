import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        System.out.println(a);
        int a1=a/100;
        int a2=a%100;
        System.out.println(a1+" nota(s) de R$ 100,00");
//		System.out.println(a2);

        int b=a2/50;
        int b1=a2%50;

        System.out.println(b+" nota(s) de R$ 50,00");
//		System.out.println(b1);

        int c=b1/20;
        int c1=b1%20;


        System.out.println(c+" nota(s) de R$ 20,00");
//		System.out.println(c1);

        int d=c1/10;
        int d1=c1%10;


        System.out.println(d+" nota(s) de R$ 10,00");
//		System.out.println(d1);
        int e=d1/5;
        int e1=d1%5;

        System.out.println(e+" nota(s) de R$ 5,00");
//		System.out.println(e1);
        int f=e1/2;
        int f1=e1%2;


        System.out.println(f+" nota(s) de R$ 2,00");
//		System.out.println(f1);

        System.out.println(f1+" nota(s) de R$ 1,00");


        // write your code here
    }
}
