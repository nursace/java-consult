import java.util.Scanner;

public class Main {
    // main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // create a scanner object
        Calculator calculator = new Calculator();

        Double num1, num2 = null;

        System.out.print("Input an operation: ");
        Character operation = scanner.next().charAt(0);

        System.out.print("Input a num 1: ");
        num1 = scanner.nextDouble();
        if (operation != '$') {
            System.out.print("Input a num 2: ");
            num2 = scanner.nextDouble();
        }

        try {

            Double result = calculator.evaluate(num1, num2, operation);
            System.out.println("Result: " + Math.round(result * 100) / 100.0);

        } catch (RuntimeException e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}
