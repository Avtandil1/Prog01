import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        int max=x,min=x,s=0;
        if (max<y) {max=y;};
        if (min>y) {min=y;};
        for (int i=min;i<=max;++i) {
            if (i%13!=0) {s=s+i;} }
        System.out.println(s);


        // / write your code here
    }
}
