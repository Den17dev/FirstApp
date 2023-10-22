package org.example;

public class HunterClass {

    private boolean isHunter;

    private double level;

    private int honor;

    public HunterClass(boolean isHunter, double level, int honor) {
        this.isHunter = isHunter;
        this.level = level;
        this.honor = honor;
    }

    HunterClass(){

    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public boolean isHunter() {
        return isHunter;
    }

    public void setHunter(boolean hunter) {
        isHunter = hunter;
    }

    public void voidMethod(){
        System.out.println("Hunter Class");
    }
}