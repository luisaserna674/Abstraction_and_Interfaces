package com.sofkau.spaceCraft;

/**
 * Description: It's define to create a spacecraft manned
 * by a monitoring system to study some celestial bodies
 */

public class NotMannedSpacecraft extends SpaceCraft implements IOrbit{
    /**
     * Attributes
     */

    private boolean monitoring, activatedSwitches, fuelCombination, activateCombustionChamber;

    NotMannedSpacecraft(String name, double length, double weight, double diameter,String origenCountry, boolean monitoring, boolean activatedSwitches, boolean fuelCombination, boolean activateCombustionChamber){
        super(name,length,weight,diameter,origenCountry);
        this.monitoringArea(monitoring);
        this.TurnOn(activatedSwitches, fuelCombination);
        this.activateEngines(activateCombustionChamber);
        this.takeOff();
        this.speedUp();

        this.speedRegulation();
        this.separatingParts();
    }

    @Override
    public String separatingParts() {
        return "Disconnecting Grips and separating parts";
    }

    @Override
    public String monitoringArea(boolean monitoring) {
        String stateMonitor;
        if (monitoring)
            stateMonitor = "Monitoring";
        else stateMonitor = "Not  Monitoring";
        return stateMonitor;
    }

    /**
     * Abstract methods
     */

    @Override
    public String TurnOn(boolean activatedSwitches, boolean fuelCombination) {
        if (activatedSwitches && fuelCombination) {
            return("This spacecraft is Already TurnOn");
        } else {
            return("This spacecraft is not TurnOn");
        }
    }

    @Override
    public String activateEngines(boolean activateCombustionChamber) {
        String engineStates;
        if (activateCombustionChamber)
            engineStates = "Engines Activated";
        else engineStates = "Engines Not Activated";
        return engineStates;
    }

    @Override
    public String takeOff() {
        return "Initiating Takeoff!";
    }

    @Override
    public String speedUp() {
        return "Speeding Up!";
    }

    @Override
    public String speedRegulation() {
        return "Regulation Speed!";
    }

    public String toString() {
        return "Not Manned Spacecraft Information {"+ "\n" +
                "Spacecraft Name = " + this.getName() + "\n" +
                "This Spacecraft has a Length of = " + this.getLength() + " meters" + "\n" +
                "A Weight = " + this.getWeight() + " kilograms" + "\n" +
                "Diameter = " + this.getDiameter() + " meters" + "\n" +
                "It's Origen Country = " + this.getOrigenCountry() + "\n" +
                "This spacecraft is = " + this.monitoringArea(monitoring) + "\n" + this.TurnOn(activatedSwitches, fuelCombination) + "\n" +
                "This Spacecraft has it's = " + this.activateEngines(activateCombustionChamber) + "\n" +
                this.takeOff() + "\n" + this.speedUp() + "\n" + this.speedRegulation() + "\n" +
                "This spacecraft is " + this.separatingParts() + "\n" + "}"  + "\n";
    }
}
