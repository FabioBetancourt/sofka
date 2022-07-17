package com.fabio.sofkaspacestation.service;

import com.fabio.sofkaspacestation.dao.NotTripulatedDAO;
import com.fabio.sofkaspacestation.model.NotTripulated;


import java.util.Scanner;

public class NotTripulatedService{
    public static void createNotTripulated(){
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

        sc.nextLine();

        System.out.println("Type 'yes' or 'no' for Geostationed?: ");
        String geostationed = sc.nextLine();

        System.out.println("Type the object of study of the Spaceship: ");
        String objectOfStudy = sc.nextLine();

        NotTripulated register = new NotTripulated();
        register.setSpaceshipName(spaceshipName);
        register.setWeight(weight);
        register.setAuthor(author);
        register.setGas(gas);
        register.setVelocityOfDisplacement(velocityOfDisplacement);
        register.setPushingForce(pushingForce);
        register.setOrbitalDisplacementSpeed(orbitalDisplacementSpeed);
        register.setGeostationed(geostationed);
        register.setObjectOfStudy(objectOfStudy);
        NotTripulatedDAO.createNotTripulatedDB(register);
    }

}
