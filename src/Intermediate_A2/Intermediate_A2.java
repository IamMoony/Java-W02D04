package Intermediate_A2;

public class Intermediate_A2 {

    public static void main(String[] args) {

        WeekdayMenu wdm1 = new WeekdayMenu("Spaghetti Carbonara", new Soup("The God Soup", "0.4l"), "Lord Cake");
        WeekdayMenu wdm2 = new WeekdayMenu("Pizza Al Capone", new Soup("Soup Good", "0.25l"), "Berry Muffin");
        WeekendMenu wem1 = new WeekendMenu("Lord Noodles", new Soup("Da Soup", "0.5l"), "Sweet Bread", "Gras With Sugar");
        WeekendMenu wem2 = new WeekendMenu("Kebab", new Soup("Bread Soup", "0.35l"), "Water With Sugar", "Sparkling Water");
        WeekendMenu wem3 = new WeekendMenu("Snake Salad", new Soup("Snake Blood Soup","0.4l"), "Choco Cake", "Shrimps");

        System.out.println(wdm1.printMenu());
        System.out.println(wem3.printMenu());
    }
}
