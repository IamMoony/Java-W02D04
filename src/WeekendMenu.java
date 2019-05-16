public class WeekendMenu extends Menu {

    private String appetizer;

    public WeekendMenu(String mainDish, Soup soup, String desert, String appetizer) {
        super(mainDish, soup, desert);
        this.appetizer = appetizer;
    }

    public String getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }

    public String printMenu() {
        String printMenu = "The menu of today consists of " + this.getAppetizer() + " as an appetizer " + this.getMainDish() + " as the main dish " + this.getSoup().getName() + " as a soup and " + this.getDesert() + " as a desert.";
        return printMenu;
    }
}
