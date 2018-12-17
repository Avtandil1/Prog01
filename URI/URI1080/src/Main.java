import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int s=0,max=0,s1=0;
        for (int i=1;i<=100;++i){
            int a=scan.nextInt();
            s=s+1; if (max<a) {max=a;s1=s;} }
        System.out.println(max+"\n"+s1);
        // write your code here
    }
}
