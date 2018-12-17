import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int []a =new int [10];
        int s=1;
        int n=scan.nextInt();
        for (int i=0;i<a.length;++i)
        {
            a[i]=n;
            a[i]=a[i]*s;
         s=s*2; }
        for (int i=0;i<a.length;++i)
        {   System.out.println("N["+i+"] = "+a[i]);}

        // write your code here
    }
}
