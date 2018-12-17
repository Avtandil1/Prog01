import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double [] a=new double [100];
        double n =scan.nextDouble();
        double s;
        for (int i=0;i<a.length;++i) {

            a[i]=n;
            s=n/2;
            n=s;
//        System.out.println("a["+i+"] ="+a[i]+"\n n="+n+"\n s="+s);
        }
        for (int i=0;i<a.length;++i) {
            System.out.printf("N[%d] = %.4f\n",i,a[i]); }
    }
    // write your code here
}

