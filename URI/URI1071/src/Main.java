import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int s=0,sum=0;
    int a1=0,b1=0;

        if (a>=b) {
        if (a>0) {a1=a-1;} else if(a<0) {a1=a+1;}
        if (b>0) {b1=b+1;} else if (a<0) {b1=1+a;}
        for (int i=b1;i<=a1;++i)
        {
            if (i%2!=0) {sum=sum+i;}} }
    else {
        for (int i=a1;i<=b1;++i)
        {if (i%2!=0) {sum=sum+i;}}
    }
    System.out.println(sum);
        /// / write your code here
    }
}
