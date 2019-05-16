package Intermediate_A2;

public class Menu {

   private String mainDish;
   private String desert;
   private Soup soup;


    public Menu(String mainDish, Soup soup, String desert) {
        this.mainDish = mainDish;
        this.desert = desert;
        this.soup = soup;
    }

    public String getMainDish() {
        return mainDish;
    }

    public String getDesert() {
        return desert;
    }

    public Soup getSoup() {
        return soup;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }

    public void setSoup(Soup soup) {
        this.soup = soup;
    }

    public String getSoupOfTheDay() {
        String soupOfTheDay = "The soup of the day is " + soup;
        return soupOfTheDay;
    }
}
