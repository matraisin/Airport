/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport;

import java.util.Scanner;



/**
 *
 * @author rogozinskim
 */
public class Airport {
    static Scanner kb = new Scanner(System.in);
    static Logic logic = new Logic();
    public static void main(String[] args) {
        
      
        
       logic.populateCities();
       logic.populatePilots();
       logic.populateAirlanes();
       logic.populatePlanes();
       menu();
       
       
    }
    
    public static void menu()
    {
        
        boolean bError = true;
        
do {
        
        System.out.println("TYPE        -1-     for Departures");
        System.out.println("TYPE        -2-     for Arrivals");
        System.out.println("TYPE        -3-     to find a flight");
        
        bError = false;
        int menuItem; 
            try {
                menuItem = kb.nextInt();
            }
       catch (Exception e) {
          
       
            System.out.println("Error!");
            bError = true;
            kb.next();
            continue;  
    }
        switch(menuItem){
            
            case 1:
                logic.departures();
                break;
                
            case 2:
                logic.arrivals();
                break;
            
            case 3:
                logic.callendar();
                break;
                
            case 4:
                logic.admin();
                break;
                
            default: menu();    
        }
    

}

    while (bError);
           
    }}