package com.sofkau.spaceCraft;

/**
 * Description: This class represents the Launch Spacecraft behavior,
 * then it extends some abstract methods from the "Super class" Spacecraft
 * and implements the functionalities specified in the interface Orbit
 */

public class LaunchSpacecraft extends SpaceCraft implements IOrbit{
    /**
     * Attirbutes
     */
    private String freightName;
    private double freightWeight;
    private boolean monitor, activatedSwitches, fuelCombination, activateCombustionChamber;

    LaunchSpacecraft(){
        freightWeight = 2000000;
        freightName = "";
        monitor = false;
        activatedSwitches = false;
        fuelCombination = false;
        activateCombustionChamber = false;
    }

    /**
     * constructor of the class Launch Spacecraft
     * @param name sets the attribute name of the "super class"
     * @param length sets the attribute length of the "super class"
     * @param weight sets the attribute weight of the "super class"
     * @param diameter sets the attribute diameter of the "super class"
     * @param origenCountry sets the attribute origen country of the "super class"
     * @param freightName
     * @param freightWeight
     * @param monitor
     * @param activatedSwitches
     * @param fuelCombination
     * @param activateCombustionChamber
     */
    public LaunchSpacecraft(String name, double length, double weight, double diameter,String origenCountry, String freightName, double freightWeight,boolean monitor, boolean activatedSwitches, boolean fuelCombination, boolean activateCombustionChamber) {
        super(name,length,weight,diameter,origenCountry);
        this.freightName = freightName;
        this.freightWeight = freightWeight;
        this.monitoringArea(monitor);
        this.TurnOn(activatedSwitches, fuelCombination);
        this.activateEngines(activateCombustionChamber);
        this.takeOff();
        this.speedUp();

        this.speedRegulation();
        this.separatingParts();
    }

    /**
     * Abstract methods
     *
     */

    /**
     * Method to turn on a spacecraft
     * @param activatedSwitches
     * @param fuelCombination
     * @return the turn state of the spacecraft
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

    /**
     * Abstract Interface's Methods
     */

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
     * Getters and setters
     */

    public double getFreightWeight() {
        return freightWeight;
    }

    public void setFreightWeight(float freightWeight) {
        this.freightWeight = freightWeight;
    }

    public String getFreightName() {
        return freightName;
    }

    public void setFreightName(String freightName) {
        this.freightName = freightName;
    }


    public String toString() {
        return "LaunchSpacecraft Information {"+ "\n" +
                "Spacecraft Name = " + this.getName() + "\n" +
                "This Spacecraft has a Length of = " + this.getLength() + " meters" + "\n" +
                "A Weight = " + this.getWeight() + " kilograms" + "\n" +
                "Diameter = " + this.getDiameter() + " meters" + "\n" +
                "It's Origen Country = " + this.getOrigenCountry() + "\n" +
                "This spacecraft is = " + this.monitoringArea(monitor) + "\n" + this.TurnOn(activatedSwitches, fuelCombination) + "\n" +
                "This Spacecraft has it's = " + this.activateEngines(activateCombustionChamber) + "\n" +
                this.takeOff() + "\n" + this.speedUp() + "\n" + this.speedRegulation() + "\n" +
                "This spacecraft is " + this.separatingParts() + "\n" + "}"  + "\n";
    }
}