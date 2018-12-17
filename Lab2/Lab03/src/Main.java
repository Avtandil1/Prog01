import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.print("A four-digit integer? ");
        int n=scan.nextInt();
            int s=0;

              int q=n%10;
              s=s+q;
              n/=10;

              q=n%10;
              s=s+q;
              n/=10;

              q=n%10;
              s=s+q;
              n=n/10;

              q=n%10;
              s=s+q;

        System.out.printf("The sum of all digits is %d",s);



        // / write your code here
    }
}
