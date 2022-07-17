package com.fabio.sofkaspacestation;
import database.DbConnection;

import java.sql.Connection;

import static com.fabio.sofkaspacestation.Menu.showMenu;

public class Main {
    public static void main(String[] args) {
        showMenu();
        /* permite la conexion por primera vez a la base de datos
        DbConnection connection = new DbConnection();

        try (Connection cnx = connection.get_connection()){

        }catch (Exception e){
            System.out.println(e);
        }
        */

    }
}
