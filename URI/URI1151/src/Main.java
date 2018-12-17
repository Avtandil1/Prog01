import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int f = 0;
        int g = 1;
        int n=scan.nextInt();
        System.out.print("0 ");
        if (n==1) {System.out.print("0 ");System.exit(n); }
        for(int i = 1; i <= n-1; i++)
        {
            f = f + g;
            g = f - g;
            if (i==n-1) {break;}
            System.out.print(f + " ");
        }
            System.out.println(f);
	// write your code here
    }
}
