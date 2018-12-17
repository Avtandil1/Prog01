import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Double a=scan.nextDouble();
        if (a>=0 && a<=2000) {System.out.println("Isento"); return;}
        if (a>2000.00 && a<=3000.00) {
            double s=(a-2000.00)*0.08; System.out.printf("R$ %.2f\n",s);
        }
        if (a>3000.01 && a<=4500.00) {
            double s=1000*0.08;
            double q=(a-3000)*0.18+s;
            System.out.printf("R$ %.2f\n",q);
        }

        if (a>=4500.01) {
            double s=1000*0.08;
            double s1=500*0.18;
            double q=((a-3750)*0.28)+(s1+s);
            System.out.printf("R$ %.2f\n",q-30); }

    }
}
