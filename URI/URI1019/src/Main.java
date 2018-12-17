import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
                int a= scan.nextInt();
 int h=a/3600;
 int h1=a%3600;
 int m=h1/60;
 int m1=h1%60;
        System.out.println(h+":"+ m+ ":"+ m1);

            }
        }

