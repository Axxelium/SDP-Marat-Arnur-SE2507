package models;

import strategies.SatelliteAlert;

public class DistantRuralCitizens extends Population {
    public DistantRuralCitizens() {
        super("Distant rural citizens",new SatelliteAlert());
    }
}
