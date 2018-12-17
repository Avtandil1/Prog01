import java.util.*;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random ran=new Random();
int r=ran.nextInt(999)+99;
        int m=scan.nextInt();
    int s=0;
    int x1=r/100;
    int x2=(r/10)%10;
    int x3=r%100;
        int n1=m/100;
        int n2=(m/10)%10;
        int n3=m%100;
            if (x1==n1 && x2==n2 && x3==n3 ) {System.out.print("You won!!! Your award is $10,000");s=s+1;}
            if ((x1+x2+x3)==(n1+n2+n3)) {System.out.print("You won!!! Your award is $3,000");s=s+1;}
            if ((x1==n1 || x1==n2)|| x1==n3 || x2==n1 || x2==n2 || x2==n3 || x3==n1 || x3==n2 || x3==n3 ) {System.out.print("You won!!! Your award is $1,000");s=s+1;}
            if (s==0) {System.out.print("You lost,don't be sad! Try again!" );}
     System.out.print("The lot number was: "+r );
    }
}
