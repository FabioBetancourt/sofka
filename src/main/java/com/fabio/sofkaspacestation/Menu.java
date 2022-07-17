package com.fabio.sofkaspacestation;
import com.fabio.sofkaspacestation.dao.MannedDAO;
import com.fabio.sofkaspacestation.dao.NotTripulatedDAO;
import com.fabio.sofkaspacestation.dao.ShuttleDAO;
import com.fabio.sofkaspacestation.model.Manned;
import com.fabio.sofkaspacestation.model.NotTripulated;
import com.fabio.sofkaspacestation.service.MannedService;
import com.fabio.sofkaspacestation.service.NotTripulatedService;
import com.fabio.sofkaspacestation.service.ShuttleService;

import java.util.Scanner;
public class Menu {
    public static void showMenu(){
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("--------------------");
            System.out.println("Spaceship creation app");
            System.out.println("1. Create a new Spaceship");
            System.out.println("2. list Spaceship");
            System.out.println("3. Exit");
            //leer la opcion del usuario
            option = sc.nextInt();

            switch (option) {
                case 1:
                    optionMenu();
                    break;
                case 2:
                    optionMenu2();
                     break;
                case 3:
                     System.out.println("Exit Successful");
                     break;
                default:
                    System.out.println("please select a correct option");
                    break;
                }
            }while (option!=3);

        }
    private static void optionMenu(){
        Scanner sc = new Scanner(System.in);
        int option2 = 0;
        do {
            System.out.println("--------------------");
            System.out.println("what kind of spaceship will you create");
            System.out.println("1. Manned");
            System.out.println("2. Not Tripulated");
            System.out.println("3. Shuttle");
            System.out.println("4. Return to principal menu");
            option2 = sc.nextInt();
            switch (option2){
                case 1:
                    MannedService.createManned();
                    break;
                case 2:
                    NotTripulatedService.createNotTripulated();
                    break;
                case 3:
                    ShuttleService.createShuttle();
                    break;
                case 4:
                    showMenu();
                    break;
                default:
                    System.out.println("Please select a correct option");
                    break;
            }
        }while (option2!=4);
    }
    private static void optionMenu2(){
        Scanner sc = new Scanner(System.in);
        int option3 = 0;
        do {
            System.out.println("--------------------");
            System.out.println("what kind of spaceship do you want to look for");
            System.out.println("1. Manned");
            System.out.println("2. Not Tripulated");
            System.out.println("3. Shuttle");
            System.out.println("4. Return to principal menu");
            option3 = sc.nextInt();
            switch (option3){
                case 1:
                    MannedDAO.readMannedDB();
                    break;
                case 2:
                    NotTripulatedDAO.readNotTripulatedDB();
                    break;
                case 3:
                    ShuttleDAO.readShuttleDB();
                    break;
                case 4:
                    showMenu();
                    break;
                default:
                    System.out.println("Please select a correct option");
                    break;
            }
        }while (option3!=4);
    }
    }


