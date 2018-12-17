import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    int x=scan.nextInt();
    int m,max=x,s=0,s1=0;
        do {
    int y=scan.nextInt();
    m=y;
    if (y>x) {max=y;}
            }while(m<=x);
if (x>0){
        for (int i=x;i<=1000;++i) {
            if (s<=max) {s1=s1+1;} else {break;}

            s=s+i;

        }}

        if (x<0){
            for (int i=x;i<=10;++i) {
//                System.out.println(i);

                if (s<=max) {s1=s1+1;} else {break;}

                s=s+i;
//                System.out.println(s);

            }}
//        System.out.println(max+" ");


        System.out.println(s1);
    }
}
    // write your code here