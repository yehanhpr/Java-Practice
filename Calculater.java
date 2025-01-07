import java.util.Scanner;

public class Calculater {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        String operator;
        double num1, num2, sum;

        System.out.print("Enter your first number: ");
        num1 = num.nextDouble();

        System.out.print("Enter your second number: ");
        num2 = num.nextDouble();

        Scanner opr = new Scanner(System.in);
        System.out.print("Enter operator symbol: ");
        operator = opr.nextLine();

        System.out.print(num1 + " " + operator + " " + num2 + " = ");

        if (operator.equals("+")) {
            System.out.println(sum = num1 + num2);
        } else if (operator.equals("-")) {
            System.out.println(sum = num1 - num2);

        } else if (operator.equals("*")) {
            System.out.println(sum = num1 * num2);

        } else if (operator.equals("/")) {
            System.out.println(sum = num1 / num2);

        }

        num.close();
        opr.close();
    }

}
