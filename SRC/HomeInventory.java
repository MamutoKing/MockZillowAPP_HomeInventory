import java.util.ArrayList;
import java.util.Scanner;

public class HomeInventory {

    private ArrayList<Home> homeInventory = new ArrayList<>();

    // Add
    public String addHome(Home newHome) {
        try {
            homeInventory.add(newHome);
            return "Success: New Home Added";
        } catch (Exception e) {
            return "Failure: Home was not added";
        }
    }

    // Remove
    public String removeHome(String address) {
        try {
            for (int i = 0; i < homeInventory.size(); i++){
                Home home = homeInventory.get(i);

                if (home.getAddress().equals(address)) {
                    homeInventory.remove(i);
                    return "Success: Home removed";
                }
            }
            return "Failure: Home not found";

        } catch (Exception e) {
            return "Failure: Error removing home";
        }
    }

    // Update
    public String updateHome(String address, Scanner scnr) {
        try {
            for (Home home : homeInventory) {

                if (home.getAddress().equals(address)) {

                    System.out.println("1. Square Feet");
                    System.out.println("2. City");
                    System.out.println("3. State");
                    System.out.println("4. Zip Code");
                    System.out.println("5. Sale Status");
                    System.out.println("6. Listing Price");

                    int choice = scnr.nextInt();
                    scnr.nextLine();

                    switch (choice) {
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

            return "Failure: Address not found";

        } catch (Exception e) {
            return "Failure: Error updating home";
        }
    }

    // List
    public void listHomes() {
        for (Home home : homeInventory) {
            System.out.println(home.getHomeInformation());
            System.out.println("---------------------");
        }
    }
}
