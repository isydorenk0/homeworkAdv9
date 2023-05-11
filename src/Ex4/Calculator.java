package Ex4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double operand1 = returnDouble(scanner);
        double operand2 = returnDouble(scanner);

        Operation add = Double::sum;
        Operation substr = ((x, y) -> x - y);
        Operation mult = ((x, y) -> x * y);
        Operation div = ((x, y) -> x / y);

        System.out.println("Enter arithmetic operation: ");
        String sign = scanner.nextLine();
        switch (sign) {
            case "+" -> System.out.println(operand1 + " " + sign + " " + operand2 + " = " + add.operation(operand1, operand2));
            case "-" -> System.out.println(operand1 + " " + sign + " " + operand2 + " = " + substr.operation(operand1, operand2));
            case "*" -> System.out.println(operand1 + " " + sign + " " + operand2 + " = " + mult.operation(operand1, operand2));
            case "/" -> System.out.println(operand1 + " " + sign + " " + operand2 + " = " + div.operation(operand1, operand2));
        }
    }

    private static double returnDouble(Scanner scanner) {
        double number = 0.0;
        while (true) {
            System.out.println("Enter a number: ");
            try {
                number = Double.parseDouble(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("It must be a number");
            }
        }
        return number;
    }
}
