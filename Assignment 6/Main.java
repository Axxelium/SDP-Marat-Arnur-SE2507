import concrete_elements.AtmosphericsBay;
import concrete_elements.Dorms;
import concrete_elements.MedicalBay;
import concrete_elements.SupermatterEngine;
import concrete_visitors.CentComManifestVisitor;
import concrete_visitors.HazardAlertVisitor;
import concrete_visitors.PowerGridVisitor;
import interface_element.IStationModule;
import interface_visitor.IStationModuleVisitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IStationModule> stationModules = List.of(
                new SupermatterEngine(42.5, 18.2, 850),
                new AtmosphericsBay(101.3, 12.5, 120),
                new MedicalBay(4, 300, false),
                new Dorms(24, 6)
        );

        System.out.println("=== 1. POWER GRID AUDIT ===");
        PowerGridVisitor powerVisitor = new PowerGridVisitor();
        for (IStationModule module : stationModules) {
            module.accept(powerVisitor);
        }
        System.out.println("Total Station Net Power: " + powerVisitor.getNetPowerBalanceKw() + " kW\n");

        System.out.println("=== 2. HAZARD DIAGNOSTICS ===");
        IStationModuleVisitor hazardVisitor = new HazardAlertVisitor();
        for (IStationModule module : stationModules) {
            module.accept(hazardVisitor);
        }

        System.out.println("\n=== 3. CENTCOM TELEMETRY EXPORT ===");
        IStationModuleVisitor manifestVisitor = new CentComManifestVisitor();
        for (IStationModule module : stationModules) {
            module.accept(manifestVisitor);
        }
    }
}