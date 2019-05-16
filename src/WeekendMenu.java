public class WeekendMenu extends Menu {

    String appetizer;

    public WeekendMenu(String mainDish, String soup, String desert, String appetizer) {
        super(mainDish, soup, desert);
        this.appetizer = appetizer;
    }

    public String getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }
}
