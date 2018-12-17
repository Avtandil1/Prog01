import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int s=0,sum=0;
for (int i=1;i<=1000000;++i) {
 int x=scan.nextInt();
        if (x % 2 != 0) {
            for (int j = x+1; j <= 100000; j = j + 2) {
                s = s + 1;
                sum = sum + j;
                if (s == 5) { break; }}}
         else if (x % 2 == 0) {
                for (int j = x; j <= 100000; j = j + 2) {
                    s = s + 1;
                    sum = sum + j;
                    if (s == 5) {break; }
                }
            }
        if (x==0) {break;}
            System.out.println(sum);
        sum = 0;
        s = 0;
    }
}
        // write your code here
    }
