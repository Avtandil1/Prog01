import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);

	System.out.print("Enter the radius and lentgh of a cylinder: ");
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        double area=a*a*3.14;
        double vol=area*b;
        System.out.printf("The area is %.2f\n",area);
        System.out.printf("The volume is %.2f",vol);

        // write your code here
    }
}
