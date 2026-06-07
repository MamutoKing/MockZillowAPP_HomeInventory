public class Home{

    private int squareFeet;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private String saleStatus;
    private double listingPrice;


    // Constructor
    public Home (int squareFeet, String address, String city, String state, int zipCode, String saleStatus, double listingPrice) {
        try {
            this.squareFeet = squareFeet;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
            this.saleStatus = saleStatus;
            this.listingPrice = listingPrice;
        }

        catch (Exception e) {
            System.out.println("      Failure:"       );
            System.out.println("---------------------");
            System.out.println("Unable to create Home");
        }
    }


    // Method to return Home Information
    public String getHomeInformation() {
        try {
            return "Square Footage: \n" + squareFeet + "\n" +
                   "Address: \n" + address + "\n" +
                   "City: \n" + city + "\n" +
                   "State: \n" + state + "\n" +
                   "Zip Code: \n" + zipCode + "\n" +
                   "Sale Status: \n" + saleStatus + "\n" +
                   "Listing Price: \n" + listingPrice;
        }

        catch (Exception e){
            System.out.println("             Failure:"              );
            System.out.println("-----------------------------------");
            System.out.println("Unable to retrieve Home Information");

            return "Error retrieving home information";
        }
    }

}