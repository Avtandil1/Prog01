import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int s=1;
        for (int i=1;i<=n;++i)
        { s=s*i;}
        System.out.println(s);
	// write your code here
    }
}
