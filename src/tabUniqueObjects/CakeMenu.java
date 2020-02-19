package tabUniqueObjects;

import java.util.Objects;

public class CakeMenu {
    private String name;
    private String flavour;
    private int numberOfLayers;

    public CakeMenu(String name, String flavour, int numberOfLayers) {
        this.name = name;
        this.flavour = flavour;
        this.numberOfLayers = numberOfLayers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public int getNumberOfLayers() {
        return numberOfLayers;
    }

    public void setNumberOfLayers(int numberOfLayers) {
        this.numberOfLayers = numberOfLayers;
    }

    @Override
    public String toString() {
        return "Cake  " +
                "name='" + name + '\'' +
                ", flavour='" + flavour + '\'' +
                ", numberOfLayers=" + numberOfLayers;
    }

    public void showInfo(){
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CakeMenu cakeMenu = (CakeMenu) o;
        return numberOfLayers == cakeMenu.numberOfLayers &&
                Objects.equals(name, cakeMenu.name) &&
                Objects.equals(flavour, cakeMenu.flavour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, flavour, numberOfLayers);
    }

}
