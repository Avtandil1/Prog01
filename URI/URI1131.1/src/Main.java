import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int x1,sumx=0,sumy=0,draw=0,all=0;
    do {
        int x= scan.nextInt();
        int y= scan.nextInt();
        if (x>y) {sumx=sumx+1;}
        if (x<y) {sumy=sumy+1;}
        if (x==y) {draw=draw+1;}


        System.out.println("Novo grenal (1-sim 2-nao)");
        int n= scan.nextInt();
        x1=n;
        all=all+1;
    }while(x1!=2);

        System.out.println(all+" grenais");
        System.out.println("Inter:"+sumx);
        System.out.println("Gremio:"+sumy);
        System.out.println("Empates:"+draw);
        if (sumx>sumy) {System.out.println("Inter venceu mais");}
        if (sumx<sumy) {System.out.println("Gremio venceu mais");}
        if (sumx==sumy) {System.out.println("Nao houve vencedor");}


        // write your code here
    }
}
