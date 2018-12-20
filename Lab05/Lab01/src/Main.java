import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        int nGrades = 0;
        int grade = scan.nextInt();
        while (grade != 0) {
            sum += grade;
            ++nGrades;
            grade = scan.nextInt();
        }

        if (nGrades != 0) {

            System.out.printf("The average is %.1f\n", sum / nGrades);
        } else {
            System.out.println("No data");
        }

    }
}