package models;

import strategies.TvRadioBroadcastAlert;

public class HomeboundCitizens extends Population {
    public HomeboundCitizens() {
        super("Homebound citizens",new TvRadioBroadcastAlert());
    }
}
