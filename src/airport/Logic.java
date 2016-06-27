/*
 Logic class will:
 - upload cities, pilots names
 -create a dummy flights at the start of the program
 */
package airport;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class Logic {
    Printing_Month printCal = new Printing_Month();
    Scanner ki = new Scanner(System.in);
    //create a calendar to set up manual date

    Calendar calendar = new GregorianCalendar(2016, Calendar.JUNE, 21, 11, 17);
    //populates cities from a file
    ArrayList<String> cityMap = new ArrayList<>();
    //populate pilots names from a file
    ArrayList<String> pilotNames = new ArrayList<>();
    //populate airlanes from a file
    ArrayList<String> airlanes = new ArrayList<>();
    //full flights for dummy data at the start check that later
    LinkedHashMap<String, Flight> fullFlight = new LinkedHashMap<>();
    //models of planes populated from a file
    LinkedHashMap planes = new LinkedHashMap();
    Random rg = new Random();
    //define data format to be displayed
    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm aaa");
    Scanner kb = new Scanner(System.in);
    LinkedHashMap<String, String> results = new LinkedHashMap<>();
    ArrayList<Pilot> pilots = new ArrayList<>();
    ArrayList<Aircraft> extra = new ArrayList<>();

    public void admin() {
        System.out.println("*");
        String user = kb.nextLine();
        System.out.println("*");
        String pas = kb.nextLine();
        if (user.equals("super") && pas.equals("user")){
            validUser();
        }
        else {
            System.out.println("**");
            Airport.menu();
        }    
    }
    
    public void validUser(){
        //Scanner ki = new Scanner(System.in);
        System.out.println("Hello ADMIN");
        System.out.println("To manage existing Flights press    1");
        System.out.println("Add Flight type                     2");
        System.out.println("To see Popular searches type        3");
        System.out.println("Log out type                        4");
        
        System.out.println("");
        int adm = ki.nextInt();
        switch (adm){
            
            case 1:
                adminFlights();
                break;
            case 2:
                adminAddsFlight();
                break;
            case 3:
                System.out.println(results.toString());
                validUser();
                break;
            case 4:
                Airport.menu();
                break;    
            default:
                validUser();
        }
        
        
    }

    public void adminFlights()
    {
        System.out.println("Flights available to manage: ");
        for (int i = 0; i < 1; i++) {
            // Displaying elements of LinkedHashMap
            for (Map.Entry me : fullFlight.entrySet()) {
                System.out.print("\nFLIGHT ID: " + me.getKey()
                        + me.getValue() + "\n");
            }
        }
        System.out.println("Search by ID and MANAGE     1");
        System.out.println("manage by the STAFF         2");
        System.out.println("Log out                     3");
        int adm = ki.nextInt();
        switch(adm){
            
            case 1:
              System.out.println("Type a ID");
              String ask = kb.nextLine();
            // Displaying elements of LinkedHashMap
            Iterator iterator = fullFlight.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry me = (Map.Entry) iterator.next();
                if (((Flight) me.getValue()).getiD().contains(ask)) {
                    System.out.print("RESULTS FOUND:\nFLIGHT ID: " + me.getKey()
                            + me.getValue() + "\n");
                    System.out.println("Manage this flight? Y/N");
                    if (kb.nextLine().equalsIgnoreCase("y"))
                    {
                        letsCheck(me);
                    }
                else{
                    adminFlights();
                }
                    }
        }
                break;
            case 2:
                System.out.println("Available pilots: \n");
                for (int i = 0; i < pilots.size(); i++)
                {
                System.out.println( "Pilot ID - " + (i+1) + " " + pilots.get(i).getName() 
                        + " with rating: "  + pilots.get(i).getRating());
                }
                System.out.println("\nManage Pilots by their ID number or type 0 to leave");
                int add = ki.nextInt();
                if(add == 0){
                    adminFlights();
                }
                else if ( add > 0 && add < 101 ){
                    System.out.println("You wish to manage:");
                    System.out.println(pilots.get(add-1).getName() + " with rating: "
                            +pilots.get(add-1).getRating());
                    System.out.println("Add pilots new Name:");
                    String nn = kb.nextLine();
                    pilots.get(add-1).setName(nn);
                    System.out.println("New name " + pilots.get(add-1).getName() + " was updated");
                    System.out.println("");
                    System.out.println("Add Rating:");
                    add = ki.nextInt();
                    pilots.get(add-1).setRating(add-1);
                    System.out.println("All done!\n");
                    validUser();
                    
                }
                
                else{
                    System.out.println("Somethink went wrong try again\n");
                    adminFlights();
                }
      
        }
        
    }
    
