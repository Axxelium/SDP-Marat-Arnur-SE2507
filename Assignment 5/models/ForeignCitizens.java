package models;

import strategies.SmsBroadcastAlert;

public class ForeignCitizens extends Population {
    public ForeignCitizens() {
        super("Foreign citizens",new SmsBroadcastAlert());
    }
}
