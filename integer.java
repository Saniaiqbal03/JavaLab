import java.util.Scanner;

public class IntegerDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the second number: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}