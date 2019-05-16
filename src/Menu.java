public class Menu {

   private String mainDish;
   private String desert;
   private String soup;


    public Menu(String mainDish, String desert, String soup) {
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

    public String getSoup() {
        return soup;
    }

    public void setMainDish(String mainDish) { 
        this.mainDish = mainDish;
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }

    public void setSoup(String soup) {
        this.soup = soup;
    }
}
