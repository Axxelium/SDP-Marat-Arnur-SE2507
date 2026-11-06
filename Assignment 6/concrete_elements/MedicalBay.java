package concrete_elements;

import interface_element.IStationModule;
import interface_visitor.IStationModuleVisitor;

public class MedicalBay implements IStationModule {
    private final int activeCryoPods;
    private final int cloningBiomassUnits;
    private final boolean viralOutbreakDetected;

    public MedicalBay(int activeCryoPods, int cloningBiomassUnits, boolean viralOutbreakDetected) {
        this.activeCryoPods = activeCryoPods;
        this.cloningBiomassUnits = cloningBiomassUnits;
        this.viralOutbreakDetected = viralOutbreakDetected;
    }

    public int getActiveCryoPods() {
        return activeCryoPods;
    }

    public int getCloningBiomassUnits() {
        return cloningBiomassUnits;
    }

    public boolean isViralOutbreakDetected() {
        return viralOutbreakDetected;
    }

    @Override
    public void accept(IStationModuleVisitor visitor) {
        visitor.visitMedicalBay(this);
    }
}