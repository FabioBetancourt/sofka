package com.fabio.sofkaspacestation.dao;

import com.fabio.sofkaspacestation.model.Manned;
import com.fabio.sofkaspacestation.model.NotTripulated;
import database.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NotTripulatedDAO {
    public static void createNotTripulatedDB(NotTripulated notTripulated){
        DbConnection dbConnection = new DbConnection(); //generando una nueva conexion
        try (Connection connection = dbConnection.get_connection()) {  //obtiendo la conexion
            PreparedStatement ps=null;
            try {
                String query="INSERT INTO `sofkaspaceship`.`nottripulated` (`spacheshipname`, `weight`, `author`," +
                        " `gas`, `velocityofdisplacement`, `pushingforce`, `orbitaldisplacementspeed`, " +
                        "`geostationed`, `objectofstudy`, `date`) VALUES (?, ?, ?, " +
                        "?, ?, ?, ?, ?, ? ,CURRENT_TIMESTAMP)";
                ps=connection.prepareStatement(query);
                ps.setString(1,notTripulated.getSpaceshipName()); //dando parametros
                ps.setInt(2, notTripulated.getWeight());
                ps.setString(3,notTripulated.getAuthor());
                ps.setString(4,notTripulated.getGas());
                ps.setDouble(5, notTripulated.getVelocityOfDisplacement());
                ps.setDouble(6, notTripulated.getPushingForce());
                ps.setDouble(7, notTripulated.getOrbitalDisplacementSpeed());
                ps.setString(8,notTripulated.getGeostationed());
                ps.setString(9, notTripulated.getObjectOfStudy());
                ps.executeUpdate(); //metodo para crear datos
                System.out.println("Spaceship Ready For Takeoff");
            } catch (SQLException e) {
                System.out.println(e);
                System.out.println("please try again");
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

    public static void readNotTripulatedDB(){
        DbConnection dbConnection = new DbConnection(); //generando una nueva conexion
        try (Connection connection = dbConnection.get_connection()) {  //obtiendo la conexion
            PreparedStatement ps=null;
            ResultSet rs = null;
            String query="SELECT * FROM sofkaspaceship.nottripulated";
            ps = connection.prepareStatement(query);
            rs=ps.executeQuery();
            while (rs.next()){
                System.out.println("ID Spaceship: " + rs.getInt("idnottripulated"));
                System.out.println("Spaceship name: " + rs.getString("spacheshipname"));
                System.out.println("Weight: " + rs.getInt("weight"));
                System.out.println("Created by: " + rs.getString("author"));
                System.out.println("Type of Gas: " + rs.getString("gas"));
                System.out.println("Velocity of displacement: " + rs.getDouble("velocityofdisplacement"));
                System.out.println("Pushing force: " + rs.getDouble("pushingforce"));
                System.out.println("Orbital Displacement Speed: " + rs.getDouble("orbitaldisplacementspeed"));
                System.out.println("Geosationed: " + rs.getString("geostationed"));
                System.out.println("Object Of Study: " + rs.getString("objectofstudy"));
                System.out.println("Date: " + rs.getDate("date"));
                System.out.println();
            }
        }catch(Exception ex){
            System.out.println("Spaceship not found");
            System.out.println(ex);
        }
    }


    public static void createNotTripulatedDB() {
    }
}
