/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport;

/**
 *
 * @author matraisin
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

    /**
     *
     */
    public Flight() {
    }

    /**
     *
     * @param airlane
     * @param orgin
     * @param destanation
     * @param departure
     * @param arrival
     * @param date
     * @param aircraft
     * @param duration
     * @param status
     * @param terminal
     * @param iD
     */
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

    /**
     *
     * @return
     */
    public String getiD() {
        return iD;
    }

    /**
     *
     * @param iD
     */
    public void setiD(String iD) {
        this.iD = iD;
    }

    /**
     *
     * @return
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     *
     * @param terminal
     */
    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    /**
     *
     * @return
     */
    public String getAirlane() {
        return airlane;
    }

    /**
     *
     * @param airlane
     */
    public void setAirlane(String airlane) {
        this.airlane = airlane;
    }

    /**
     *
     * @return
     */
    public String getOrgin() {
        return orgin;
    }

    /**
     *
     * @param orgin
     */
    public void setOrgin(String orgin) {
        this.orgin = orgin;
    }

    /**
     *
     * @return
     */
    public String getDestanation() {
        return destanation;
    }

    /**
     *
     * @param destanation
     */
    public void setDestanation(String destanation) {
        this.destanation = destanation;
    }

    /**
     *
     * @return
     */
    public String getDeparture() {
        return departure;
    }

    /**
     *
     * @param departure
     */
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    /**
     *
     * @return
     */
    public String getArrival() {
        return arrival;
    }

    /**
     *
     * @param arrival
     */
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    /**
     *
     * @return
     */
    public String getDate() {
        return date;
    }

    /**
     *
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     *
     * @return
     */
    public Aircraft getAircraft() {
        return craft;
    }

    /**
     *
     * @param aircraft
     */
    public void setAircraft(Aircraft aircraft) {
        this.craft = aircraft;
    }

    /**
     *
     * @return
     */
    public int getDuration() {
        return duration;
    }

    /**
     *
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     */
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
