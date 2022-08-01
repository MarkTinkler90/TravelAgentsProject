package travelAgents;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookingCruise extends BookingMain {

    String depPort;
    String retPort;
    String cabin; //internal or seaView

    BookingCruise() {
        super();
        cabin = "";
        depPort = "";
        retPort = "";
    }
    //(cabin, depPort, retPort, ppn, numPeople, price, startDate, endDate, numNights )

    BookingCruise(String c, String dp, String rp, String ID, String dest, double pn, int np, double p, String sd, String ed, int night) {
        super(ID, dest, pn, np, p, sd, ed, night);
        cabin = c;
        depPort = dp;
        retPort = rp;

        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Cruises.csv", true);
            pw = new PrintWriter(fw);

            pw.write(ID + "," + c + "," + dp + "," + rp + ","
                    + dest + "," + pn + "," + np + ","
                    + p + "," + sd + "," + ed + "," + night);
            pw.println();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(BookingCruise.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
