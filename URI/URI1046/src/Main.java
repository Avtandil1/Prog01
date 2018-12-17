import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        int s=0;
        if (x>y) {
            s=(24-x)+y;
        }
        if (x<y) {
            s=y-x;
        }
        if (x==0 && y==0)
        { s=24;}
        if (x==y && x!=0) {s=0;}
        System.out.println("O JOGO DUROU "+ s + " HORA(S)");
    }
}
