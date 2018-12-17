import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       int  b,b1,b2,b3;
        System.out.print("Enter the number of minutes: ");
        int a=scan.nextInt();
        b=a/525600;
        b1=a%525600;
        b2=b1/1440;
        System.out.printf("%d minutes is approximately %d years and %d days",a,b,b2);
    }
}
