/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b.backendmock;

import generalstuff.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Infernosaint
 */
public class Departure {
    
    private static ArrayList<Departure> departures = new ArrayList<Departure>();
    private static int nextId = 0;
    public static Collection<Departure> list() {
        return departures;
    }
    public static Departure find(int id) {
    return departures.get(id);
    }
    
    
    private int id;
    private Date departureTime;
    private LineSummary lineSummary;
    private FerrySummary ferrySummary;
    private long pricePerPerson;
    private long pricePerCar;
    private long pricePerLorry;
    private long pricePerHeavy;
    private long pricePerResident;
    private int remainingPeople;
    private int remainingCars;
    private int remainingLorries;
    private int remainingHeavy;

    public Departure(Date departureTime, long pricePerPerson, int remainingPeople){
        this.id = ++nextId;
        this.departureTime = departureTime;
        this.pricePerPerson = pricePerPerson;
        this.remainingPeople = remainingPeople;
        Departure.departures.add(this);
    }
    public Departure(int id, Date departureTime, LineSummary lineSummary, FerrySummary ferrySummary, long pricePerPerson, long pricePerCar, long pricePerLorry, long pricePerHeavy, long pricePerResident, int remainingPeople, int remainingCars, int remainingLorries, int remainingHeavy) {
        this.id = id;
        this.departureTime = departureTime;
        this.lineSummary = lineSummary;
        this.ferrySummary = ferrySummary;
        this.pricePerPerson = pricePerPerson;
        this.pricePerCar = pricePerCar;
        this.pricePerLorry = pricePerLorry;
        this.pricePerHeavy = pricePerHeavy;
        this.pricePerResident = pricePerResident;
        this.remainingPeople = remainingPeople;
        this.remainingCars = remainingCars;
        this.remainingLorries = remainingLorries;
        this.remainingHeavy = remainingHeavy;
    }
    
    
    public Departure(Date departureTime, LineSummary lineSummary, FerrySummary ferrySummary, long pricePerPerson, long pricePerCar, long pricePerLorry, long pricePerHeavy, long pricePerResident, int remainingPeople, int remainingCars, int remainingLorries, int remainingHeavy) {
        this.departureTime = departureTime;
        this.lineSummary = lineSummary;
        this.ferrySummary = ferrySummary;
        this.pricePerPerson = pricePerPerson;
        this.pricePerCar = pricePerCar;
        this.pricePerLorry = pricePerLorry;
        this.pricePerHeavy = pricePerHeavy;
        this.pricePerResident = pricePerResident;
        this.remainingPeople = remainingPeople;
        this.remainingCars = remainingCars;
        this.remainingLorries = remainingLorries;
        this.remainingHeavy = remainingHeavy;
    }
    
    
    
    
    DepartureIdentifier getDepartureIdentifier() {
        DepartureIdentifier departureIdentifier = new DepartureIdentifier(id);
        return departureIdentifier;
    }
    DepartureSummary getDepartureSummary() {
        DepartureSummary departureSummary = new DepartureSummary(departureTime, lineSummary, ferrySummary, id);
        return departureSummary;
    }
    DepartureDetail getDepartureDetail() {
        DepartureDetail departureDetail = new DepartureDetail(pricePerPerson, pricePerCar, pricePerLorry, pricePerHeavy, pricePerResident, remainingPeople, remainingCars, remainingLorries, remainingHeavy, departureTime, lineSummary, ferrySummary, id);
        return departureDetail;
    }

    public int getId() {
        return id;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public LineSummary getLineSummary() {
        return lineSummary;
    }

    public FerrySummary getFerrySummary() {
        return ferrySummary;
    }

    public long getPricePerPerson() {
        return pricePerPerson;
    }

    public long getPricePerCar() {
        return pricePerCar;
    }

    public long getPricePerLorry() {
        return pricePerLorry;
    }

    public long getPricePerHeavy() {
        return pricePerHeavy;
    }

    public long getPricePerResident() {
        return pricePerResident;
    }

    public int getRemainingPeople() {
        return remainingPeople;
    }

    public int getRemainingCars() {
        return remainingCars;
    }

    public int getRemainingLorries() {
        return remainingLorries;
    }

    public int getRemainingHeavy() {
        return remainingHeavy;
    }
    
    
    
}
