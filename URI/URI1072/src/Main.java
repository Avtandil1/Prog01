import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        int s1=0;
        int s2=0;
        for (int i=1;i<=n;++i)
        {int x=scan.nextInt();
        if (x>=10 && x<=20) {s1=s1+1;} else {s2=s2+1;} }
        System.out.println(s1+" in");
        System.out.println(s2+" out");

    }
}
