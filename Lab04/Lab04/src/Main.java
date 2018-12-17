import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("month? ");
        int a=scan.nextInt();
        if (a==12 ||a==1||  a==2) {System.out.println("Winter");}
        if (a==3 ||a==4||  a==5) {System.out.println("Spring");}
        if (a==6 ||a==7||  a==8) {System.out.println("Summer");}
        if (a==9 ||a==10||  a==11) {System.out.println("Fall");}

        // write your code here
    }
}
