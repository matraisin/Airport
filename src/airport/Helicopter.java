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
public class Helicopter implements Aircraft{
    
    private String airlane = "PRIVATE";
    private String destanation;
    private String date;
    private String model = "IRCG Sikorsky S-92 ";
    private int duration;
    private String status = "REDY";
    private String terminal = "H";

    /**
     *
     */
    public Helicopter() {
    }
    /**
     * custom method constructor to set up: 
     * @param destanation String 
     * @param date  String
     * @param duration  int
     */
    public void setscheduleExtra(String destanation, String date, int duration){
         this.destanation = destanation;
        this.date = date;
        this.duration = duration;
        
    }
    
    /**
     *
     * @param destanation
     * @param date
     * @param duration
     */
    public Helicopter(String destanation, String date, int duration) {
        this.destanation = destanation;
        this.date = date;
        this.duration = duration;
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
    public String getCraft() {
        return model;
    }

    /**
     *
     * @param craft
     */
    public void setCraft(String craft) {
        this.model = craft;
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
        return "Helicopter{" + "airlane=" + airlane + ", destanation=" + destanation 
                + ", date=" + date + ", craft=" + model + ", duration=" + duration 
                + ", status=" + status + ", terminal=" + terminal + '}';
    }
    
    
}
