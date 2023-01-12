import java.util.Scanner;

public class Methods {


    AddressBook[] ad1 = new AddressBook[10];

    void addcontact() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number of contacts you want to add: ");
        num = sc.nextInt();


        for (int i = 0; i < num; i++) {
            AddressBook p1 = new AddressBook();
            System.out.println("Enter your First Name ");
            String fname = sc.next();
            p1.setFirstName(fname);
            System.out.println("Enter your Last Name ");
            String lname = sc.next();
            p1.setLastName(lname);
            System.out.println("Enter your Phone Number: ");
            long phnumber = sc.nextLong();
            p1.setPhoneNumber(phnumber);
            System.out.println("Enter your address: ");
            String addr = sc.next();
            p1.setAddress(addr);
            System.out.println("Enter your City: ");
            String city1 = sc.next();
            p1.setCity(city1);
            System.out.println("Enter your State: ");
            String state1 = sc.next();
            p1.setState(state1);
            System.out.println("Enter your PINCODE: ");
            int pin = sc.nextInt();
            p1.setPincode(pin);
            ad1[i] = p1;
        }

    }

    void print() {

        for (int j = 0; j < ad1.length; j++) {
            if (ad1[j] == null)
                break;
            System.out.println(ad1[j]);

        }


    }


}

