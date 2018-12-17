    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
    double m=0.0,s=0.0,s1=0.0,s2=0.0;
            double sum=0;
            do {
                double n =scan.nextInt();
                s=s+n;
                s1=s1+1;
                m = n;
    s2=Math.abs(m);
            }while (m>0);

            sum=(s+s2)/(s1-1);

            System.out.printf("%.2f\n",sum);
            // write your code here
        }
    }
