import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a=scan.nextDouble();
        int t = (int) a;
        // Finding Banknotes
        System.out.println("NOTAS:");
//        Finding 100
        int t1=t/100;
        int t2=t%100;
        System.out.println(t1+" nota(s) de R$ 100.00");
//        Finding 50
        int b=t2/50;
        int b1=t2%50;
        System.out.println(b+" nota(s) de R$ 50.00");
//        Finding 20
        int c=b1/20;
        int c1=b1%20;
        System.out.println(c+" nota(s) de R$ 20.00");
//        Finding 10
        int d=c1/10;
        int d1=c1%10;
        System.out.println(d+" nota(s) de R$ 10.00");
//        Finding 5
        int e=d1/5;
        int e1=d1%5;
        System.out.println(e+" nota(s) de R$ 5.00");
//        Finding 2
        int f=e1/2;
        int f1=e1%2;
        System.out.println(f+" nota(s) de R$ 2.00");
// used variables a,t,t1,t2,b,b1,c,c1,d,d1,e,e1,f,f1
        // Finding Coins
        System.out.println("MOEDAS:");
        double q1=a-t;
//        Finding 1
        System.out.println(f1+" moeda(s) de R$ 1.00");
//        Finding 0.50
        double c2=a-t;
        double n=q1/0.50;
        int d2=(int) n;
        double d3=d2*0.50;
        double d4=c2-d3;
        System.out.println(d2+" moeda(s) de R$ 0.50");
//          Finding 0.25
        double r= d4/0.25;
        int r1=(int) r;
        double r2=r1*0.25;
        double r3=d4-r2;
        System.out.println(r1+" moeda(s) de R$ 0.25");

        //        Finding 0.10
        double p= r3/0.10;
        int p1=(int) p;
        double p2=p1*0.10;
        double p3=r3-p2;
        System.out.println(p1+" moeda(s) de R$ 0.10");
//        Finding 0.05

        double y= p3/0.05;
        int y1=(int) y;
        double y2=y1*0.05;
        double y3=p3-y2;
//        System.out.println(y3);

        System.out.println(y1+" moeda(s) de R$ 0.05");


//        Finding 0.01
        double u= (y3+0.00001)/0.01;
        int u1=(int) u;
        double u2=u1*0.01;


        System.out.println(u1+" moeda(s) de R$ 0.01");

    }
}

