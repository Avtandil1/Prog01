import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        String b;
        int c=0,r=0,s=0,sum=0;
        double c1,r1,s1,f1;
        for (int i=1;i<=n;++i){
            int a=scan.nextInt();
            b=scan.next();
            sum=sum+a;
            if (b.equals("C")) {c=c+a;}
            if (b.equals("R")) {r=r+a;}
            if (b.equals("S")) {s=s+a;} }
        c1=(c*100.0)/sum;
        r1=(r*100.0)/sum;
        s1=(s*100.0)/sum;
        System.out.printf("Total: %d cobaias\n",sum);
        System.out.printf("Total de coelhos: %d\n",c);
        System.out.printf("Total de ratos: %d\n",r);
        System.out.printf("Total de sapos: %d\n",s);
        System.out.printf("Percentual de coelhos: %.2f %%\n",c1);
        System.out.printf("Percentual de ratos: %.2f %%\n",r1);
        System.out.printf("Percentual de sapos: %.2f %%\n",s1);

        // write your code here
    }
}
