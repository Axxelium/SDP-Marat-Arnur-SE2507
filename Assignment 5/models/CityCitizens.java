package models;

import strategies.CellBroadcastAlert;

public class CityCitizens extends Population {
    public CityCitizens() {
        super("City citizens",new CellBroadcastAlert());
    }
}
