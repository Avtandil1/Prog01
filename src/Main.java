import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
        int q,s=0,sum=0;
	do {
       int a=scan.nextInt();
       q=a;
        if (a%2==0) {
            for (int i=a;i<=1000000;++i){
            s=s+1;
            if (i%2==0) {sum=sum+i;}
                System.out.println(sum+" "+i);
                if (s==10) {break;}
            }

        }
        else if(a%2!=0)
        {
            for (int i=a;i<=1000000;++i)
        {
            s=s+1;
            if (i%2==0) {sum=sum+i;}

            System.out.println(sum+" "+i);
            if (s==10) {break;}
        }

        }
        System.out.println(sum);
    }
   while (q!=0);

    }
}