//    public void extraFlights()
//    {
//        System.out.println("LIST OF EXTRA FLIGHTS");
//        //populate extra Flights
//        Helicopter copter = new Helicopter();
//        System.out.println("Please ADD an IRISH COAST GUARD TRIP");
//        String costa = kb.nextLine();
//        copter.setCraft("IRCG Sikorsky S-92 ");
//    }
//    
    
    public void callendar(){
        
      printCal.calCall();
        
        
    }
    
    
    
    //manages the current flight and allows to change details
    public Map.Entry letsCheck( Map.Entry me)
    {
           System.out.println("What detail you wish to manage");
                        System.out.println("Airlane/Orgin/Destonation/Departure/"
                                + "Arrival/Date/\"Airplane\"/Status/Terminal");
                        String manageIt = kb.nextLine();
                        
                        switch(manageIt.toLowerCase()){
                            
                            case "airlane":
                                System.out.println("current: " + (((Flight) me.getValue()).getAirlane()));
                                System.out.println("Set new one:");
                                String key = (String)me.getKey();
                                fullFlight.get(key).setAirlane(kb.nextLine());
                                System.out.println("Your new Airlane is "+ fullFlight.get(key).getAirlane());
                                System.out.println("Do you wish to make other changes? Y/N");
                                if (kb.nextLine().equalsIgnoreCase("y")){
                                    letsCheck(me);
                                }
                                else{
                                    System.out.println("thank you");
                                    adminFlights();
                                }
                            break;
                                
                            case "orgin":
                                key = (String)me.getKey();
                                System.out.println("current: " + (((Flight) me.getValue()).getOrgin()));
                                System.out.println("Set new one:");
                                fullFlight.get(key).setOrgin(kb.nextLine());
                                System.out.println("Your new ORGIN is "+ fullFlight.get(key).getOrgin());
                                System.out.println("Do you wish to make other changes? Y/N");
                                if (kb.nextLine().equalsIgnoreCase("y")){
                                    letsCheck(me);
                                }
                                else{
                                    System.out.println("thank you");
                                    adminFlights();
                                }
                            break;
                                case "destonation":
                                key = (String)me.getKey();
                                System.out.println("current: " + (((Flight) me.getValue()).getDestanation()));
                                System.out.println("Set new one:");
                                fullFlight.get(key).setDestanation(kb.nextLine());
                                System.out.println("Your new DESTONATION is "+ fullFlight.get(key).getDestanation());
                                System.out.println("Do you wish to make other changes? Y/N");
                                if (kb.nextLine().equalsIgnoreCase("y")){
                                    letsCheck(me);
                                }
                                else{
                                    System.out.println("thank you");
                                    adminFlights();
                                }
                            break;
                                case "departure":
                                key = (String)me.getKey();
                                System.out.println("current: " + (((Flight) me.getValue()).getDeparture()));
                                System.out.println("Set new one:");
                                fullFlight.get(key).setDeparture(kb.nextLine());
                                System.out.println("Your new DEPARTURE is "+ fullFlight.get(key).getDeparture());
                                System.out.println("Do you wish to make other changes? Y/N");
                                if (kb.nextLine().equalsIgnoreCase("y")){
                                    letsCheck(me);
                                }
                                else{
                                    System.out.println("thank you");
                                    adminFlights();
                                }
                            break;
                                case "arrival":
                                key = (String)me.getKey();
                                System.out.println("current: " + (((Flight) me.getValue()).getArrival()));
                                System.out.println("Set new one:");
                                fullFlight.get(key).setArrival(kb.nextLine());
                                System.out.println("Your new ARRIVAL is "+ fullFlight.get(key).getArrival());
                                System.out.println("Do you wish to make other changes? Y/N");
                                if (kb.nextLine().equalsIgnoreCase("y")){
                                    letsCheck(me);
                                }
                                else{
                                    System.out.println("thank you");
                                    adminFlights();
                                }
                            break; 
                                case "date":
                                key = (String)me.getKey();
                                System.out.println("current: " + (((Flight) me.getValue()).getDate()));
                                System.out.println("Set new one:");
                                fullFlight.get(key).setDate(kb.nextLine());
                                System.out.println("Your new DATE is "+ fullFlight.get(key).getDate());
                                System.out.println("Do you wish to make other changes? Y/N");
                                if (kb.nextLine().equalsIgnoreCase("y")){
                                    letsCheck(me);
                                }
                                else{
                                    System.out.println("thank you");
                                    adminFlights();
                                }
                            break;
                                case "status":
                                key = (String)me.getKey();
                                System.out.println("current: " + (((Flight) me.getValue()).getStatus()));
                                System.out.println("Set new one:");
                                fullFlight.get(key).setStatus(key);
                                System.out.println("Your new STATUS is "+ fullFlight.get(key).getStatus());
                                System.out.println("Do you wish to make other changes? Y/N");
                                if (kb.nextLine().equalsIgnoreCase("y")){
                                    letsCheck(me);
                                }
                                else{
                                    System.out.println("thank you");
                                    adminFlights();
                                }
                            break; 
                                case "terminal":
                                key = (String)me.getKey();
                                System.out.println("current: " + (((Flight) me.getValue()).getTerminal()));
                                System.out.println("Set new one:");
                                fullFlight.get(key).setTerminal(key);
                                System.out.println("Your new TERMINAL is "+ fullFlight.get(key).getTerminal());
                                System.out.println("Do you wish to make other changes? Y/N");
                                if (kb.nextLine().equalsIgnoreCase("y")){
                                    letsCheck(me);
                                }
                                else{
                                    System.out.println("thank you");
                                    adminFlights();
                                }
                            break;     
                                    
                                    
                        } 
        return me;
    }
    
    public void adminAddsFlight()
    {
        Airplane plane = new Airplane();
        Pilot pilot = new Pilot();
        System.out.println("Who is the pilot?(name) ");
        String add = kb.nextLine();
        pilot.setName(add);
        System.out.println("What is his rating?");
        int k1 = ki.nextInt();
        pilot.setRating(k1);
        System.out.println("Add a plane MODEL:");
        add = kb.nextLine();
        plane.setModel(add);
        System.out.println("Add a plane MAKE");
        add = kb.nextLine();
        plane.setMake(add);
        System.out.println("Add capacity");
        k1 = ki.nextInt();
        plane.setCapacity(k1);
        plane.setPilot(pilot);
        System.out.println("Your mashine is and pilot is assigned do you wish to"
                + " auto-generate a flight  TYPE F\n or set it manualy? TYPE M");
        add = kb.nextLine();
        if (add.equalsIgnoreCase("f")){
            interfacable(plane);
            System.out.println("Flight autogenerated");
            validUser();
        }
        else if (add.equalsIgnoreCase("m")){
            Flight flight = new Flight();
            //take in object plane
            flight.setAircraft(plane);
            System.out.println("SET TERMINAL");
            add = kb.nextLine();
            flight.setTerminal(add);
            System.out.println("SET ORGIN");
            add = kb.nextLine();
            flight.setOrgin(add);
            System.out.println("SET ARRIVAL");
            add = kb.nextLine();
            flight.setArrival(add);
            System.out.println("FLIGHT ID GENERATED AUTOMATICLY:");
            String arrival = add;
            flight.setiD(arrival.charAt(0) + arrival.charAt(1) + flight.getTerminal() + rg.nextInt(50));
            System.out.println("Your generated ID :" + flight.getiD());
            System.out.println("Set AIRLANE");
            add = kb.nextLine();
            flight.setAirlane(add);
            System.out.println("Set DESTANATIION");
            add = kb.nextLine();
            flight.setDestanation(add);
            System.out.println("Set STATUS");
            add = kb.nextLine();
            flight.setStatus(add);
            flight.setDuration((rg.nextInt(14) + 1));
            System.out.println("SET DEPARTURE");
            add = kb.nextLine();
            flight.setDeparture(add);
            fullFlight.put(flight.getiD(), flight);
            System.out.println("YOU FLIGHT WAS ADDED SUCCEFULLY");
            validUser();
            
        }
        else {
            adminAddsFlight();
            
        }
    }
       
    public void interfacable(Aircraft plane) {   //create and new object Flight
        Flight flight = new Flight();
        //take in object plane
        flight.setAircraft(plane);
        //set terminal
        flight.setTerminal("T" + (rg.nextInt(2) + 1));
        //set orgin from cityMap
        flight.setOrgin(Airport.logic.cityMap.get(rg.nextInt(158)));
        String arrival = Airport.logic.cityMap.get(rg.nextInt(158));
        flight.setArrival(arrival);
        //generate the ID from first two chars of arrival plus terminal and random number
        flight.setiD(arrival.charAt(0) + arrival.charAt(1) + flight.getTerminal() + rg.nextInt(50));
        //get random airlane from airlanes file
        flight.setAirlane(airlanes.get(rg.nextInt(airlanes.size())));
        //set destonation
        flight.setDestanation(Airport.logic.cityMap.get(rg.nextInt(158)));

       
        //status
        flight.setStatus(randomStatus(rg.nextInt(2)));
        if (flight.getStatus().equalsIgnoreCase("arrved"))
        {
             //set date of flight
        flight.setDate(setTimeA());
        }
        else
        {
             //set date of flight
        flight.setDate(setTimeI());
        }

        //random duration
        flight.setDuration((rg.nextInt(14) + 1));
        //generate a departure String
        String departure = (Airport.logic.cityMap.get(rg.nextInt(158)));
        //run a method to check if departure is not equal with arrival
        //return set of two different cities
        flyThere(arrival, departure);
        //set the departure when is different than arrival
        flight.setDeparture(departure);


        fullFlight.put(flight.getiD(), flight);

    }

    public String[] flyThere(String arrival, String departure) {
        if (arrival.equalsIgnoreCase(departure)) {
            departure = (Airport.logic.cityMap.get(rg.nextInt(158)));
            flyThere(arrival, departure);
        }

        String[] track = new String[2];
        track[0] = arrival;
        track[1] = departure;
        return track;
    }

    public void populatePlanes() {
        {
            //name of the file
            String fileName = "temp.txt";
            //refference one line at a time
            String line = null;

            try {
                //file rerader reads files in defoult encoding
                FileReader fileReader = new FileReader("airplanes.txt");

                // always wrap FileReader in BufferReader
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while ((line = bufferedReader.readLine()) != null) {

                    Airplane plane = new Airplane();
                    Pilot pilot = new Pilot();
                    pilot.setName(pilotNames.get(rg.nextInt(pilotNames.size() - 1)));
                    pilot.setRating((rg.nextInt(5) + 1));
                    String[] parts = line.split(",");
                    String part1 = parts[0];
                    String part2 = parts[1];
                    String part3 = parts[2];
                    int capa = Integer.parseInt(part3);
                    plane.setCapacity(capa);
                    plane.setMake(part1);
                    plane.setModel(part2);
                    plane.setPilot(pilot);
                    pilots.add(pilot);
                    interfacable(plane);

                }

                //always close files
                bufferedReader.close();
                System.out.println("\n            *** HAVE A GREAT TRIP ***\n");

            } catch (FileNotFoundException ex) {
                System.out.println("    Unable to open file " + fileName + "'");
            } catch (IOException ex) {
                System.out.println("    Error reading file " + fileName + "'");
            }
        }

    }

    public void isWorking() {
        for (int i = 0; i < 1; i++) {
            populatePlanes();
        }
    }

    public void arrivals() {
        for (int i = 0; i < 1; i++) {

            // Displaying elements of LinkedHashMap
            Iterator iterator = fullFlight.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry me = (Map.Entry) iterator.next();
                if (((Flight) me.getValue()).getStatus().contains("ARRIVED ")) {
                    System.out.print("\nFLIGHT ID: " + me.getKey()
                            + me.getValue() + "\n");
                }

            }
        }
        miniLooper();
    }

    public void departures() {
        for (int i = 0; i < 1; i++) {

            // Displaying elements of LinkedHashMap
            Iterator iterator = fullFlight.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry me = (Map.Entry) iterator.next();
                if (!((Flight) me.getValue()).getStatus().contains("ARRIVED ")) {
                    System.out.print("\nFLIGHT ID: " + me.getKey()
                            + me.getValue() + "\n");
                }

            }
        }
            miniLooper();
    }

    public void miniLooper() 
    {
        System.out.println("PRESS  \"B\"  to get BACK");
        System.out.println("PRESS  \"F\"  to SEARCH ");
        String in = kb.nextLine();
        switch (in.toLowerCase()) {

            case "b":
                Airport.menu();
                break;
            case "f":
                System.out.println("Type a destanation");
                String ask = kb.nextLine();
            // Displaying elements of LinkedHashMap
            Iterator iterator = fullFlight.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry me = (Map.Entry) iterator.next();
                if (((Flight) me.getValue()).getDestanation().contains(ask)) {
                    System.out.print("RESULTS FOUND:\nFLIGHT ID: " + me.getKey()
                            + me.getValue() + "\n");
                    System.out.println("Save the search?  Y/N");
                    if(kb.nextLine().equalsIgnoreCase("y")){
                    String a = me.getKey().toString();
                    String b = me.getValue().toString();
                    results.put(a,b);   
                    }
                    else{
                        miniLooper();
                    }
                }
        }
                miniLooper();
                break;
            default:
                miniLooper();
                                  }
    }

    public void popularSearch()
    {
        System.out.println(results.toString());
    }
    
    public String randomStatus(int a) {
        int status = rg.nextInt(25);
        if (a == 0 && status > 10 || a == 1 && status > 5) {
            String onTime = "ON TIME";
            return onTime;
        } else if (a == 0 && status < 5) {
            String delay = "DELAY " + (rg.nextInt(30) + 1) + " min";
            return delay;
        } else {
            String arrived = "ARRIVED ";
            return arrived;
        }

    }

    
    
    // set time that arrived     

    private String setTimeA() {

        //System.out.println("Current Date::");
        String date = sdf.format(calendar.getTime());
        date = sdf.format(calendar.getTime());
        calendar.add(Calendar.HOUR, -(rg.nextInt(2) + 1));
        calendar.add(Calendar.MINUTE, -(rg.nextInt(60) + 1));
        return date;
    }

    //set time of incoming

    private String setTimeI() {

        //System.out.println("Current Date::");
        String date = sdf.format(calendar.getTime());
        date = sdf.format(calendar.getTime());
        calendar.add(Calendar.HOUR, (rg.nextInt(5) + 1));
        calendar.add(Calendar.MINUTE, (rg.nextInt(60) + 1));
        return date;
    }

    //read from a file 

    public void populateAirlanes() {
        //name of the file
        String fileName = "temp.txt";
        //refference one line at a time
        String line = null;

        try {
            //file rerader reads files in defoult encoding
            FileReader fileReader = new FileReader("airlanes.txt");

            int count;
            try ( // always wrap FileReader in BufferReader
                    BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                count = 0;
                while ((line = bufferedReader.readLine()) != null) {

                    airlanes.add(line);
                    count++;
                }

                //always close files
            }
            System.out.println("\n" + "*** " + count + " Airlanes ***\n");
//            System.out.println("\n     *** Flights generated succesfully ***\n");

        } catch (FileNotFoundException ex) {
            System.out.println("    Unable to open file " + fileName + "'");
        } catch (IOException ex) {
            System.out.println("    Error reading file " + fileName + "'");
        }
    }

    //reading city names from a file and add them to ArrayList cityMap
    public void populateCities() {

        //name of the file
        String fileName = "temp.txt";
        //refference one line at a time
        String line = null;

        try {
            //file rerader reads files in defoult encoding
            FileReader fileReader = new FileReader("flights.txt");

            int count;
            try ( // always wrap FileReader in BufferReader
                    BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                count = 0;
                while ((line = bufferedReader.readLine()) != null) {

                    cityMap.add(line);
                    count++;
                }

                //always close files
            }
            System.out.println("\n" + "*** " + count + " Flights destanations available ***\n");
//            System.out.println("\n     *** Flights generated succesfully ***\n");

        } catch (FileNotFoundException ex) {
            System.out.println("    Unable to open file " + fileName + "'");
        } catch (IOException ex) {
            System.out.println("    Error reading file " + fileName + "'");
        }
    }

    // reading pilots names from a file and adding to ArrayList pilotNames
    public void populatePilots() {
        //name of the file
        String fileName = "temp.txt";
        //refference one line at a time
        String line = null;

        try {
            //file rerader reads files in defoult encoding
            FileReader fileReader = new FileReader("pilots.txt");

            int count;
            try ( // always wrap FileReader in BufferReader
                    BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                count = 0;
                while ((line = bufferedReader.readLine()) != null) {

                    pilotNames.add(line);
//            System.out.println(count + " " + line.toString());
                    count++;

                }

                //always close files
            }
            System.out.println("\n" + "*** " + count + " Pilots available ***\n");
//            System.out.println("\n     *** Flights generated succesfully ***\n");

        } catch (FileNotFoundException ex) {
            System.out.println("    Unable to open file " + fileName + "'");
        } catch (IOException ex) {
            System.out.println("    Error reading file " + fileName + "'");
        }
    }

}   //                           *** END OF FILE ***








