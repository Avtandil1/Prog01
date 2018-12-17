import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a =scan.nextInt();
        String monthString;
        switch (a) {
            case 1:  monthString = "Winter";
                break;
            case 2:  monthString = "Winter";
                break;
            case 3:  monthString = "Spring";
                break;
            case 4:  monthString = "Spring";
                break;
            case 5:  monthString = "Spring";
                break;
            case 6:  monthString = "Summer";
                break;
            case 7:  monthString = "Summer";
                break;
            case 8:  monthString = "Summer";
                break;
            case 9:  monthString = "Fall";
                break;
            case 10: monthString = "Fall";
                break;
            case 11: monthString = "Fall";
                break;
            case 12: monthString = "Winter";
                break;
            default: monthString = "Не знаем такого";
                break;
        }
    System.out.println(monthString);
    }
}
