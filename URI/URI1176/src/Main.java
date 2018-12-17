import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int s=0,s1=1,f=0,e=-1;
int q=scan.nextInt();
for (int j=1;j<=q;++j) {
 int n=scan.nextInt();

    for (int i = 1; i <= 60; ++i) {
        if (n==0) {System.out.println("Fib(0) = 0");break;}
        if (n==1) {System.out.println("Fib(1) = 1");break;}

        f = s + s1;
        s = s1;
        s1 = f;
        e=e+1;
  System.out.println(s1+" "+n);

        if (e==n) {System.out.println("Fib("+e+") = "+s1);break;}
    }
e=0;f=0;s=0;s1=1;

}
	// write your code here
    }
}
