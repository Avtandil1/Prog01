import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] a=new int [1000];
        int n=scan.nextInt();
        int s=n;
        for (int i=0;i<a.length;++i) {
            a[i]=n-s;
            s=s-1;
            if (s==0) {s=n;}
//        System.out.println("a["+i+"] ="+a[i]+"\n n="+n+"\n s="+s);
        }
        for (int i=0;i<a.length;++i) {
        System.out.println("N["+i+"] = "+a[i]); }
        }
        // write your code here
    }

