/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author matraisin
 */
public class ExtraLogic {
    
    Scanner kb = new Scanner(System.in);
    Scanner ki = new Scanner(System.in);
    
    
    
    
        public void extraFlights()
    {
        System.out.println("================= LIST OF EXTRA FLIGHTS =================");
        System.out.println("IRISH COAST GUARD        type 1");
        System.out.println("COCAINE DROP             type 2");
        System.out.println("Back to main menu        type 3");
        System.out.println("See all extra flights    type 4");
        
        int type = ki.nextInt();
        //populate extra Flights
        Helicopter copter = new Helicopter();
        Casa casa = new Casa();
        switch(type){
            case 1:
                System.out.println("WHERE TO FLY?");
                String costa = kb.nextLine();
                System.out.println("WHAT TIME THE INCYDENT HAPPEN?");
                String incident = kb.nextLine();
                System.out.println("EST TIME ARRIVING? in minutes");
                int timer = ki.nextInt();
                copter.setCraft("IRCG Sikorsky S-92 ");
                //custom constructor
                copter.setscheduleExtra(costa, incident, timer);
                System.out.println("IRCG Sikorsky S-92 is on its way for resque!!!");
                Airport.logic.extraFF.add(copter);
                extraFlights();
                break;
        
       
            case 2:
                System.out.println("Where you need a drop?");
                String drop = kb.nextLine();
                System.out.println("How many hour from now?");
                int hour = ki.nextInt();
                System.out.println("Ok you good to go!");
                //custom constructor
                casa.miaCasa(drop, hour);
                //casa.setCraft(casa);
                Airport.logic.extraFF.add(casa);
                extraFlights();
                break;
            case 3:
                Airport.logic.validUser();
                break;
            case 4:
                for (int i = 0; i < Airport.logic.extraFF.size(); i++){
                System.out.println(Airport.logic.extraFF.get(i).toString());
                }
                extraFlights();
                break;
            default:
                System.out.println("lolz");
                extraFlights();
                break;
                
        
    }
    } 
}
