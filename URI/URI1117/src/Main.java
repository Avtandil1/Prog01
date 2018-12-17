import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int s=0;
	double sum=0;
	do {
	    double n=scan.nextDouble();
        if (n<0 || n>10) {System.out.println("nota invalida");}
        if (n>=0 && n<=10) {sum=sum+n;s=s+1;}
    } while (s!=2);
	System.out.println("media = "+sum/2);
        // write your code here
    }
}
