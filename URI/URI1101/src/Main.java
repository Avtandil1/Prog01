import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        int sum=0;
        int x1,y1,g=0;
        do  {
            int x=scan.nextInt();
            int y=scan.nextInt();
            if (x==0 || x<0 || y==0 || y<0) {break;}
            g=g+2;
            if (x>y) {
                    for (int j=y;j<=x;++j) {
                    System.out.print(j+" ");
                    sum=sum+j; } }
                else {
                for (int j=x;j<=y;++j) {
                    System.out.print(j+" ");
                    sum=sum+j;
                     } }
                System.out.println("Sum="+sum);
                sum=0;
        } while (g!=1);


    }
}
// write your code here
