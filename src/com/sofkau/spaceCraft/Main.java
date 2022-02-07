package com.sofkau.spaceCraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Description: This console application allow us to create
 * Spacecrafts to navigate across the space. ☺☻
 * @author Luisa Fernanda Serna Mosquera
 * @version 1.0
 * @since 05/02/2022
 */
public class Main {
    public static void main(String[] args) {
        spaceCraftsCreated().forEach(n ->System.out.println(n.toString()));

        boolean contador = true;

        String freightName, crewBossName;
        double freightWeight = 0;
        boolean monitor = false, man = false;


        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println(
                    """
                            ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
                            ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥ WELCOME TO SPACECRAFTS WORLD ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
                            ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
                            Let's create your own spacecraft"""
            );
            System.out.print("Write the name of your creation: ");
            String spacecraftName = scanner.nextLine();

            System.out.println(
                    "♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥ WHAT ARE THE SIZES? ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
            System.out.print("Write the length: ");
            double spacecraftLength = scanner.nextDouble();
            System.out.print("Write the weight: ");
            double spacecraftWeight = scanner.nextDouble();
            System.out.print("Write the diameter: ");
            double spacecraftDiameter = scanner.nextDouble();
            //SCANNERS
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);

            System.out.println(
                    "♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥ RIGHT! ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
            System.out.print("What's the country where would you like to build this experiment?: ");
            String spacecraftCountry = scanner1.nextLine();
            System.out.println(
                    "♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥LET'S BEGIN TO CREATE IT! ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
            System.out.println("Would you like to explore the celestial bodies's infinity? ");
            System.out.println("1. Yes");
            System.out.println("2. No");
            String option = scanner1.nextLine();

            switch (option) {
                case "1" -> {
                    System.out.println("Would you like your spacecraft been manned? ");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    String option2 = scanner1.nextLine();
                    if (option2.contains("1")) {
                        System.out.println("Then you want to create a Manned Spacecraft! Great Decision!");
                        System.out.println(
                                "♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥LET'S BEGIN WITH IT! ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
                        System.out.print("What's going to be the name of your crew team boss?: ");
                        String option3 = scanner1.nextLine();
                        crewBossName = option3;
                        MannedSpacecraft mannedcreated = new MannedSpacecraft(spacecraftName, spacecraftLength, spacecraftWeight, spacecraftDiameter, spacecraftCountry, true, true, true, false, true, true, crewBossName);
                        System.out.println(mannedcreated);
                    } else if (option2.contains("2")) {
                        System.out.println("Then you want to create a Not Manned Spacecraft! That's Great!");
                        System.out.println(
                                "♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥LET'S BEGIN WITH IT! ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
                        System.out.println("Do you want to monitor the area?: ");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        String option4 = scanner1.nextLine();
                        if (option4 == "1")
                            monitor = true;
                        else monitor = false;
                        NotMannedSpacecraft notMannedCreation = new NotMannedSpacecraft(spacecraftName, spacecraftLength, spacecraftWeight, spacecraftDiameter, spacecraftCountry, monitor, true, true, true);
                        System.out.println(notMannedCreation);
                    }
                }
                case "2" -> {
                    System.out.println("Would you like to sent something to the outer space? ");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    String option5 = scanner2.nextLine();
                    if (option5.contains("1")) {
                        System.out.println("Then you want to create a Manned Spacecraft! Great Decision!");
                        System.out.println(
                                "♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥LET'S BEGIN WITH IT! ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
                        System.out.print("What's going to be the name of your crew team boss?: ");
                        String option4 = scanner2.nextLine();
                        crewBossName = option4;
                        MannedSpacecraft mannedcreated = new MannedSpacecraft(spacecraftName, spacecraftLength, spacecraftWeight, spacecraftDiameter, spacecraftCountry, true, true, true, false, true, true, crewBossName);
                        System.out.println(mannedcreated);
                    } else if (option5.contains("2")) {
                        System.out.println("Then you want to create a Launch Spacecraft! You wanna be part of a great expedition!");
                        System.out.println(
                                "♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥LET'S BEGIN WITH IT! ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
                        System.out.print("What's the freight's name that you wanna sent?:  ");
                        String option6 = scanner2.nextLine();
                        freightName = option6;
                        System.out.print("What's the freight's weight that you wanna sent?:  ");
                        double option7 = scanner2.nextDouble();
                        freightWeight = option7;
                        System.out.print("Do you want to monitor the area?: ");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        String option8 = scanner2.nextLine();
                        if (option8 == "1")
                            monitor = true;
                        else monitor = false;
                        LaunchSpacecraft launchCreation = new LaunchSpacecraft(spacecraftName, spacecraftLength, spacecraftWeight, spacecraftDiameter, spacecraftCountry, freightName, freightWeight, monitor, true, true, true);
                        System.out.println(launchCreation);
                    }
                }
                default -> {
                }
            }

            Scanner scanner3 = new Scanner(System.in);
            System.out.println(
                    "♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥YOU JUST FINISHED YOUR CREATION!♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
            System.out.println("Would you like to: ");
            System.out.println("1. Finish the building");
            System.out.println("2. Continue");
            String option9 = scanner3.nextLine();
            switch (option9) {
                case "1":
                    contador = false;
                    break;
                case "2":
                    contador = true;
                    break;
            }
        }
        while(contador);



    }


    public static List spaceCraftsCreated(){
        List<SpaceCraft> creatingSpaceCrafts = new ArrayList<>();

        LaunchSpacecraft launch = new LaunchSpacecraft("Launch Spacecraft XRY36E", 55.4, 2000000, 58, "USA", "Missiles", 15892, true, true, true, true);
        creatingSpaceCrafts.add(launch);

        MannedSpacecraft manned = new MannedSpacecraft("Manned Spacecraft 513", 800, 1800000, 89, "Russia", true, true, true, false, true, false, "Luisa");
        creatingSpaceCrafts.add(manned);

        NotMannedSpacecraft notManned1 = new NotMannedSpacecraft("Dragon 899", 5000, 5000, 150, "China", true, true, true, true);
        creatingSpaceCrafts.add(notManned1);

        NotMannedSpacecraft notManned2 = new NotMannedSpacecraft("Scorpion 894V2", 580, 6400, 60, "Colombia", true, true, true, true);
        creatingSpaceCrafts.add(notManned2);

        return creatingSpaceCrafts;
    }


}


