package concrete_elements;

import interface_element.IStationModule;
import interface_visitor.IStationModuleVisitor;

public class SupermatterEngine implements IStationModule {
    private final double crystalIntegrityPercent;
    private final double radiationSieverts;
    private final int generatedPowerKw;

    public SupermatterEngine(double crystalIntegrityPercent,double radiationSieverts,  int genaratedPowerKw) {
        this.crystalIntegrityPercent = crystalIntegrityPercent;
        this.radiationSieverts = radiationSieverts;
        this.generatedPowerKw = genaratedPowerKw;
    }

    public double getCrystalIntegrityPercent() {
        return crystalIntegrityPercent;
    }

    public double getRadiationSieverts() {return  radiationSieverts;}

    public int getGeneratedPowerKw() {return  generatedPowerKw;}

    @Override
    public void accept(IStationModuleVisitor visitor) {
        visitor.visitSupermatterEngine(this);
    }

}