    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int [] n=new int[15];
            int [] no=new int [15];
            int [] ne=new int [15];
            int s=0,s1=0;
            for (int i=0;i<n.length; ++i)
            {   n[i]=scan.nextInt();
                if (n[i]%2!=0) {no[s]=n[i]; s=s+1; }
                if (n[i]%2==0) {ne[s1]=n[i];s1=s1+1;}

            }

            for (int i=0;i<5;++i)
            {if (ne[i]==0) {break;};System.out.println("par["+i+"] = "+ne[i]); }
            for (int i=0;i<5;++i)
            {if (no[i]==0) {break;}System.out.println("impar["+i+"] = "+no[i]); }
            s=0;
            for (int i=5;i<10;++i)
            {
                if (no[i]==0) {break;}System.out.println("impar["+s+"] = "+no[i]);s=s+1; }
            s=0;
            for (int i=5;i<10;++i)
            {if (ne[i]==0) {break;}System.out.println("par["+s+"] = "+ne[i]);s=s+1; }

            s=0;
            for (int i=10;i<15;++i)
            {
                if (no[i]==0) {break;}System.out.println("impar["+s+"] = "+no[i]);s=s+1; }
            s=0;
            for (int i=10;i<15;++i)
            {if (ne[i]==0) {break;}System.out.println("par["+s+"] = "+ne[i]);s=s+1; }



            // write your code here
        }
    }
