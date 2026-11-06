package interface_visitor;

import concrete_elements.AtmosphericsBay;
import concrete_elements.MedicalBay;
import concrete_elements.SupermatterEngine;
import concrete_elements.Dorms;

public interface IStationModuleVisitor {
    void visitMedicalBay(MedicalBay medbay);
    void visitAtmosphericsBay(AtmosphericsBay atmos);
    void visitSupermatterEngine(SupermatterEngine engine);
    void visitDorms(Dorms dorms);
}
