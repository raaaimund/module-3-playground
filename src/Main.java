import menu.*;
import menu.menuitems.AddMenuItem;
import menu.menuitems.ExitMenuItem;
import menu.menuitems.MultiplyMenuItem;
import menu.menuitems.SubtractMenuItem;

// -> tuesday
// interfaces
// enums
public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();

        while(menu.exitMenuItemIsNotSelected()) {
            menu.showMenu();
            menu.letUserSelectMenuItem();

            switch (menu.getSelectedMenuItem()) {
                case Menu.ADD_MENU_ITEM:
                    AddMenuItem addMenuItem = new AddMenuItem();
                    addMenuItem.execute();
                    break;
                case Menu.SUBTRACT_MENU_ITEM:
                    SubtractMenuItem subtractMenuItem = new SubtractMenuItem();
                    subtractMenuItem.execute();
                    break;
                case Menu.EXIT_MENU_ITEM:
                    ExitMenuItem exitMenuItem = new ExitMenuItem();
                    exitMenuItem.execute();
                    break;
                case Menu.MULTIPLY_MENU_ITEM:
                    MultiplyMenuItem multiplyMenuItem = new MultiplyMenuItem();
                    multiplyMenuItem.execute();
                default:
                    System.out.println("No such menu item.");
                    break;
            }
        }
    }
}