//boolean bError = true;
//do {
//            try {
//                System.out.println("Enter first num: ");
//                n1 = input.nextInt();
//                bError = false;
//            } 
//catch (Exception e) {
//            System.out.println("Error!");
//           input.hasNextInt();         
//        }













//          iterate trought fullFlight #MAP
//for (int i = 0; i< 7; i++)
//        {
//           // Generating a Set of entries
//         Set set = fullFlight.entrySet();
//
//         // Displaying elements of LinkedHashMap
//         Iterator iterator = set.iterator();
//         while(iterator.hasNext()) {
//            Map.Entry me = (Map.Entry)iterator.next();
//            System.out.print("\nFLIGHT ID: "+ me.getKey() + 
//                    me.getValue()+"\n");
//         }
//            
//            
//        }
// DEPARTURES v!
//int selector = 1;
//        String flightNo = "";
//        String t;
//        String arrival;
//        String date;
//        String status;
//        System.out.println( "CURRENT TIME: "  + sdf.format(calendar.getTime()) + "      DEPARTURES:");
//        System.out.println("\nTERMINAL          FROM              ID          TIME             STATUS");
//        for (int i = 0; i< 7; i++)
//        {
//            t = "T"+ (rg.nextInt(2)+1);
//            arrival = Airport.logic.cityMap.get(rg.nextInt(158));
//            date = setTimeA();
//            status = randomStatus(selector);
//            flightNo = arrival.charAt(0) + arrival.charAt(1) + t + status.charAt(0) + rg.nextInt(5);
//            fullFlight.put(flightNo, t+ "   " + arrival + "  " + flightNo + "   " 
//                    + date + "   " + status);
//            System.out.println( (i+1)+  " |  " +  t+ "    |     " + arrival + "     |    " + flightNo + " |  " 
//                    + date + "    |     " + status);
//            System.out.println("");
// ARRIVALS V2
//String flightNo = "";
//        String t;
//        String arrival;
//        String date;
//        String status;
//        System.out.println( "CURRENT TIME: "  + sdf.format(calendar.getTime()) + "      ARRIVALS:");
//        System.out.println("\nTERMINAL          FROM              ID          TIME             STATUS");
//        
//        
//        for (int i = 0; i< 7; i++)
//        {
//            t = "T"+ (rg.nextInt(2)+1);
//            arrival = Airport.logic.cityMap.get(rg.nextInt(158));
//            date = setTimeA();
//            status = "ARRIVED";
//            flightNo = arrival.charAt(0) + arrival.charAt(1) + t + status.charAt(0) + rg.nextInt(50);
//            fullFlight.put(flightNo, t+ "   " + arrival + "  " + flightNo + "   " 
//                    + date + "   " + status);
//            System.out.println(" |  " +  t+ "    |     " + arrival + "     |    " + flightNo + " |  " 
//                    + date + "    |     " + status);
//            System.out.println("");
//            
//        }
//        for (int i = 0; i < 9; i++)
//        {
//           t = "T"+ (rg.nextInt(2)+1);
//           int selector = 0;
//            arrival = Airport.logic.cityMap.get(rg.nextInt(158));
//            date = setTimeI();
//            status = randomStatus(selector);
//            flightNo = arrival.charAt(0) + arrival.charAt(1) + t + status.charAt(0) + rg.nextInt(50);
//            fullFlight.put(flightNo, t+ "       " + arrival + "   " + flightNo + "   " 
//                    + date + "   " + status); 
//            System.out.println(" |  " +  t+ "    |     " + arrival + "     |    " + flightNo + " |  " 
//                    + date + "    |     " + status);
//            System.out.println("");
//        }
//      ARRIVALS METHOD V1:
//
//    public void arrivals()
//    {
//        String flightNo = "";
//        String t;
//        String arrival;
//        String date;
//        String status;
//        System.out.println( "CURRENT TIME: "  + sdf.format(calendar.getTime()) + "      ARRIVALS:");
//        System.out.println("\nTERMINAL          FROM              ID          TIME             STATUS");
//        
//        
//        for (int i = 0; i< 7; i++)
//        {
//            t = "T"+ (rg.nextInt(2)+1);
//            arrival = Airport.logic.cityMap.get(rg.nextInt(158));
//            date = setTimeA();
//            status = "ARRIVED";
//            flightNo = arrival.charAt(0) + arrival.charAt(1) + t + status.charAt(0) + rg.nextInt(50);
//            fullFlight.put(flightNo, t+ "   " + arrival + "  " + flightNo + "   " 
//                    + date + "   " + status);
//            System.out.println(" |  " +  t+ "    |     " + arrival + "     |    " + flightNo + " |  " 
//                    + date + "    |     " + status);
//            System.out.println("");
//            
//        }
//        for (int i = 0; i < 9; i++)
//        {
//           t = "T"+ (rg.nextInt(2)+1);
//           int selector = 0;
//            arrival = Airport.logic.cityMap.get(rg.nextInt(158));
//            date = setTimeI();
//            status = randomStatus(selector);
//            flightNo = arrival.charAt(0) + arrival.charAt(1) + t + status.charAt(0) + rg.nextInt(50);
//            fullFlight.put(flightNo, t+ "       " + arrival + "   " + flightNo + "   " 
//                    + date + "   " + status); 
//            System.out.println(" |  " +  t+ "    |     " + arrival + "     |    " + flightNo + " |  " 
//                    + date + "    |     " + status);
//            System.out.println("");
//        }
//        
//    }