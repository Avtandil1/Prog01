import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; ++i) {
            a[i] = scan.nextInt();
            if (a[i]==0 || a[i]<0 ) {a[i]=1;}
        }
        for (int i = 0; i < a.length; ++i) {
            System.out.println("X["+i+"] = "+a[i]);
        }

        // write your code here
    }
}
