package org.Plants;

public class Flower extends Plant {
    private String petalColor;
    private int numberOfPetals;
    private String pistilColor;
    private String variety;
    private String season;

    public Flower() {
    }

    public Flower(String name, double stemHeight, boolean hasLeaves, String idealClimate, String petalColor, int numberOfPetals, String pistilColor, String variety, String season) {
        super(name, stemHeight, hasLeaves, idealClimate);
        this.petalColor = petalColor;
        this.numberOfPetals = numberOfPetals;
        this.pistilColor = pistilColor;
        this.variety = variety;
        this.season = season;
    }

    public String getPetalColor() {
        return petalColor;
    }

    public void setPetalColor(String petalColor) {
        this.petalColor = petalColor;
    }

    public int getNumberOfPetals() {
        return numberOfPetals;
    }

    public void setNumberOfPetals(int numberOfPetals) {
        this.numberOfPetals = numberOfPetals;
    }

    public String getPistilColor() {
        return pistilColor;
    }

    public void setPistilColor(String pistilColor) {
        this.pistilColor = pistilColor;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public void whoIAm() {
        System.out.println("I'm a Flower!");
    }
}
