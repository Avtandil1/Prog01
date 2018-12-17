import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double x=scan.nextDouble();
        double y=scan.nextDouble();
        double z=scan.nextDouble();
        int s=1;
        if (x+y>z && x+z>y && y+z>x) {s=s-1;}
        double area;
        area=((x+y)/2)*z;
        if (s==0)
        {System.out.println("Perimetro = "+(x+y+z));}
        if (s!=0)
        {System.out.println("Area = "+area);}
    }
}
