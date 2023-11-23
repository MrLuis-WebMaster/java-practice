package org.Plants;

public class Bush extends Plant {
    private double bushWidth;
    private boolean isDomestic;
    private String colorOfLeaves;
    private String variety;
    private boolean pruningOrNot;

    public Bush() {
    }

    public Bush(String name, double stemHeight, boolean hasLeaves, String idealClimate, double bushWidth, boolean isDomestic, String colorOfLeaves, String variety, boolean pruningOrNot) {
        super(name, stemHeight, hasLeaves, idealClimate);
        this.bushWidth = bushWidth;
        this.isDomestic = isDomestic;
        this.colorOfLeaves = colorOfLeaves;
        this.variety = variety;
        this.pruningOrNot = pruningOrNot;
    }

    public double getBushWidth() {
        return bushWidth;
    }

    public void setBushWidth(double bushWidth) {
        this.bushWidth = bushWidth;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean domestic) {
        isDomestic = domestic;
    }

    public String getColorOfLeaves() {
        return colorOfLeaves;
    }

    public void setColorOfLeaves(String colorOfLeaves) {
        this.colorOfLeaves = colorOfLeaves;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public boolean isPruningOrNot() {
        return pruningOrNot;
    }

    public void setPruningOrNot(boolean pruningOrNot) {
        this.pruningOrNot = pruningOrNot;
    }

    @Override
    public void whoIAm() {
        System.out.println("I'm a Bush!");
    }
}
