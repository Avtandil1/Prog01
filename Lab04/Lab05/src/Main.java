import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Year? ");
        int y=scan.nextInt();
        System.out.print("Month? ");
        int m=scan.nextInt();
        int s;
        if (y%4!=0) {s=0;}
        else if (y%100!=0) {s=1;}
        else if (y%400!=0) {s=0;}
        else {s=1;}
        if (m==1) { System.out.println("Number of days: 31");}
        if (m==3) { System.out.println("Number of days: 31");}
        if (m==4) { System.out.println("Number of days: 30");}
        if (m==5) { System.out.println("Number of days: 31");}
        if (m==6) { System.out.println("Number of days: 30");}
        if (m==7) { System.out.println("Number of days: 31");}
        if (m==8) { System.out.println("Number of days: 31");}
        if (m==9) { System.out.println("Number of days: 30");}
        if (m==10) { System.out.println("Number of days: 31");}
        if (m==11) { System.out.println("Number of days: 30");}
        if (m==12) { System.out.println("Number of days: 31");}
        if (m==2) {if (s==1) {System.out.println("Number of days: 29");} else
            System.out.println("Number of days: 28");
        }

        // write your code here
    }
}
