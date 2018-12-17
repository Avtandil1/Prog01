import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,b;
        do {
            int x=scan.nextInt();
            int y=scan.nextInt();
            a=x;
            b=y;
            if (x>y){
                System.out.println("Decrescente"); } else if (x<y){System.out.println("Crescente");}
        }while (a!=b);
        // / write your code here
    }
}
