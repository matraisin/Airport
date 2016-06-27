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
public class Helicopter implements Aircraft{
    
    private String airlane = "PRIVATE";
    private String destanation;
    private String date;
    private String model = "IRCG Sikorsky S-92 ";
    private int duration;
    private String status = "REDY";
    private String terminal = "H";

    public Helicopter() {
    }

    public Helicopter(String destanation, String date, int duration) {
        this.destanation = destanation;
        this.date = date;
        this.duration = duration;
    }

    public String getAirlane() {
        return airlane;
    }

    public void setAirlane(String airlane) {
        this.airlane = airlane;
    }

    public String getDestanation() {
        return destanation;
    }

    public void setDestanation(String destanation) {
        this.destanation = destanation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCraft() {
        return model;
    }

    public void setCraft(String craft) {
        this.model = craft;
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
        return "Helicopter{" + "airlane=" + airlane + ", destanation=" + destanation 
                + ", date=" + date + ", craft=" + model + ", duration=" + duration 
                + ", status=" + status + ", terminal=" + terminal + '}';
    }
    
    
}
