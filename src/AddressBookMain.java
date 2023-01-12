import java.util.Scanner;
import java.lang.String;

class AddressBook {

    private String firstName;
    private String lastName;
    private long phoneNumber;
    private String address;
    private String city;
    private String state;
    private int pincode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }


    void displayAddressbook() {

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Phone Number :" + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Pincode" + pincode);
    }
}

    public class AddressBookMain {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);


        System.out.println("===== WELCOME TO ADDRESS BOOK MANAGEMENT =======");
        AddressBook p1 = new AddressBook();
        AddressBook[] obj1 = new AddressBook[1];


        obj1[0] = new AddressBook();
        p1.setFirstName("Sam");
        p1.setLastName("Varghese");
        p1.setPhoneNumber(7568487077l);
        p1.setAddress("Madhuban Housingboard");
        p1.setCity("Jodhpur");
        p1.setState("Rajasthan");
        p1.setPincode(342005);
        p1.displayAddressbook();




        }

    }



