import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double n=scan.nextDouble();

        if(n<0 || n>100)

        {

            System.out.println("Fora de intervalo\n");

        }

        else if(n<=25.00)

        {

            System.out.println("Intervalo (0,25]\n");

        }

        else if(n<=50.0)

        {

            System.out.println("Intervalo (25,50]\n");

        }

        else if(n<=75.0)

        {

            System.out.println("Intervalo (50,75]\n");

        }

        else if(n<=100.0)

        {

            System.out.println("Intervalo (75,100]\n");

        }


        // write your code here
    }
}
