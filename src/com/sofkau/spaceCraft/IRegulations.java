package com.sofkau.spaceCraft;

/**
 * Description: This interface has as a target define the methods that a
 * spacecraft needs to do when its already in the outer space.
 */
public interface IRegulations {
    String oxygenRegulation(boolean oxygenActivated);
    String temperatureRegulation();
    String gravityRegulation(boolean gravity);
    String manned(boolean man, String crewBossName);
}
