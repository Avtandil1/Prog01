import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int s=1,s1,s2;
        for (int i=1;i<=n;++i) {
        s1=s+1;
        s2=s+2;
            System.out.println(s+" "+s1+ " " +s2+" PUM");
        s=s+4;
        }
        }
	// write your code here
    }