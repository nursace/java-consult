import java.util.Scanner;

public class Main {
    // main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // create a scanner object
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("----------------------------\n\n");

            System.out.print("Input a first number: ");
            Double a = scanner.nextDouble();

            System.out.print("Input a second number: ");
            Double b = scanner.nextDouble();

            System.out.print("Input an operation (+, -, *, /): ");
            Character c = scanner.next().charAt(0);

            Double result = calculator.evaluate(a, b, c);

            System.out.println("Result: " + result);
        }
    }
}

