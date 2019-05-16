package Intermediate_A2;

public class Soup {

    private String name;
    private String portionVolume;


    public Soup(String name, String portionVolume) {
        this.name = name;
        this.portionVolume = portionVolume;
    }

    public String getName() {
        return name;
    }

    public String getPortionVolume() {
        return portionVolume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPortionVolume(String portionVolume) {
        this.portionVolume = portionVolume;
    }
}

