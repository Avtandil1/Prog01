import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int a=scan.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int a1=scan.nextInt();
        int s;
        int s1=0;
        s=a+a1;
        s1=s%7;

        String q=scan.nextLine();
        if (a==0) {q="Sunday";}
        if (a==1) {q="Monday";}
        if (a==2) {q="Tuesday";}
        if (a==3) {q="Wendsday";}
        if (a==4) {q="Thursday";}
        if (a==5) {q="Friday";}
        if (a==6) {q="Saturday";}

        if (s1==0) {System.out.println("Today is " + q + " and the future day is Sunday");}
        if (s1==1) {System.out.println("Today is " + q + " and the future day is Monday");}
        if (s1==2) {System.out.println("Today is " + q + " and the future day is Tuesday");}
        if (s1==3) {System.out.println("Today is " + q + " and the future day is Wendsday");}
        if (s1==4) {System.out.println("Today is " + q + " and the future day is Thursday");}
        if (s1==5) {System.out.println("Today is " + q + " and the future day is Friday");}
        if (s1==6) {System.out.println("Today is " + q + " and the future day is Saturday");}

    }
}
