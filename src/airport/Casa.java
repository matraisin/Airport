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
public class Casa implements Aircraft {
    
    private String airlane;
    private String orgin;
    private String destanation;
    private String departure;
    private String date;
    private Aircraft craft;
    private int duration;
    private String status;
    private String terminal = "C";

    /**
     *
     */
    public Casa() {
    }
    /**
     * custom method to set up some variables auto and some manualy by 
     * calling the constructor with
     * @param destanation String
     * @param duration int
     */
    public void miaCasa(String destanation, int duration ) {
        this.airlane = "UNDERCOVER";
        this.orgin = "Mexico";
        this.destanation = destanation;
        this.date = "Today";
        this.duration = duration;
        this.status = "ON MY WAY";
    }
    
    /**
     *
     * @param airlane
     * @param orgin
     * @param destanation
     * @param departure
     * @param date
     * @param craft
     * @param duration
     * @param status
     */
    public Casa(String airlane, String orgin, String destanation, String departure, 
           String date, Aircraft craft, int duration, String status) {
        this.airlane = airlane;
        this.orgin = orgin;
        this.destanation = destanation;
        this.departure = departure;
        this.date = date;
        this.craft = craft;
        this.duration = duration;
        this.status = status;
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
    public Aircraft getCraft() {
        return craft;
    }

    /**
     *
     * @param craft
     */
    public void setCraft(Aircraft craft) {
        this.craft = craft;
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
    @Override
    public String toString() {
        return "Casa{" + "airlane=" + airlane + ", orgin=" + orgin + ", destanation=" + destanation + ", departure=" + departure + ", date=" + date + ", craft=" + craft + ", duration=" + duration + ", status=" + status + ", terminal=" + terminal + '}';
    }

    
    }
    
    
    
    
    
    
    
    
    
    
    
    

