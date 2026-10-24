import models.CityCitizens;
import models.DistantRuralCitizens;
import models.ForeignCitizens;
import models.HomeboundCitizens;
import models.IndustrialZoneWorkers;
import models.Population;
import strategies.CellBroadcastAlert;
import strategies.SmsBroadcastAlert;
import strategies.SirenAlert;

public class Main {
    public static void main(String[] args) {
        Population cityCitizens = new CityCitizens();
        Population ruralPeoples = new DistantRuralCitizens();
        Population homeboundCitizens = new HomeboundCitizens();
        Population industrialWorkers = new IndustrialZoneWorkers();
        Population foreignTourists = new ForeignCitizens();

        System.out.println("Initial Emergency Alert Broadcast");
        cityCitizens.emergencySignal();
        ruralPeoples.emergencySignal();
        homeboundCitizens.emergencySignal();
        industrialWorkers.emergencySignal();
        foreignTourists.emergencySignal();

        System.out.println("\n Runtime strategy switchig");

        System.out.print("Citizens get SMS alert \n");
        cityCitizens.setAlertSystemStrategy(new SmsBroadcastAlert());
        cityCitizens.emergencySignal();

        System.out.print("Citizens hear sirens \n");
        cityCitizens.setAlertSystemStrategy(new SirenAlert());
        cityCitizens.emergencySignal();

        System.out.print("Tourists outdoors: ");
        foreignTourists.setAlertSystemStrategy(new SirenAlert());
        foreignTourists.emergencySignal();
    }
}