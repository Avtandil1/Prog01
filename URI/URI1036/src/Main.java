import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int s=0;
        if (b>c) s=s+1;
        if (d>a) s=s+1;
        if (d+c>a+b) s=s+1;
        if (c>0) s=s+1;
        if (d>0) s=s+1;
        if (a%2==0) s=s+1;
        if (s==6) System.out.println("Valores aceitos");
        if (s!=6) System.out.println("Valores nao aceitos");


        // write your code here
    }
}
