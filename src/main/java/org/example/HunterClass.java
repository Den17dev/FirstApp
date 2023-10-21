package org.example;

public class HunterClass {

    private boolean isHunter;

    HunterClass(){

    }

    public HunterClass(boolean isHunter) {
        this.isHunter = isHunter;
    }

    public boolean isHunter() {
        return isHunter;
    }

    public void setHunter(boolean hunter) {
        isHunter = hunter;
    }
}
