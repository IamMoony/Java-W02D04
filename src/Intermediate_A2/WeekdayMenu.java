package Intermediate_A2;

import Intermediate_A2.Menu;

public class WeekdayMenu extends Menu {

    public WeekdayMenu(String mainDish, Soup soup, String desert) {
        super(mainDish, soup, desert);
    }

    public String printMenu() {
        String printMenu = "The menu of today consists of " + this.getMainDish() + " as a main dish " + this.getSoup().getName() + " as a soup and " + this.getDesert() + " as a desert.";
        return printMenu;
    }
}
