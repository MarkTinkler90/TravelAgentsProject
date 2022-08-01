package travelAgents;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookingUKBased extends BookingMain {

    String accom; //accommodation

    BookingUKBased() {
        super();
        accom = "";
    }

    BookingUKBased(String ac, String ID, String dest, double pn, int np, double p, String sd, String ed, int night) {
        super(ID, dest, pn, np, p, sd, ed, night);
        accom = ac;

        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("UK Holidays.csv", true);
            pw = new PrintWriter(fw);

            pw.write(ID + "," + ac + "," + dest + "," + pn + "," + np + "," + p
                    + "," + sd + "," + ed + "," + night);
            pw.println();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(BookingUKBased.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
