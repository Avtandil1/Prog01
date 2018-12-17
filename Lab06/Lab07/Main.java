import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
sumDidgits(n);

    }

    public static int sumDidgits(long n){
    int s = 0, sum = 0, q = 0;

    for (int i = 0; i <= 1000; ++i) {
        q += n % 10;
        n /= 10; }
        System.out.println(q);
        return (q);

}
}
