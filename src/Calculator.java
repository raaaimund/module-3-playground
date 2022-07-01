import java.util.Scanner;

public class Calculator {
    private int number1;
    private int number2;

    public void letUserInputNumbersForCalculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number 1: ");
        number1 = scanner.nextInt();
        System.out.print("Number 2: ");
        number2 = scanner.nextInt();
    }

    public void add() {
        AddFeature addFeature = new AddFeature();
        addFeature.execute(number1, number2);
    }

    public void subtract() {
        int result = number1 - number2;
        System.out.printf("The result is %d.", result);
        System.out.println();
    }

    public void multiply() {
        int result = number1 * number2;
        System.out.printf("The result is %d.", result);
        System.out.println();
    }
}
