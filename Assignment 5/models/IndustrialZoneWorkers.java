package models;

import strategies.SirenAlert;

public class IndustrialZoneWorkers extends Population{
    public IndustrialZoneWorkers() {
        super("Workers", new SirenAlert());
    }
}
