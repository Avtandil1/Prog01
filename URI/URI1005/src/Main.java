import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = a*3.5;
        double d = b*7.5;
        double sum=((c+d)/11);

        System.out.printf("MEDIA = %.5f%n", sum);
        // write your code here
    }
}

