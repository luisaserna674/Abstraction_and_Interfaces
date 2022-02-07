package com.sofkau.spaceCraft;

/**
 * Description: This interface contains the functionalities that a
 * spacecraft needs to maintain it's self in orbit.
 */
public interface IOrbit {
    String separatingParts();
    String monitoringArea(boolean monitoring);
}
