import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int s=0,x1=0;
        double sum=0;
        do {
            do {
                double n = scan.nextDouble();
                if (n < 0 || n > 10) {
                    System.out.println("nota invalida");
                }
                if (n >= 0 && n <= 10) {
                    sum = sum + n;
                    s = s + 1;
                }
            } while (s != 2);
            System.out.printf("media = %.2f\n",sum/2);sum=0;s=0;
            System.out.println("novo calculo (1-sim 2-nao)");
            for (int i=1;i<=1000000;++i) {
                int x = scan.nextInt();
                if (x < 1 || x > 2) {
                    System.out.println("novo calculo (1-sim 2-nao)");
                }else {x1=x;break;} }
        } while (x1!=2);
        // write your code here
    }
}
