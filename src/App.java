import java.util.Scanner;

import Controller.AdminController;
import Controller.CustomerController;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        AdminController adminController = new AdminController(sc);
        CustomerController customerController = new CustomerController(sc);

        boolean running = true;
        while(running){
            System.out.println("Vehicle Rental System");
            System.out.println("1. Admin");
            System.out.println("2. Customer");
            System.out.println("3. exit");
            System.out.println("Enter your options :");
            int option=sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    adminController.handle();
                    break;
                case 2:
                    customerController.handle();
                    break;
                case 3:
                    running = false;
                    break;
                
                default:    
                    System.out.println("Invalid option");
                    break;
            }
        }
        sc.close();
    }
}
