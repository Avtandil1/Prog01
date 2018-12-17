import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double s3,s,s1,s2,p1,p2,p3,p4,p5;
        s=31536000.0/7.0;
        System.out.println(s)  ;
        s1=31536000.0/13.0;
        s2=31536000.0/45.0;
        s3=(s+s2)-s1;
        System.out.println(s3);


        p1=312032486.0+s3;
        p2=p1+s3;
        p3=p2+s3;
        p4=p3+s3;
        p5=p4+s3;
        System.out.printf("First year population is %.0f\n",p1);
        System.out.printf("Second year population is %.0f\n",p2);
        System.out.printf("Third year population is %.0f\n",p3);
        System.out.printf("Fourth year population is %.0f\n",p4);
        System.out.printf("Fifth year population is %.0f\n",p5);
        // 2780096
    }
}
