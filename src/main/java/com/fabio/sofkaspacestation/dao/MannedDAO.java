package com.fabio.sofkaspacestation.dao;

import com.fabio.sofkaspacestation.model.Manned;
import database.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MannedDAO {
    public static void createMannedDB(Manned manned){
        DbConnection dbConnection = new DbConnection(); //generando una nueva conexion
        try (Connection connection = dbConnection.get_connection()) {  //obtiendo la conexion
            PreparedStatement ps=null;
            try {
                String query="INSERT INTO `sofkaspaceship`.`maneed` (`spaceshipname`, `weight`, `author`, `gas`, `velocityofdisplacement`, " +
                        "`pushingforce`, `orbitaldisplacementspeed`, `missionobjetive`, `humancapacity` ,`date`) VALUES (?, ?, ?, " +
                        "?, ?, ?, ?, ?, ? ,CURRENT_TIMESTAMP)";
                ps=connection.prepareStatement(query);
                ps.setString(1,manned.getSpaceshipName()); //dando parametros
                ps.setInt(2, manned.getWeight());
                ps.setString(3,manned.getAuthor());
                ps.setString(4,manned.getGas());
                ps.setDouble(5, manned.getVelocityOfDisplacement());
                ps.setDouble(6, manned.getPushingForce());
                ps.setDouble(7, manned.getOrbitalDisplacementSpeed());
                ps.setString(8,manned.getMissionObjective());
                ps.setInt(9, manned.getHumanCapacity());
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

    public static void readMannedDB(){
        DbConnection dbConnection = new DbConnection(); //generando una nueva conexion
        try (Connection connection = dbConnection.get_connection()) {  //obtiendo la conexion
            PreparedStatement ps=null;
            ResultSet rs = null;
            String query="SELECT * FROM sofkaspaceship.maneed";
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
                System.out.println("Mission Objetive: " + rs.getString("missionobjetive"));
                System.out.println("Human Capacity: " + rs.getInt("humancapacity"));
                System.out.println("Date: " + rs.getDate("date"));
                System.out.println();
            }
        }catch(Exception ex){
            System.out.println("Spaceship not found");
            System.out.println(ex);
        }
    }
}
