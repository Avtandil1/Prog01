import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    int x=scan.nextInt();
    int s=0;
        if (x==61) {System.out.println("Brasilia");s=s+1;}
        if (x==71) {System.out.println("Salvador");s=s+1;}
        if (x==11) {System.out.println("Sao Paulo");s=s+1;}
        if (x==21) {System.out.println("Rio de Janeiro");s=1;}
        if (x==32) {System.out.println("Juiz de Fora");s=1;}
        if (x==19) {System.out.println("Campinas");s=1;}
        if (x==27) {System.out.println("Vitoria");s=1;}
        if (x==31) {System.out.println("Belo Horizonte");s=1;}
        if (s==0) {System.out.println("DDD nao cadastrado");}

        // write your code here
    }
}
