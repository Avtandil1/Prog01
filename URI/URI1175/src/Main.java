import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int [] n=new int[20];
int n1=20;
        for (int i=0;i<n.length;++i) {
            n[i]=scan.nextInt(); }
        for (int i=0;i<n.length;++i) {
        n1=n1-1;
            System.out.println("N["+i+"] = "+n[n1]); }

        // write your code here
    }
}
