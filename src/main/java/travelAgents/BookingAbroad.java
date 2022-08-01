package travelAgents;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookingAbroad extends BookingMain {

    String depAir;
    String retAir;
    int fNum;

    BookingAbroad() {
        super();
        depAir = "";
        retAir = "";
        fNum = 0;
    }

    BookingAbroad(String da, String ra, int fn, String ID, String dest, double pn, int np, double p, String sd, String ed, int night) {
        super(ID, dest, pn, np, p, sd, ed, night);
        depAir = da;
        retAir = ra;
        fNum = fn;

        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Abroad.csv", true);
            pw = new PrintWriter(fw);

            pw.write(ID + "," + da + "," + ra + "," + fn + ","
                    + dest + "," + pn + "," + np + ","
                    + p + "," + sd + "," + ed + "," + night);
            pw.println();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(BookingAbroad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
