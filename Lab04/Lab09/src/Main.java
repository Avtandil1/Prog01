import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Weight of a package: ");
        double w = scan.nextInt();
        double costperpound = 0;
        if(w > 50){
            System.out.println("the ship cannot be shipped");
        }else{
            if (0 < w && w <= 1){
                costperpound = 3.5;
            }
            else if (1 < w && w <= 3){
                costperpound = 5.5;
            }
            else if (3 < w && w <= 10){
                costperpound = 8.5;
            }
            else if (10 < w && w <= 20){
                costperpound = 10.5;
            }
            System.out.println("The shipping cost is " + (costperpound * w));
        }
    }
}

