/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport;

import java.util.Scanner;



/**
 *
 * @author matraisin
 */
public class Airport {
    static Scanner kb = new Scanner(System.in);
    static Logic logic = new Logic();
    static ExtraLogic elogic = new ExtraLogic();
    public static int amt = 5;// control amount of generated dummy flights
    public static void main(String[] args) {
        
      
        
       logic.populateCities();
       logic.populatePilots();
       logic.populateAirlanes();
       logic.isWorking(amt);
       menu();
       
       
    }
    /**
     * calling methods from logic and try catch for input, recursion in main.
     */
    public static void menu()
    {
        
        boolean bError = true;
        
do {
        System.out.println(".___  ___.      ___   .___________.___________. __    __   ___________    __    ____    ");
        System.out.println("|   \\/   |     /   \\  |           |           ||  |  |  | |   ____\\   \\  /  \\  /   /    ");
        System.out.println("|  \\  /  |    /  ^  \\ `---|  |----`---|  |----`|  |__|  | |  |__   \\   \\/    \\/   / ");
        System.out.println("|  |\\/|  |   /  /_\\  \\    |  |        |  |     |   __   | |   __|   \\            /  ");
        System.out.println("|  |  |  |  /  _____  \\   |  |        |  |     |  |  |  | |  |____   \\    /\\    / ");
        System.out.println("|__|  |__| /__/     \\__\\  |__|        |__|     |__|  |__| |_______|   \\__/  \\__/    ");
        System.out.println("");
        System.out.println("");
        System.out.println("        ___       __  .______       __          ___      .__   __.  _______    ");
        System.out.println("       /   \\     |  | |   _  \\     |  |        /   \\     |  \\ |  | |   ____|   ");
        System.out.println("      /  ^  \\    |  | |  |_)  |    |  |       /  ^  \\    |   \\|  | |  |__               ");
        System.out.println("     /  /_\\  \\   |  | |      /     |  |      /  /_\\  \\   |  . `  | |   __|   ");
        System.out.println("    /  _____  \\  |  | |  |\\  \\----.|  `----./  _____  \\  |  |\\   | |  |____");
        System.out.println("   /__/     \\__\\ |__| | _| `._____||_______/__/     \\__\\ |__| \\__| |_______|    ");
        System.out.println("");
        System.out.println("                                                            ALL RIGHTS RESERVED !");
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