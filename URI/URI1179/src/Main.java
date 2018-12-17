import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
  int [] n=new int[4];
  int [] no=new int [4];
  int [] ne=new int [4];
  int s=0,s1=0;
        for (int i=0;i<n.length; ++i)
    {   n[i]=scan.nextInt();
        if (n[i]%2!=0) {no[s]=n[i];}
        if (n[i]%2==0) {ne[s1]=n[i];}
    s=s+1;
        s1=s1+1;
        }
    for (int i=0;i<n.length;++i)
    {System.out.println(no[i]+" "+ne[i]);

    }

	// write your code here
    }
}
