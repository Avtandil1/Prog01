import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Double x=scan.nextDouble();
        Double x1=scan.nextDouble();
        Double x2=scan.nextDouble();
        Double x3=scan.nextDouble();
        Double x4=scan.nextDouble();
        Double x5=scan.nextDouble();
        int s=0;
        double n=0;
        if (x>0) {s=s+1;n=n+x;}
        if (x1>0) {s=s+1;n=n+x1;}
        if (x2>0) {s=s+1;n=n+x2;}
        if (x3>0) {s=s+1;n=n+x3;}
        if (x4>0) {s=s+1;n=n+x4;}
        if (x5>0) {s=s+1;n=n+x5;}
        System.out.println(s+" valores positivos");
        System.out.printf("%.1f\n",n/s);
    }
}
