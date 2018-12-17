import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a,b;
        do {
            String x=scan.next();
            a=x;
            if (x.equals("2002") ) {System.out.println("Acesso Permitido");} else {System.out.println("Senha Invalida");}
        }while (!a.equals("2002"));
        // / write your code here
    }
}
