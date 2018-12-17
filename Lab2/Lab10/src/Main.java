import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double s3,s,s1,s2,p1,p2,p3,p4,p5;
        System.out.print("Enter the number of years: ");
        int n=scan.nextInt();
        s=31536000.0/7.0;
        s1=31536000.0/13.0;
        s2=31536000.0/45.0;
        s3=(s+s2)-s1;
        p1=312032486;
        p2=s3*n;
        p3=p2+p1;
        System.out.printf("The population in %d years is %.0f",n,p3);
      }
}
