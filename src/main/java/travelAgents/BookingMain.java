package travelAgents;

public class BookingMain {

    String bookingID;
    String destination;
    double ppn; //price per person per night
    int numPeople;
    double price; //= ppn * numPeople * numnights
    String startDate;
    String endDate;
    int numNights;

    BookingMain() {
        bookingID = "";
        destination = "";
        ppn = 0;
        numPeople = 0;
        price = 0;
        startDate = "";
        endDate = "";
        numNights = 0;
    }
    //(ppn, numPeople, price, startDate, endDate, numNights )

    BookingMain(String ID, String dest, double pn, int np, double p, String sd, String ed, int night) {
        bookingID = ID;
        destination = dest;
        ppn = pn;
        numPeople = np;
        price = p;
        startDate = sd;
        endDate = ed;
        numNights = night;
    }

}
