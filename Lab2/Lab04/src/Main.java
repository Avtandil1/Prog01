import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    double b;
    System.out.print("Lenght in inches? ");
    double a=scan.nextDouble();
    b=a*2.54;
    System.out.print(a+" in. = "+b+" cm.");
	// write your code here
    }
}
