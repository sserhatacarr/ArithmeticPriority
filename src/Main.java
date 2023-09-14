import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter first number : ");
        a = input.nextInt();
        System.out.print("Enter second number : ");
        b = input.nextInt();
        System.out.print("Enter third number : ");
        c = input.nextInt();

        // Taking input of three integers from the user.

        System.out.println(a+b*c-b);

        // Performing arithmetic operations on them and displaying the result.
    }

}