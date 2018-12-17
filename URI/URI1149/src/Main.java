import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y1, s = 0, sum = 0, s1;
        for (int i = 1; i <= 1000000; ++i) {
            int y = scan.nextInt();
            if (y > 0) {
                s = y;
                break;
            }
        }
            for (int i = x; i <= x + s-1; ++i) {

                sum = sum + i;
            }
            System.out.println(sum);
            // write your code here
        }
    }
