import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double x=scan.nextInt();
        double y=scan.nextInt();
        if (x==1){System.out.println("Total: R$ "+(y*4.00+"0"));}
        if (x==2){System.out.println("Total: R$ "+(y*4.50+"0"));}
        if (x==3){System.out.println("Total: R$ "+(y*5.00+"0"));}
        if (x==4){System.out.println("Total: R$ "+(y*2.00+"0"));}
        if (x==5){System.out.println("Total: R$ "+(y*1.50+"0"));}


        // write your code here
    }
}
