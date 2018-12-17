import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double m=1,n=0,m1=2,m2=3;
			int n1=0,q,q1,q2,s=0;
	System.out.println("I=0 J=1");
		System.out.println("I=0 J=2");
		System.out.println("I=0 J=3");

		for (int i=1;i<=9;++i) {
s=s+1;
			n=n+0.2;
			m=m+0.2;
			m1=m1+0.2;
			m2=m2+0.2;

			if (s==5) { n1=(int)n;
	System.out.printf("I=%d J=2\n",n1);
	System.out.printf("I=%d J=3\n",n1);
	System.out.printf("I=%d J=4\n",n1); }
			else {
	System.out.printf("I=%.1f J=%.1f\n", n, m);
	System.out.printf("I=%.1f J=%.1f\n", n, m1);
	System.out.printf("I=%.1f J=%.1f\n", n, m2);
}

	}
		System.out.println("I=2 J=3");
		System.out.println("I=2 J=4");
		System.out.println("I=2 J=5");

		// / write your code here
    }
}
