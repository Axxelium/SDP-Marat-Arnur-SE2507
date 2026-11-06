
package concrete_elements;

import interface_element.IStationModule;
import interface_visitor.IStationModuleVisitor;

public class AtmosphericsBay implements IStationModule {
    private final double oxygenPressureKpa;
    private final double plasmaContaminationPpm;
    private final int powerConsumptionKw;

    public AtmosphericsBay(double oxygenPressureKpa, double plasmaContaminationPpm, int powerConsumptionKw) {
        this.oxygenPressureKpa = oxygenPressureKpa;
        this.plasmaContaminationPpm = plasmaContaminationPpm;
        this.powerConsumptionKw = powerConsumptionKw;
    }

    public double getOxygenPressureKpa() {
        return oxygenPressureKpa;
    }

    public double getPlasmaContaminationPpm() {
        return plasmaContaminationPpm;
    }

    public int getPowerConsumptionKw() {
        return powerConsumptionKw;
    }

    @Override
    public void accept(IStationModuleVisitor visitor) {
        visitor.visitAtmosphericsBay(this);
    }
}