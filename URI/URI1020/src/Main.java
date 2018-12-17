import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int q=scan.nextInt();
    int a=q/365;
    int a1=q%365;
    int m=a1/30;
    int m1=a1%30;
    System.out.println(a+" ano(s)");
    System.out.println(m+" mes(es)");
    System.out.println(m1+" dia(s)");

        // write your code here
    }
}
