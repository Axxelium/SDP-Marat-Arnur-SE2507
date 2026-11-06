package concrete_visitors;

import concrete_elements.AtmosphericsBay;
import concrete_elements.Dorms;
import concrete_elements.MedicalBay;
import concrete_elements.SupermatterEngine;
import interface_visitor.IStationModuleVisitor;

public class HazardAlertVisitor implements IStationModuleVisitor {
    @Override
    public void visitSupermatterEngine(SupermatterEngine engine) {
        if (engine.getCrystalIntegrityPercent() < 50.0 || engine.getRadiationSieverts() > 15.0) {
            System.out.println("[ALERT] Supermatter explosion risk! Integrity: " + engine.getCrystalIntegrityPercent() + "%");
        } else {
            System.out.println("[OK] Supermatter crystal stable.");
        }
    }

    @Override
    public void visitAtmosphericsBay(AtmosphericsBay atmos) {
        if (atmos.getPlasmaContaminationPpm() > 0.0) {
            System.out.println("[ALERT] Plasma leak in Atmospherics: " + atmos.getPlasmaContaminationPpm() + " ppm!");
        } else {
            System.out.println("[OK] Air mixture nominal (" + atmos.getOxygenPressureKpa() + " kPa O2).");
        }
    }

    @Override
    public void visitMedicalBay(MedicalBay medbay) {
        if (medbay.isViralOutbreakDetected()) {
            System.out.println("[ALERT] Biohazard quarantine active in Medbay!");
        } else {
            System.out.println("[OK] Medbay sterile. Biomass reserve: " + medbay.getCloningBiomassUnits() + " u.");
        }
    }

    @Override
    public void visitDorms(Dorms dorms) {
        if (dorms.getStationPopulation() < 30) {
            System.out.println("[ALERT] Station population too low for maintenance a station. " +
                    "\n Minimal staff at shift is 30 employees");
        }
    };
}