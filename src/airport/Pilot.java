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
public class Pilot {
    
    private String name;
    private int rating;

    /**
     *
     */
    public Pilot() {
    }

    /**
     *
     * @param name
     * @param rating
     */
    public Pilot(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    /**
     *
     * @return
     */
    public int getRating() {
        return rating;
    }

    /**
     *
     * @param rating
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "(Pilot info: " + "name=  " + name + ", rating=  " + rating + ")\n";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}//                         END OF LINE
