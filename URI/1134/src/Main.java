import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,A=0,G=0,D=0,x=0;
        do {
            int q=scan.nextInt();
            a=q;
            if (q>4 || q<1) {x=x+1;} else
            {
                if (q==1) {A=A+1;}
                if (q==2) {G=G+1;}
                if (q==3) {D=D+1;}
            }
        }while (a!=4);
        if (x>1){ System.out.println("MUITO OBRIGADO");}
        System.out.println("Alcool: "+A);
        System.out.println("Gasolina: "+G);
        System.out.println("Diesel: "+D);

        // / write your code here
    }
}
