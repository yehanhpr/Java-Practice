import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner numbr = new Scanner(System.in);
        System.out.print("Enter your favouroit week day: ");

        int day = numbr.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tusday");
                break;

            case 3:
                System.out.println("Wendsday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid number!");
                break;

        }

    }
}