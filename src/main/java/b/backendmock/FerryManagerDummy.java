/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b.backendmock;

import generalstuff.DepartureDetail;
import generalstuff.DepartureIdentifier;
import generalstuff.LineIdentifier;
import generalstuff.LineSummary;
import generalstuff.ReservationDetail;
import generalstuff.ReservationIdentifier;
import interfaces.CustomerInterface;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Infernosaint
 */
public class FerryManagerDummy implements CustomerInterface {
    
    public FerryManagerDummy(){
        new Departure(new Date(), 200, 2);
        new Departure(new Date(), 200, 6);
        new Departure(new Date(), 200, 3);
        new Departure(new Date(), 200, 1);
        
    }

    @Override
    public Collection<DepartureDetail> getDepartures(LineIdentifier lineIdentifier, Date departureDate) {
       Collection<DepartureDetail> departures = new ArrayList<>();
       SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd");
       for (Departure departure : Departure.list()){
           if (ft.format(departure.getDepartureTime()).equals(ft.format(departureDate))){
               departures.add(departure.getDepartureDetail());
           }
        }
       return departures;
    }

    @Override
    public ReservationDetail getReservation(ReservationIdentifier reservationIdentifier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ReservationDetail saveReservation(DepartureIdentifier departureIdentifier, int passengersNb, int numberOfResidents, boolean car, int numberOfHeavyMachinery, int numberOfLorries, String customerName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<LineSummary> getLines() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ReservationDetail updateReservation(ReservationIdentifier reservationIdentifier, DepartureIdentifier departureIdentifier, int passengersNb, int numberOfResidents, boolean car, int numberOfHeavyMachinery, int numberOfLorries, String customerName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean deleteReservation(ReservationIdentifier reservationIdentifier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
