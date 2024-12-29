import java.util.Scanner;

public class GetUserInput {

    public static void main(String[] args) {

        System.out.print("Enter your name: ");

        Scanner name = new Scanner(System.in);
        System.out.println(name.next());
        name.close();
    }

}
