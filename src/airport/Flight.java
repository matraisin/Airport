/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport;

/**
 *
 * @author rogozinskim
 */
public class Flight implements Aircraft{
    
    private String iD;
    private String airlane;
    private String orgin;
    private String destanation;
    private String departure;
    private String arrival;
    private String date;
    private Aircraft craft;
    private int duration;
    private String status;
    private String terminal;

    public Flight() {
    }

    public Flight(String airlane, String orgin, String destanation, 
            String departure, String arrival, String date, Aircraft aircraft, 
            int duration, String status, String terminal, String iD) {
        this.airlane = airlane;
        this.orgin = orgin;
        this.destanation = destanation;
        this.departure = departure;
        this.arrival = arrival;
        this.date = date;
        this.craft = aircraft;
        this.duration = duration;
        this.status = status;
        this.terminal = terminal;
        this.iD = iD;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getAirlane() {
        return airlane;
    }

    public void setAirlane(String airlane) {
        this.airlane = airlane;
    }

    public String getOrgin() {
        return orgin;
    }

    public void setOrgin(String orgin) {
        this.orgin = orgin;
    }

    public String getDestanation() {
        return destanation;
    }

    public void setDestanation(String destanation) {
        this.destanation = destanation;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Aircraft getAircraft() {
        return craft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.craft = aircraft;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  "\nAirlane:     " + airlane + "\nOrgin:       " 
                + orgin + "\nDestanation: " + destanation + "\nDeparture:   " 
                + departure + "\nArrival:     " + arrival + "\nDate:        " + date 
                + craft + "\nDuration: " + duration + "h"  
                + "\nAtatus: " + status + "\nTerminal: " + terminal 
                + "\n======================================================";
    }
    
    
    
    
    
}
