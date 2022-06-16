import java.io.Serializable;

public class Plane implements Serializable {

    private float fuelLevel;
    private String pilotCallSign;
    private String squadNumber;
    private boolean flaps;
    private boolean landingGear;
    private boolean ejectionSystem;
    private boolean seatOccupation;

    public Plane(float fuelLevel, String pilotCallSign, String squadNumber) {
        this.fuelLevel = fuelLevel;
        this.pilotCallSign = pilotCallSign;
        this.squadNumber = squadNumber;

        this.flaps = true;
        this.landingGear = false;
        this.ejectionSystem = false;
        this.seatOccupation = true;

    }

    public void toggleFlaps() {
        flaps = !flaps;
    }

    public void toggleLandingGear() {
        landingGear = !landingGear;
    }

    public void ejectionSystem() {
        ejectionSystem = !ejectionSystem;
    }

    public void setSeatOccupation(boolean pilotSeated) {
        seatOccupation = pilotSeated;
    }

    public boolean getEjectionSystem() {
        return this.ejectionSystem;
    }

    @Override
    public String toString() {

        String flapStatus;
        String landingGearStatus;
        String ejectionSystemStatus;
        String seatStatus;

        if (flaps) {
            flapStatus = "Arriba";
        } else {
            flapStatus = "Abajo";
        }

        if (landingGear) {
            landingGearStatus = "Arriba";
        } else {
            landingGearStatus = "Abajo";
        }

        if (ejectionSystem) {
            ejectionSystemStatus = "Armado";
        } else {
            ejectionSystemStatus = "Desarmado";
        }

        if (seatOccupation) {
            seatStatus = "Verdadero";
        } else {
            seatStatus = "Falso";
        }

        String output = "\t\t\t\t************\n";
        output += "\t\t\t\t\tF18";
        output += "\n\t\t\t\t************\n";
        output += "Fuel level: " + fuelLevel + " l ";
        output += "Pilot nickname: " + pilotCallSign + " ";
        output += "Squad tag: " + squadNumber + " ";
        output += "\nEstado de los flaps --> " + flapStatus;
        output += "\nEstado del tren de aterrizaje --> " + landingGearStatus;
        output += "\nEstado del sistema de eyeccion --> " + ejectionSystemStatus;
        output += "\nEstado del asiento --> " + seatStatus;
        return output;
    }
}

