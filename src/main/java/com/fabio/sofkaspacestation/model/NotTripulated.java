package com.fabio.sofkaspacestation.model;

public class NotTripulated implements Spaceship{

    //Variables
    int notTripulatedId;
    String spaceshipName;
    int weight;
    String author;
    String gas;
    double velocityOfDisplacement;
    double pushingForce;
    double orbitalDisplacementSpeed;
    String geostationed;
    String objectOfStudy;

    //method constructor
    public NotTripulated(){

    }

    public NotTripulated(int notTripulatedId, String spaceshipName, int weight, String author, String gas,
                         double velocityOfDisplacement, double pushingForce, double orbitalDisplacementSpeed,
                         String geostationed, String objectOfStudy) {
        this.notTripulatedId = notTripulatedId;
        this.spaceshipName = spaceshipName;
        this.weight = weight;
        this.author = author;
        this.gas = gas;
        this.velocityOfDisplacement = velocityOfDisplacement;
        this.pushingForce = pushingForce;
        this.orbitalDisplacementSpeed = orbitalDisplacementSpeed;
        this.geostationed = geostationed;
        this.objectOfStudy = objectOfStudy;
    }

    //Getters and Setters


    public int getNotTripulatedId() {
        return notTripulatedId;
    }

    public void setNotTripulatedId(int notTripulatedId) {
        this.notTripulatedId = notTripulatedId;
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

    public String getGeostationed() {
        return geostationed;
    }

    public void setGeostationed(String geostationed) {
        this.geostationed = geostationed;
    }

    public String getObjectOfStudy() {
        return objectOfStudy;
    }

    public void setObjectOfStudy(String objectOfStudy) {
        this.objectOfStudy = objectOfStudy;
    }

    @Override
    public void spaceShip(String spaceshipName, int weight, String author, String gas,
                          Double velocityOfDisplacement, Double pushingForce, Double orbitalDisplacementSpeed) {
    }
}
