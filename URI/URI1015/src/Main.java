import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double x1=scan.nextDouble();
        double y1=scan.nextDouble();
        double x2=scan.nextDouble();
        double y2=scan.nextDouble();

        double q1=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        double q=Math.sqrt(q1);
        System.out.printf("%.4f\n",q);



        // write your code here
    }
}
