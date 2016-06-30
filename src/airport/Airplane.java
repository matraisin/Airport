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
public class Airplane implements Aircraft
{
    
    private String make;
    private String model;
    private int capacity;
    private Object Pilot;

    /**
     *
     */
    public Airplane() {
    }

    /**
     *
     * @param make
     * @param model
     * @param capacity
     * @param Pilot
     */
    public Airplane(String make, String model, int capacity, Object Pilot) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.Pilot = Pilot;
    }

    /**
     *
     * @return
     */
    public Object getPilot() {
        return Pilot;
    }

    /**
     *
     * @param Pilot
     */
    public void setPilot(Object Pilot) {
        this.Pilot = Pilot;
    }

    /**
     *
     * @return
     */
    public String getMake() {
        return make;
    }

    /**
     *
     * @param make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     *
     * @return
     */
    public String getModel() {
        return model;
    }

    /**
     *
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     *
     * @return
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     *
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "\n===============   AIRPLANE INFO:   ==================="
                + "\nmake: " + make + "\nmodel: " + model 
                + "\nseats: " + capacity + "\n" + Pilot + "\n"
                + "=================   TRIP INFO:   =====================";
    }
    
    
 
    
    
    
    
    
    
    
}  //                           END OF LINE
