import java.util.Scanner;

public class Main {
     public static void main(String[] args){

        Scanner scnr = new Scanner(System.in);
        HomeInventory inventory = new HomeInventory();
        int userChoice;

        do {
            // Menu
            System.out.println("\n--- Home Inventory Menu ---");
            System.out.println(" ");
            System.out.println("Type 1 -- To Add Home");
            System.out.println("Type 2 -- To Remove Home");
            System.out.println("Type 3 -- Update Home Information");
            System.out.println("Type 4 -- List Homes");
            System.out.println("Type 5 -- Exit");

            userChoice = scnr.nextInt();
            scnr.nextLine(); // clear buffer

           switch (userChoice) {

                case 1: 
                    try{
                        System.out.print("Enter Address:");
                        String address = scnr.nextLine();

                        System.out.print("Enter Square Footage:");
                        int squareFeet = scnr.nextInt();
                        scnr.nextLine();
                    
                        System.out.print("Enter City:");
                        String city = scnr.nextLine();
                
                        System.out.print("Enter State:");
                        String state = scnr.nextLine();
                    
                        System.out.print("Enter Zip Code:");
                        int zipCode = scnr.nextInt();
                        scnr.nextLine();
                    
                        System.out.print("Enter Sale Status:");
                        String saleStatus = scnr.nextLine();
                        
                        System.out.print("Enter Listing Price:");
                        double listingPrice = scnr.nextDouble();
                    
                        Home newHome = new Home (squareFeet, address, city, state, zipCode, saleStatus, listingPrice);

                        System.out.println(inventory.addHome(newHome));
                    } 

                    catch (Exception e){
                        System.out.println("Error adding home");
                        
                    }
                    break;

                case 2:
                    try{
                        System.out.print("Enter Address you wish to remove from Listings: "); 
                        String removeAddress = scnr.nextLine();
                        System.out.println(inventory.removeHome(removeAddress));
                    }

                    catch(Exception e) {
                        System.out.println("Error removing home");
                    }
                    break;
                
                case 3:
                    try{
                        System.out.println("Enter Address to Update: ");
                        String updateAddress = scnr.nextLine();
                        System.out.println(inventory.updateHome(updateAddress, scnr));
                    }
                    catch (Exception e){
                        System.out.println("Error Updating Home");
                    }
                    break;

                case 4:
                    try {
                        System.out.println("\n --- Home Listings ---");
                        inventory.listHomes();
                    }
                    catch (Exception e){
                        System.out.println ("Error Listing Homes");
                    }
                    break;
                
                case 5:
                    System.out.println ("Exiting...");
                    // File prompt
                    try{
                        System.out.print("Print to file? (Y/N): ");
                        String choice = scnr.nextLine();

                        if (choice.equalsIgnoreCase("y")){
                            System.out.println(FileManager.printToFile(inventory.getHomes()));

                        }
                        else{
                            System.out.println("File will not be printed");
                        }
                    }
                    catch (Exception e){
                        System.out.println("Error handling file output");
                        }
                    break;
                
                default:
                    System.out.println("Invalid selection");
            }  
        }
        while (userChoice != 5); 
    }
}