package models;

public class BioMonitor {
    private int counter = 0;

    public boolean isSafe() {
        System.out.println("1. Checking health indicators");
        return counter < 3;
    }

    public void addDose() {
        counter++;
    }
}