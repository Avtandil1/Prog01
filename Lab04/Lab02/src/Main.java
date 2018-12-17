import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("complexity level? ");
	int a=scan.nextInt();
    if (a>=4 && a<=5) {System.out.println("You are a pro gamer");}
        if (a>=2 && a<=3) {System.out.println("You are an experienced gamer");}
        if (a==1) {System.out.println("You are a beginner");}
        if (a==0) {System.out.println("You are a total newbie");}

        // write your code here
    }
}
