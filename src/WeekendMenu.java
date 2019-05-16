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
}
