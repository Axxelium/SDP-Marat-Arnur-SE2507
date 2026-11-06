package concrete_visitors;

import concrete_elements.AtmosphericsBay;
import concrete_elements.Dorms;
import concrete_elements.MedicalBay;
import concrete_elements.SupermatterEngine;
import interface_visitor.IStationModuleVisitor;

import java.sql.SQLOutput;

public class CentComManifestVisitor implements IStationModuleVisitor {
    @Override
    public void visitSupermatterEngine(SupermatterEngine engine) {
        System.out.println("LOG::ENGINE[integrity=" + engine.getCrystalIntegrityPercent() + "%,rad=" + engine.getRadiationSieverts() + "Sv]");
    }

    @Override
    public void visitAtmosphericsBay(AtmosphericsBay atmos) {
        System.out.println("LOG::ATMOS[o2=" + atmos.getOxygenPressureKpa() + "kPa,plasma=" + atmos.getPlasmaContaminationPpm() + "ppm]");
    }

    @Override
    public void visitMedicalBay(MedicalBay medbay) {
        System.out.println("LOG::MEDBAY[cryo=" + medbay.getActiveCryoPods() + ",biomass=" + medbay.getCloningBiomassUnits() + "]");
    }

    @Override
    public void visitDorms(Dorms dorms) {
        System.out.println("LOG::DORM[population=" + dorms.getStationPopulation() + ",hibernated=" + dorms.getHibernationPods() + "]");
    }
}