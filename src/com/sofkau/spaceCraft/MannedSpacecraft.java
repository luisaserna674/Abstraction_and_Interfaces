package com.sofkau.spaceCraft;


/**
 * Description: This class describes the behavior of a Spacecraft manned.
 * In this case, this class implement the Interface 'Regulations' and it's
 * abstract methods.
 */
public class MannedSpacecraft extends SpaceCraft implements IRegulations{

    /**
     * Attributes
     */
    private String crewBossName;
    private boolean activatedSwitches, fuelCombination, activateCombustionChamber, oxygenActivated,
            gravity, man;

    MannedSpacecraft(){
        crewBossName = "Houston";
        activatedSwitches = false;
        fuelCombination = false;
        activateCombustionChamber = false;
        oxygenActivated = false;
        gravity = false;
        man = true;
    }
    MannedSpacecraft(String name, double length, double weight, double diameter,String origenCountry, boolean activatedSwitches, boolean fuelCombination, boolean activateCombustionChamber, boolean oxygenActivated, boolean gravity, boolean man, String crewBossName){
        super(name,length,weight,diameter,origenCountry);
        this.oxygenRegulation(oxygenActivated);
        this.temperatureRegulation();
        this.gravityRegulation(gravity);
        this.manned(man, crewBossName);

        this.TurnOn(activatedSwitches, fuelCombination);
        this.activateEngines(activateCombustionChamber);
        this.takeOff();
        this.speedUp();
        this.speedRegulation();
    }

    public String getCrewBossName() {
        return crewBossName;
    }

    public void setCrewBossName(String crewBossName) {
        this.crewBossName = crewBossName;
    }

    /**
     * Interface's methods
     */
    @Override
    public String oxygenRegulation(boolean oxygenActivated) {
        if (oxygenActivated)
            return "Oxygen Regulation Activated";
        else return "Oxygen Regulation not Activated, be careful, that's dangerous for your crew team!";

    }

    @Override
    public String temperatureRegulation() {
        return "Let's evaluate the temperature to manage it correctly!" + "\n"
                + "Temperature Regulated";
    }

    @Override
    public String gravityRegulation(boolean gravity) {
        if (gravity)
            return "Gravity Regulated";
        else return "Gravity NOT Regulated";
    }

    @Override
    public String manned(boolean man, String crewBossName) {
            this.setCrewBossName(crewBossName);
            return "This spacecraft is being manned by: " + this.getCrewBossName();

    }

    /**
     * Superclass Abstract methods
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
        return "Manned Spacecraft Information {"+ "\n" +
                "Spacecraft Name = " + this.getName() + "\n" +
                "This Spacecraft has a Length of = " + this.getLength() + " meters" + "\n" +
                "A Weight = " + this.getWeight() + " kilograms" + "\n" +
                "Diameter = " + this.getDiameter() + " meters" + "\n" +
                "It's Origen Country = " + this.getOrigenCountry() + "\n" +
                this.oxygenRegulation(oxygenActivated) + "\n" +
                this.temperatureRegulation() + "\n" +
                this.TurnOn(activatedSwitches, fuelCombination) + "\n" +
                "This Spacecraft has it's = " + this.activateEngines(activateCombustionChamber) + "\n" +
                this.takeOff() + "\n" + this.speedUp() + "\n" + this.speedRegulation() + "\n" +
                "This spacecraft has it's " + this.gravityRegulation(gravity) + "\n" +
                this.manned(man, crewBossName) + "\n" + "}" + "\n";
    }
}
