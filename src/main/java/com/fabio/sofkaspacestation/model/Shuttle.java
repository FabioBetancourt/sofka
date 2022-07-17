package com.fabio.sofkaspacestation.model;

public class Shuttle implements Spaceship{
    //variable
    int shuttleId;
    String spaceshipName;
    int weight;
    String author;
    String gas;
    double velocityOfDisplacement;
    double pushingForce;
    double orbitalDisplacementSpeed;
    String takeOffType;
    int transportCapacity;

    //Method Constructor
    public Shuttle (){

    }

    public Shuttle(int shuttleId, String spaceshipName, int weight, String author, String gas,
                   double velocityOfDisplacement, double pushingForce, double orbitalDisplacementSpeed,
                   String takeOffType, int transportCapacity) {
        this.shuttleId = shuttleId;
        this.spaceshipName = spaceshipName;
        this.weight = weight;
        this.author = author;
        this.gas = gas;
        this.velocityOfDisplacement = velocityOfDisplacement;
        this.pushingForce = pushingForce;
        this.orbitalDisplacementSpeed = orbitalDisplacementSpeed;
        this.takeOffType = takeOffType;
        this.transportCapacity = transportCapacity;
    }

    //Getters and Setters


    public int getShuttleId() {
        return shuttleId;
    }

    public void setShuttleId(int shuttleId) {
        this.shuttleId = shuttleId;
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

    public String getTakeOffType() {
        return takeOffType;
    }

    public void setTakeOffType(String takeOffType) {
        this.takeOffType = takeOffType;
    }

    public int getTransportCapacity() {
        return transportCapacity;
    }

    public void setTransportCapacity(int transportCapacity) {
        this.transportCapacity = transportCapacity;
    }

    @Override
    public void spaceShip(String spaceshipName, int weight, String author, String gas, Double velocityOfDisplacement, Double pushingForce, Double orbitalDisplacementSpeed) {

    }
}
