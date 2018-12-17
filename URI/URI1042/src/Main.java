import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max = a;
        int min = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        int x = (a + b + c) - (max + min);
        System.out.printf("%d\n%d\n%d\n",min,x,max);
        System.out.printf("\n%d\n%d\n%d\n", a, b, c);
    }
}
