package org.Plants;

public class Tree extends Plant {
    private String variety;
    private String  trunkType;
    private double  trunkRadius;
    private String  color;
    private String  typeOfLeaves;

    public Tree() {
    }

    public Tree(String name, double stemHeight, boolean hasLeaves, String idealClimate, String variety, String trunkType, double trunkRadius, String color, String typeOfLeaves) {
        super(name, stemHeight, hasLeaves, idealClimate);
        this.variety = variety;
        this.trunkType = trunkType;
        this.trunkRadius = trunkRadius;
        this.color = color;
        this.typeOfLeaves = typeOfLeaves;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getTrunkType() {
        return trunkType;
    }

    public void setTrunkType(String trunkType) {
        this.trunkType = trunkType;
    }

    public double getTrunkRadius() {
        return trunkRadius;
    }

    public void setTrunkRadius(double trunkRadius) {
        this.trunkRadius = trunkRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeOfLeaves() {
        return typeOfLeaves;
    }

    public void setTypeOfLeaves(String typeOfLeaves) {
        this.typeOfLeaves = typeOfLeaves;
    }

    @Override
    public void whoIAm() {
        System.out.println("I'm a Tree!");
    }
}
