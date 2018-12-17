import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        int max=x,min=x,s=0;
        if (max<y) {max=y;};
        if (min>y) {min=y;};
        for (int i=min+1;i<=max-1;++i) {

            if (i % 5 == 2 || i % 5 == 3) {System.out.println(i); }
        }
        // / write your code here
    }
}
