package menu;

import java.util.Scanner;

public class Menu {

    public static final int ADD_MENU_ITEM = 1;
    public static final int SUBTRACT_MENU_ITEM = 2;
    public static final int MULTIPLY_MENU_ITEM = 4;
    public static final int EXIT_MENU_ITEM = 3;

    private int selectedMenuItem;

    public int getSelectedMenuItem() {
        return selectedMenuItem;
    }

    public void setSelectedMenuItem(int selectedMenuItem) {
        this.selectedMenuItem = selectedMenuItem;
    }

    public void showMenu() {
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Exit");
    }

    public void letUserSelectMenuItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select menu item: ");
        this.selectedMenuItem = scanner.nextInt();
    }

    public boolean exitMenuItemIsNotSelected() {
        return this.selectedMenuItem != EXIT_MENU_ITEM;
    }
}
