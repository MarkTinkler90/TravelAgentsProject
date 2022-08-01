package travelAgents;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TravelAgents {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Select().setVisible(true);
            }
        });

        createFile();
    }

    public static void createFile() {
        try {
            File cruiseFile = new File("Cruises.csv");
            if (cruiseFile.createNewFile()) {
                System.out.println("File created: " + cruiseFile.getName());
                FileWriter fw = null;
                PrintWriter pw = null;
                try {
                    fw = new FileWriter("Cruises.csv", true);
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(BookingCruise.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            File UKFile = new File("UK Holidays.csv");
            if (UKFile.createNewFile()) {
                System.out.println("File created: " + UKFile.getName());
                FileWriter fw = null;
                PrintWriter pw = null;
                try {
                    fw = new FileWriter("UK Holidays.csv", true);
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(BookingUKBased.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            File abroadFile = new File("Abroad.csv");
            if (abroadFile.createNewFile()) {
                System.out.println("File created: " + abroadFile.getName());
                FileWriter fw = null;
                PrintWriter pw = null;
                try {
                    fw = new FileWriter("Abroad.csv", true);
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(BookingCruise.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
