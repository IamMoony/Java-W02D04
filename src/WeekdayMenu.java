public class WeekdayMenu extends Menu {

    public WeekdayMenu(String mainDish, Soup soup, String desert) {
        super(mainDish, soup, desert);
    }

    public getSoupOfTheDay() {
        String soupOfTheDay = "The soup of the day is " + this.soup;
    }

}
