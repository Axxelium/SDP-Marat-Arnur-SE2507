package models;

import strategies.IMassAlert;

public abstract class Population {
    private final String populationName;
    private IMassAlert alertSystem;

    protected Population(String populationName, IMassAlert alertSystem) {
        this.populationName = populationName;
        this.alertSystem = alertSystem;
    }

    public void setAlertSystemStrategy(IMassAlert alertSystem) {
        this.alertSystem = alertSystem;
    }

    public void emergencySignal() {
        System.out.print(populationName + " receive alert: ");
        alertSystem.signalAttentionEveryone();
    }
}
