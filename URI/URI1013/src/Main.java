import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	    int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int a1=(a+b+Math.abs(a-b))/2;
        int a2=(a1+c+Math.abs(a1-c))/2;

        System.out.println(a2+" eh o maior");
        // write your code here
    }
}
