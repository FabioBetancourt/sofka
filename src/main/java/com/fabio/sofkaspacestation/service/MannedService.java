package com.fabio.sofkaspacestation.service;

import com.fabio.sofkaspacestation.dao.MannedDAO;
import com.fabio.sofkaspacestation.model.Manned;

import java.util.Scanner;
public class MannedService {
    public static void createManned(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the Spaceship name: ");
        String spaceshipName = sc.nextLine();

        System.out.println("Type the weight of the Spaceship: ");
        Integer weight = sc.nextInt();

        sc.nextLine();

        System.out.println("Type the author of the Spaceship: ");
        String author = sc.nextLine();

        System.out.println("Type the gas of the Spaceship: ");
        String gas = sc.nextLine();

        System.out.println("Type the velocity of displacement of the Spaceship: ");
        Double velocityOfDisplacement = sc.nextDouble();

        System.out.println("Type the pushing force of the Spaceship: ");
        Double pushingForce = sc.nextDouble();

        System.out.println("Type the orbital displacement speed of the Spaceship: ");
        Double orbitalDisplacementSpeed = sc.nextDouble();

        System.out.println("Type the human capacity of the Spaceship: ");
        Integer capacity = sc.nextInt();

        sc.nextLine();

        System.out.println("Type the mission objetive of the Spaceship: ");
        String missionObjetive = sc.nextLine();

        Manned register = new Manned();
        register.setSpaceshipName(spaceshipName);
        register.setWeight(weight);
        register.setAuthor(author);
        register.setGas(gas);
        register.setVelocityOfDisplacement(velocityOfDisplacement);
        register.setPushingForce(pushingForce);
        register.setOrbitalDisplacementSpeed(orbitalDisplacementSpeed);
        register.setMissionObjective(missionObjetive);
        register.setHumanCapacity(capacity);
        MannedDAO.createMannedDB(register);
    }
}
