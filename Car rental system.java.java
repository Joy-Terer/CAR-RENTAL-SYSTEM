import java.util.Scanner;

public class rental extends carrent {
    public static void main(String[] args) {
        carrent car = new carrent();

        Scanner input =new Scanner(System.in);
        System.out.println("welcome to the car rental system");
        System.out.println("please enter your choice");
        System.out.println("1. rent a car1");
        int choice = input.nextInt();
    switch (choice) {
        case 1:
            System.out.println("rent a car");
            car.rentcar();
            break;
            default:
            System.out.println("please enter the choices displayed");
    }
       
    }
    
}

class Car {
    private String carName;
    private int carRegistration;
    private double carPrice;
    public  void getcarDetails(String carName, int carRegistration, double carPrice) {
        
        Scanner details = new Scanner(System.in);
        System.out.println("Enter the name of the car");
        this.carName = details.nextLine();
        System.out.println("please enter your vehicle registration");
        this.carRegistration = details.nextInt();

        details.nextLine();

        System.out.println("please enter the price of the vehicle");
        this.carPrice = details.nextDouble();

        details.nextLine();

        
        }
        public String getcarName(){
            return carName;
        }
        public int getcarRegistration(){
            return carRegistration;
        }

        public double carPrice(){
            return carPrice;
        }
}

 class Customer extends Car{

        private String customerName;
        private String customerAddress;
        private int customerContact;
        private int CustomerID;
    public  void getcustomerDetails(String customerName, String customerAddress, int customerContact, int CustomerID) {
        String carName =getcarName();
        int carRegistration = getcarRegistration();
        double carPrice = carPrice();
       getcarDetails(carName,carRegistration,carPrice);
        
            Scanner customerinfo = new Scanner (System.in);
            System.out.println("enter your name");
            this.customerName = customerinfo.nextLine();
            System.out.println("enter your address");
            this.customerAddress = customerinfo.nextLine();
            System.out.println("enter your contact");
            this.customerContact = customerinfo.nextInt();
            System.out.println("enter your customer tag");
            this.CustomerID = customerinfo.nextInt();
            System.out.println("the customer's name is :" +customerName);
            

            
    }
        public String getcustomerName(){
                return customerName;
            }
        public String getcustomerAddress(){
                return customerAddress;
            }
        public int getcustomerContact(){
                return customerContact;
            }
        public int getCustomerID(){
                return CustomerID;
            }

}

class carrent extends Customer {

    public void rentcar() {
        int days;
        double total;

       String customerName  = getcustomerName();
       String customerAddress = getcustomerAddress();
       int customerContact = getcustomerContact();
       int CustomerID = getCustomerID(); 
        getcustomerDetails(customerName, customerAddress, customerContact, CustomerID);
    Scanner rent = new Scanner(System.in);
        System.out.println("how many days would you like to rent the car");
        days = rent.nextInt();
        total = days * carPrice();
        System.out.println("the total amount to be paid is " + total);
       
    
    }
    public void rentalTransctions(){
        int pay;
        Scanner paymentmethod = new Scanner (System.in);
        System.out.println("please enter them method of payment you would like to do");
        System.out.println("1. cash");
        System.out.println("2.card");
        pay = paymentmethod.nextInt();


    }
}

