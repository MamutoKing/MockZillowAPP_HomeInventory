import java.util.ArrayList;
import java.util.Scanner;

public class HomeInventory {

    //Create ArrayList for storing Home Information
    private ArrayList<Home> homeInventory = new ArrayList<>();


    //Method to add a Home
    public String addHome(Home newHome){
        try{
            homeInventory.add(newHome);
            return "Success: New Home Added";
        }
        catch (Exception e){
            return "Failure: Home was not Added";
        }
    }


    //Method to remove a Home
    public String removeHome(String address) {
        try{
            for (int i = 0, i < homeInventory.size(); ++i) {

                Home home = homeInventory.get(i);

                if (home.getAddress().equals(address)){
                    homeInventory.remove(i);
                    return "Success: Home reomoved";
                }
            }

            return "Failure: Home Not Found";
        }

        catch (Exception e){
            return "Failure: Error removing Home";
        }
    }


    //Method to Update Home
    public String updateHome(String address, Scanner scnr){

        Scanner scnr = new Scanner(System.in);

        try{
            boolean found = false;

            for (int i = 0; i < homeInventory.size(); ++i) {

                Home home = homeInventory.get(i);

                if (home.getAddress().equals(address)) {
                    found = true;

                    System.out.println("What would you like to update?");
                    System.out.println(" ");
                    System.out.println("Type 1 - To update Square Footage");
                    System.out.println("Type 2 - City");
                    System.out.println("Type 3 - State");
                    System.out.println("Type 4 - Zip Code");
                    System.out.println("Type 5 - Sale Status");
                    System.out.println("Type 6 - Listing Price");

                    int userChoice = scnr.nextInt();
                    scnr.nextLine();

                    switch (userChoice) {
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
            scnr.nextLine(); 

           switch (userChoice) {
                case 1:
                            System.out.print("Enter new SqFt: ");
                            home.setSquareFeet(scnr.nextInt());
                            break;

                        case 2:
                            System.out.print("Enter new City: ");
                            home.setCity(scnr.nextLine());
                            break;

                        case 3:
                            System.out.print("Enter new State: ");
                            home.setState(scnr.nextLine());
                            break;

                        case 4:
                            System.out.print("Enter new Zip: ");
                            home.setZipCode(scnr.nextInt());
                            break;

                        case 5:
                            System.out.print("Enter new Status: ");
                            home.setSaleStatus(scnr.nextLine());
                            break;

                        case 6:
                            System.out.print("Enter new Price: ");
                            home.setListingPrice(scnr.nextDouble());
                            break;

                        default:
                            return "Failure: Invalid selection";
                    }
                
                    return "Success: Home updated";
                }
            }

            if (!found) {
                return "Failure: Address not found";
            }
        }
        catch (Exception e){
            return "Failure:Error updating home"
        }
        return "Failure: Unknown error";
    }

    //Method to return ArrayList
    public ArrayList<Home> getHomes() {
        return homeInventory;
    }
}   