package helper;

import exceptions.GeneralException;
import model.Customer;

import java.util.Scanner;

public class CustomerServiceHelper {
    private void cashOut() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter IBAN: ");
        String iban = scanner.nextLine();
        System.out.print("Enter PIN code: ");
        String pin = scanner.nextLine();

        try {
            Customer customer = authenticateCustomer(iban, pin);
            if (customer != null) {
                System.out.println("Welcome, " + customer.getName());
                System.out.println("Total amount: " + customer.getTotalAmount() + "₼");

                System.out.print("Enter the amount to cash out: ");
                double amount = scanner.nextDouble();

                try {
                    customer.withdraw(amount);
                } catch (GeneralException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        } catch (GeneralException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private Customer authenticateCustomer(String iban, String pin) throws GeneralException {
        if (customers.containsKey(iban)) {
            Customer customer = customers.get(iban);

            if (pin.equals("1234")) { // Burada gerçək pin kodunu yoxlayın
                return customer;
            } else {
                throw new GeneralException("Incorrect PIN code. Card blocked after 3 incorrect attempts.");
            }
        } else {
            throw new GeneralException("Invalid IBAN. Card not found.");
        }
}
