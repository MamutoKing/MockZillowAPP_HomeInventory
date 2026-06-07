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
            System.out.println("Failure: Unable to create Home");
            
        }
    }
    // Getters
    public String getAddress() { return address; }
    public int getSquareFeet() { return squareFeet; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public int getZipCode() { return zipCode; }
    public String getSaleStatus() { return saleStatus; }
    public double getListingPrice() { return listingPrice; }

    //Setters
    public void setSquareFeet(int squareFeet) { this.squareFeet = squareFeet; }
    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
    public void setZipCode(int zipCode) { this.zipCode = zipCode; }
    public void setSaleStatus(String saleStatus) { this.saleStatus = saleStatus; }
    public void setListingPrice(double listingPrice) { this.listingPrice = listingPrice;} 


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
            System.out.println("Failure: Unable to retrieve Home Information");
            return "Error retrieving home information";
        }
    }

}