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

    public Casa() {
    }

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Aircraft getCraft() {
        return craft;
    }

    public void setCraft(Aircraft craft) {
        this.craft = craft;
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

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    @Override
    public String toString() {
        return "Casa{" + "airlane=" + airlane + ", orgin=" + orgin 
                + ", destanation=" + destanation + ", departure=" 
                + departure + ", date=" + date + ", craft=" + craft 
                + ", duration=" + duration + ", status=" + status 
                + ", terminal=" + terminal + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
