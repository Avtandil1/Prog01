import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
double m=scan.nextDouble();
        if ((101<=m) || (m<=-1)) {System.out.print(m+" is not in the permitted range");return;}

        if ((90<=m) && (m<=100)) {System.out.print("Grade: A");}
        if ((80<=m) && (m<90)) {System.out.print("Grade: B");}
        if ((70<=m) && (m<80)) {System.out.print("Grade: C");}
        if ((60<=m) && (m<70)) {System.out.print("Grade: D");}
        if (m<60) {System.out.print("Grade: F");}
	// write your code here
    }
}
