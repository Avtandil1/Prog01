import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
Random ran=new Random();
int x=ran.nextInt(13)+1;
int x1=ran.nextInt(4)+1;
int s=0;
String t="";
String t1="";
        if (x1==1) {t="Clubs";}
        if (x1==2) {t="Hearts";}
        if (x1==3) {t="Diamonds";}
        if (x1==4) {t="Spades";}
        if (x==1) {t1="Ace";s=s+1;}
        if (x==11) {t1="Jack";s=s+1;}
        if (x==12) {t1="Queen";s=s+1;}
        if (x==13) {t1="King";s=s+1;}
 if (s==1) {System.out.println("The card you picked up is "+ t1 +"of " +t); }
else {System.out.println("The card you picked up is "+ x +" of " +t); }

        // write your code here
    }
}
