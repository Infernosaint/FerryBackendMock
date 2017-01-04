/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b.backendmock;

import generalstuff.*;
import java.util.Date;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Infernosaint
 */

public class Reservation {
    
    private static ArrayList<Reservation> reservations = new ArrayList<Reservation>();
    private static int nextId = 0;
    public static Collection<Reservation> list() {
        return reservations;
    }
    public static Reservation find(int id) {
    return reservations.get(id);
    }
    
    private int id;
    private Departure departure;
    private String customer;
    private int residents;
    private int aliens;
    private int cars;
    private int lorries;
    private int heavyMachinery;
    private int totalPrice;
    private Date dateMade;

    public Reservation (Departure departure, String customer, int residents){
        this.id = ++nextId;
        this.departure = departure;
        this.customer = customer;
        this.residents = residents;
        Reservation.reservations.add(this);
        
    }
    public Reservation(Departure departure, String customer, int residents, int aliens, int cars, int lorries, int heavyMachinery, int totalprice) {
        this.departure = departure;
        this.customer = customer;
        this.residents = residents;
        this.aliens = aliens;
        this.cars = cars;
        this.lorries = lorries;
        this.heavyMachinery = heavyMachinery;
        this.totalPrice = totalprice;
        this.dateMade = new Date();
    }

    public ReservationIdentifier getReservationDetailIdentifier() {
        ReservationIdentifier reservationIdentifier = new ReservationIdentifier(id);
        return reservationIdentifier;
    }
    public ReservationSummary getReservationSummary() {
        ReservationSummary reservationSummary = new ReservationSummary(totalPrice, id);
        return reservationSummary;
    }
    public ReservationDetail getReservationDetail() {
        ReservationDetail reservationDetail = new ReservationDetail(dateMade, departure.getDepartureSummary(), customer, id, residents, cars, lorries, heavyMachinery, totalPrice, cars);
        return reservationDetail;
    }

    public static ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public static void setReservations(ArrayList<Reservation> reservations) {
        Reservation.reservations = reservations;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Reservation.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Departure getDeparture() {
        return departure;
    }

    public void setDeparture(Departure departure) {
        this.departure = departure;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getResidents() {
        return residents;
    }

    public void setResidents(int residents) {
        this.residents = residents;
    }

    public int getAliens() {
        return aliens;
    }

    public void setAliens(int aliens) {
        this.aliens = aliens;
    }

    public int getCars() {
        return cars;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }

    public int getLorries() {
        return lorries;
    }

    public void setLorries(int lorries) {
        this.lorries = lorries;
    }

    public int getHeavyMachinery() {
        return heavyMachinery;
    }

    public void setHeavyMachinery(int heavyMachinery) {
        this.heavyMachinery = heavyMachinery;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDateMade() {
        return dateMade;
    }

    public void setDateMade(Date dateMade) {
        this.dateMade = dateMade;
    }
    

}
