    import java.util.*;
    public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double a = scan.nextDouble();
            if (a > 100 || a < 0) { System.out.println("Fora de intervalo");}
            if (a <= 25 && a >= 0) { System.out.println("Intervalo (0,25]"); }
            if (a > 25 && a <=50) { System.out.println("Intervalo (25,50]"); }
            if (a > 50 && a <=75) { System.out.println("Intervalo (50,75]"); }
            if (a > 75 && a <= 100) { System.out.println("Intervalo (75,100]"); }

            }
        }

