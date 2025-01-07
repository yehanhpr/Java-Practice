import java.util.Scanner;

public class GetUserInput {

    public static void main(String[] args) {

        String statmnt;

        Scanner name = new Scanner(System.in);

        System.out.print("Enter your name: ");

        statmnt = name.nextLine();

        System.out.println(" hi " + statmnt);

        name.close();
    }

}
