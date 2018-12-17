import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double[][] n=new double[12][12];
        String s=scan.next();
        double sum=0,sum1=0;
        int k=-1,e=0,t=0;
        for (int i=0;i<n.length;++i) {
            for (int j = 0; j < n.length; ++j) {
                n[i][j] = scan.nextDouble();
                e = e + 1;
            }
        }
        if (s.equals("S")) {
            for (int i = 0; i < n.length; ++i) {
                for (int j=0;j<n.length;++j) {
                    if(i-j>=1) {sum=sum+n[i][j];}
                }
            }
            System.out.printf("%.1f\n",sum);

        }



        if (s.equals("M")) {
            for (int i = 0; i < n.length; ++i) {
                for (int j=0;j<n.length;++j) {
                    if(i-j>=1) {sum=sum+n[i][j];}


                }
            }
            System.out.printf("%.1f\n",sum/66);

        }



    }

    // write your code here
}
