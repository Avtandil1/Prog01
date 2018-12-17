import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for (int i=1;i<=n;++i) {
            double a= scan.nextDouble();
            double b= scan.nextDouble();
            if (b==0) {System.out.println("divisao impossivel");} else{
                double s=a/b;

                System.out.printf("%.1f\n",s);}
        }
        // / write your code here
    }
}
