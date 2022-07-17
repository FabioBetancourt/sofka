package com.fabio.sofkaspacestation.dao;

import com.fabio.sofkaspacestation.model.Shuttle;
import database.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShuttleDAO {
    public static void createShuttleDB(Shuttle shuttle){
        DbConnection dbConnection = new DbConnection(); //generando una nueva conexion
        try (Connection connection = dbConnection.get_connection()) {  //obtiendo la conexion
            PreparedStatement ps=null;
            try {
                String query="INSERT INTO `sofkaspaceship`.`shuttle` (`spaceshipname`, `weight`, `author`, `gas`, `velocityofdisplacement`, " +
                        "`pushingforce`, `orbitaldisplacementspeed`, `takeofftype`, `transportcapacity` ,`date`) VALUES (?, ?, ?, " +
                        "?, ?, ?, ?, ?, ? ,CURRENT_TIMESTAMP)";
                ps=connection.prepareStatement(query);
                ps.setString(1,shuttle.getSpaceshipName()); //dando parametros
                ps.setInt(2, shuttle.getWeight());
                ps.setString(3,shuttle.getAuthor());
                ps.setString(4,shuttle.getGas());
                ps.setDouble(5, shuttle.getVelocityOfDisplacement());
                ps.setDouble(6, shuttle.getPushingForce());
                ps.setDouble(7, shuttle.getOrbitalDisplacementSpeed());
                ps.setString(8,shuttle.getTakeOffType());
                ps.setInt(9, shuttle.getTransportCapacity());
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

    public static void readShuttleDB(){
        DbConnection dbConnection = new DbConnection(); //generando una nueva conexion
        try (Connection connection = dbConnection.get_connection()) {  //obtiendo la conexion
            PreparedStatement ps=null;
            ResultSet rs = null;
            String query="SELECT * FROM sofkaspaceship.shuttle";
            ps = connection.prepareStatement(query);
            rs=ps.executeQuery();
            while (rs.next()){
                System.out.println("ID Spaceship: " + rs.getInt("idmaneed"));
                System.out.println("Spaceship name: " + rs.getString("spaceshipname"));
                System.out.println("Weight: " + rs.getInt("weight"));
                System.out.println("Created by: " + rs.getString("author"));
                System.out.println("Type of Gas: " + rs.getString("gas"));
                System.out.println("Velocity of displacement: " + rs.getDouble("velocityofdisplacement"));
                System.out.println("Pushing force: " + rs.getDouble("pushingforce"));
                System.out.println("Orbital Displacement Speed: " + rs.getDouble("orbitaldisplacementspeed"));
                System.out.println("Mission Objetive: " + rs.getString("takeofftype"));
                System.out.println("Human Capacity: " + rs.getInt("transportcapacity"));
                System.out.println("Date: " + rs.getDate("date"));
                System.out.println();
            }
        }catch(Exception ex){
            System.out.println("Spaceship not found");
            System.out.println(ex);
        }
    }
}
