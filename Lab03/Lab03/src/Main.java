import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int x;
	System.out.print("1st number? ");
	int a=scan.nextInt();
	System.out.print("2nd number? ");
    int a1=scan.nextInt();
    System.out.print("3rd number? ");
    int a2=scan.nextInt();
    int max=a;
    if (max<=a1) {max=a1;}
        if (max<=a2) {max=a2;}
System.out.println("The value "+ max+ " is the greatest one");
        // write your code here
    }
}
