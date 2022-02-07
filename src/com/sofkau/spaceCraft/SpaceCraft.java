package com.sofkau.spaceCraft;

/**
 * Description: This class describes the template to create a
 * spacecraft. This one is going to define abstract methods that will
 * allow to create a custom spacecraft.
 */
public abstract class SpaceCraft {
    /**
     * Attributes
     */
    private String name ,origenCountry;
    private double length, weight, diameter;

    public SpaceCraft(String name, double length, double weight, double diameter, String origenCountry) {
        this.name = name;
        this.length = length;
        this.weight = weight;
        this.diameter = diameter;
        this.origenCountry = origenCountry;
    }

    SpaceCraft(){
        name = "";
        length = 100;
        weight = 2000000;
        diameter = 88;
        origenCountry = "";
    }

    /**
     * Abstract methods
     */

    public abstract String TurnOn(boolean activatedSwitches, boolean fuelCombination);//Encender
    public abstract String activateEngines(boolean activateCombustionChamber);//activar propulsores
    public abstract String takeOff();//despegar
    public abstract String speedUp();//Acelerar
    public abstract String speedRegulation();

    /**
     * Setter and Getter methods from the spacecraft
     */
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public String getOrigenCountry() {
        return origenCountry;
    }

    public void setOrigenCountry(String origenCountry) {
        this.origenCountry = origenCountry;
    }
}
