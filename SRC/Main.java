import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
     public static void main(String[] args){

        Scanner scnr = new Scanner(System.in);
        HomeInventory inventory = new HomeInventory();
        int userChoice;

        do {
            // Menu
            System.out.println("--- Home Inventory Menu ---");
            System.out.print(" ");
            System.out.print("Type 1 -- To Add Home");
            System.out.print("Type 2 -- To Remove Home");
            System.out.print("Type 3 -- Update Home Information");
            System.out.print("Type 4 -- List Homes");
            System.out.print("Type 5 -- Exit");

            userChoice = scnr.nextInt();
            scnr.nextLine(); // clear buffer

           switch (userChoice) {

                case 1: 
                    try{
                        System.out.println ("Enter Address:");
                        address = scnr.nextLine();

                        System.out.println("Enter Square Footage:");
                        squareFeet = scnr.nextInt();
                    
                        System.out.print("Enter City");
                        city = scnr.nextLine();
                
                        System.out.print("Enter State");
                        state = scnr.nextLine();
                    
                        System.out.print("Enter Zip Code");
                        zipCode = scnr.nextInt();
                    
                        System.out.print("Sale Status");
                        status = scnr.nextLine();
                        
                        System.out.print("Enter Listing Price");
                        price = scnr.nextDouble();
                    
                        Home newHome = new Home (int squareFeet, String address, String city, String state, int zipCode, String saleStatus, double listingPrice);

                        System.out.println(inventory.addHome(newHome));
                    } 
                    catch (Exception e){
                        System.out.println("Error adding home");
                        scnr.nextLine(); // clear bad input
                    }
                    break;

                case 2:
                    try{
                        System.out.print("Enter Address you wish to remove from Listings: ") 
                        address = scnr.nextLine();
                    
                        System.out.println(inventory.removeHome(address));
                    }
                    catch(Exception e) {
                        System.out.println("Error removing home");
                    }
                    break;
                
                case 3:
                    try{
                        System.out.println("Enter Address to Update: ");
                        address = scnr.nextLine();

                        System.out.println(inventory.updateHome(address, scnr));
                    }
                    catch (Exception e){
                        System.out.println("Error Updating Home");
                    }
                    break;

                case 4:
                    try {
                        System.out.println("/n --- Home Listings ---");
                        inventory.listHomes();
                    }
                    catch (Exception e){
                        System.out.println ("Error Listing Homes");
                    }
                    break;
                
                case 5:
                    System.out.println ("Exiting...");
                    break;
                
                default:
                    System.out.println("Invalid selection");
            }  
        }
        while (userChoice != 5); 
           
    }
}