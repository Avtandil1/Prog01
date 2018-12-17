import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x=0;
        System.out.print("Year? ");
        int n=scan.nextInt();
        if(n%4!=0) {x=x+1;}
        else if (n%100!=0) {x=0;}
        else if (n%400!=0) {x=x+1;}
        else {x=0;}
        if (x==0) {
            System.out.println("This is a leap year"); }
            else {System.out.println("This is not a leap year"); }
    }

    }
