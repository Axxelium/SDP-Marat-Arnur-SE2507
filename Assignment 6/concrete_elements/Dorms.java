package concrete_elements;

import interface_element.IStationModule;
import interface_visitor.IStationModuleVisitor;

public class Dorms implements IStationModule {
    private final int stationPopulation;
    private final int hibernationPods;

    public Dorms(int stationPopulation, int hibernationPods) {
        this.stationPopulation = stationPopulation;
        this.hibernationPods = hibernationPods;
    }

    public int getStationPopulation() {
        return stationPopulation;
    }
    public int getHibernationPods() {
        return hibernationPods;
    }

    public void accept(IStationModuleVisitor visitor) {
        visitor.visitDorms(this);
    }
}


