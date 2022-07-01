package menu.menuitems;

import java.util.Scanner;

public class SubtractMenuItem extends MenuItem {
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();
        int result = num1 - num2;
        System.out.printf("The result is %d.", result);
        System.out.println();
    }
}
