import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
        Random rand = new Random();
      int a1 = rand.nextInt(3);
      System.out.println("scissor (0), rock (1), paper(2): ");
      int a= scan.nextInt();
      String s= "";
        String s1= "";
  System.out.println(a1);
        if (a1==0) {s1="scissor";}
        if (a1==1) {s1="rock";}
        if (a1==2) {s1="paper";}
        if (a==0) {s="scissor";}
        if (a==1) {s="rock";}
        if (a==2) {s="paper";}
        if (a1==a) {System.out.println("The computer is " + s1 + ".You are "+s+" too.It is a draw" );}
        if (a1==0 && a==1) {System.out.println("The computer is " + s1 + ". You are "+s+". You won");}
        if (a1==0 && a==2) {System.out.println("The computer is " + s1 + ". You are "+s+". You lost");}
        if (a1==1 && a==0) {System.out.println("The computer is " + s1 + ". You are "+s+". You won");}
        if (a1==1 && a==2) {System.out.println("The computer is " + s1 + ". You are "+s+". You lost");}
        if (a1==2 && a==1) {System.out.println("The computer is " + s1 + ". You are "+s+". You won");}
        if (a1==2 && a==0) {System.out.println("The computer is " + s1 + ". You are "+s+". You lost");}


        // write your code here
    }
}
