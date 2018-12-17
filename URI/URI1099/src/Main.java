    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        int n= scan.nextInt();
        int sum=0;
        for (int i=1;i<=n;++i) {
            int x=scan.nextInt();
            int y=scan.nextInt();
            if (x>y) {
           for (int j=y+1;j<=x-1;++j) {
            if (j%2!=0) {sum=sum+j;} } }
            for (int j=x+1;j<=y-1;++j) {
                if (j%2!=0) {sum=sum+j;} }
            System.out.println(sum);
        sum=0;
        }


                }
        }
            // write your code here
