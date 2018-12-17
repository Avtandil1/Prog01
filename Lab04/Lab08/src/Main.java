import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write edges of a triangle: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if ((a + b) > c){
            System.out.println("The perimets of triangle is " + (a + b + c));
        }else{
            System.out.println("The input is invalid");
        }
    }
}

