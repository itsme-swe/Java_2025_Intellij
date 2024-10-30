package ExceptionalHandling.ArithmeticException;

import java.util.Scanner;

public class ArithmeticDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the value of a to divide with b: ");
        int a = sc.nextInt();

        System.out.print("Please enter the value b to divide with a: ");
        int b = sc.nextInt();

        try {
            int c = a / b;
            System.out.println("The division of a and b is " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0, try again.");
        }
        System.out.println("Bye");

    }
}
