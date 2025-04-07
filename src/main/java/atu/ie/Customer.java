package atu.ie;

public class Customer {
    private String First_Name;
    private String Second_Name;
    private String ID;
    private String Address;


    public Customer(String first_Name, String second_Name, String ID, String address) {
        if(first_Name.length() < 3){
            throw new IllegalArgumentException("Name too short");
        }

        if(second_Name.length() < 3){
            throw new IllegalArgumentException("Last name too short");
        }

        this.First_Name = first_Name;
        this.Second_Name = second_Name;
        this.ID = ID;
        this.Address = address;
    }
}
