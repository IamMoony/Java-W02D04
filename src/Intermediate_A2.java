public class Intermediate_A2 {

    public static void main(String[] args) {

        WeekdayMenu wdm1 = new WeekdayMenu("Spaghetti Carbonara", "Tomato Soup", "Lord Cake");
        WeekdayMenu wdm2 = new WeekdayMenu("Pizza Al Capone", "Spargel Soup", "Berry Muffin");
        WeekendMenu wem1 = new WeekendMenu("Lord Noodles", "Creamy Soup", "Sweet Bread", "Gras With Sugar");
        WeekendMenu wem2 = new WeekendMenu("Kebab", "Water Soup", "Water With Sugar", "Sparkling Water");
        WeekendMenu wem3 = new WeekendMenu("Snake Salad", new Soup("Snake Blood Soup","0.4l"), "Choco Cake", "Shrimps");
    }
}
