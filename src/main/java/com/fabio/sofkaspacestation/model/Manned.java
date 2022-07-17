package com.fabio.sofkaspacestation.model;

public class Manned implements Spaceship{
    //Variable
    int mannedId;
    String spaceshipName;
    int weight;
    String author;
    String gas;
    double velocityOfDisplacement;
    double pushingForce;
    double orbitalDisplacementSpeed;
    String missionObjective;
    int humanCapacity;
    String date;

    //Method Constructor


    public Manned(int mannedId, String spaceshipName, int weight, String author, String gas,
                  double velocityOfDisplacement, double pushingForce, double orbitalDisplacementSpeed,
                  String missionObjective, int humanCapacity, String date) {
        this.mannedId = mannedId;
        this.spaceshipName = spaceshipName;
        this.weight = weight;
        this.author = author;
        this.gas = gas;
        this.velocityOfDisplacement = velocityOfDisplacement;
        this.pushingForce = pushingForce;
        this.orbitalDisplacementSpeed = orbitalDisplacementSpeed;
        this.missionObjective = missionObjective;
        this.humanCapacity = humanCapacity;
        this.date = date;
    }

    public Manned() {

    }

    //Getters and Setters

    public int getMannedId() {
        return mannedId;
    }

    public void setMannedId(int mannedId) {
        this.mannedId = mannedId;
    }

    public String getSpaceshipName() {
        return spaceshipName;
    }

    public void setSpaceshipName(String spaceshipName) {
        this.spaceshipName = spaceshipName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public double getVelocityOfDisplacement() {
        return velocityOfDisplacement;
    }

    public void setVelocityOfDisplacement(double velocityOfDisplacement) {
        this.velocityOfDisplacement = velocityOfDisplacement;
    }

    public double getPushingForce() {
        return pushingForce;
    }

    public void setPushingForce(double pushingForce) {
        this.pushingForce = pushingForce;
    }

    public double getOrbitalDisplacementSpeed() {
        return orbitalDisplacementSpeed;
    }

    public void setOrbitalDisplacementSpeed(double orbitalDisplacementSpeed) {
        this.orbitalDisplacementSpeed = orbitalDisplacementSpeed;
    }

    public String getMissionObjective() {
        return missionObjective;
    }

    public void setMissionObjective(String missionObjective) {
        this.missionObjective = missionObjective;
    }

    public int getHumanCapacity() {
        return humanCapacity;
    }

    public void setHumanCapacity(int humanCapacity) {
        this.humanCapacity = humanCapacity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public void spaceShip(String spaceshipName, int weight, String author, String gas, Double velocityOfDisplacement, Double pushingForce, Double orbitalDisplacementSpeed) {

    }
}
