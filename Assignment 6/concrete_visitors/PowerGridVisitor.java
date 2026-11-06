package concrete_visitors;

import concrete_elements.AtmosphericsBay;
import concrete_elements.Dorms;
import concrete_elements.MedicalBay;
import concrete_elements.SupermatterEngine;
import interface_visitor.IStationModuleVisitor;

public class PowerGridVisitor implements IStationModuleVisitor {
    private int netPowerBalanceKw = 0;

    @Override
    public void visitSupermatterEngine(SupermatterEngine engine) {
        netPowerBalanceKw += engine.getGeneratedPowerKw();
        System.out.println("[PowerGrid] Supermatter Engine output: +" + engine.getGeneratedPowerKw() + " kW");
    }

    @Override
    public void visitAtmosphericsBay(AtmosphericsBay atmos) {
        netPowerBalanceKw -= atmos.getPowerConsumptionKw();
        System.out.println("[PowerGrid] Atmospherics scrubbers drain: -" + atmos.getPowerConsumptionKw() + " kW");
    }

    @Override
    public void visitMedicalBay(MedicalBay medbay) {
        int medbayDrain = medbay.getActiveCryoPods() * 25;
        netPowerBalanceKw -= medbayDrain;
        System.out.println("[PowerGrid] Medical CryoPods drain: -" + medbayDrain + " kW");
    }

    @Override
    public void visitDorms(Dorms dorms){
        netPowerBalanceKw -= dorms.getHibernationPods() * 10;
        netPowerBalanceKw -= dorms.getStationPopulation() * 5;
    }

    public int getNetPowerBalanceKw() {
        return netPowerBalanceKw;
    }
}