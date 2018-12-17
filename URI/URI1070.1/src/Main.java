import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int g=n;
int s=0;
for (int i=n;i<=100000000;++i) {
            g = g + 1;
            if (g % 2 != 0) { System.out.println(g);s = s + 1; }
            if (s == 6) { return; }
        }
	// write your code here
    }
}