import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double s=0,s1=0;
        for (int i=2;i<=100;++i)
        {  s1=s1+1.0;
            s=s+(1.0/s1);
        }
        s=s+0.01;
        System.out.printf("%.2f\n",s);
        // write your code here
    }
}
