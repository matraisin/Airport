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
public class Airplane implements Aircraft
{
    
    private String make;
    private String model;
    private int capacity;
    private Object Pilot;

    public Airplane() {
    }

    public Airplane(String make, String model, int capacity, Object Pilot) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.Pilot = Pilot;
    }

    public Object getPilot() {
        return Pilot;
    }

    public void setPilot(Object Pilot) {
        this.Pilot = Pilot;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "\n===============   AIRPLANE INFO:   ==================="
                + "\nmake: " + make + "\nmodel: " + model 
                + "\nseats: " + capacity + "\n" + Pilot + "\n"
                + "=================   TRIP INFO:   =====================";
    }
    
    
 
    
    
    
    
    
    
    
}  //                           END OF LINE
