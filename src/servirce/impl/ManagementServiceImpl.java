package servirce.impl;

import enums.Exceptions;
import exceptions.GeneralException;
import servirce.CustomerService;
import servirce.ManagementService;

import static util.MenuUtil.entry;

public class ManagementServiceImpl implements ManagementService {
    @Override
    public void management() {
        while (true) {
            try {
                while (true) {
                    System.out.println("\n----------| ATM |----------");

                    CustomerService customerService = new CustomerServiceImpl();

                    int option = entry();

                    switch (option) {

                        case 1:
                            cashOut();
                            break;
                        case 2:
                            System.out.println("Exiting...");
                            return;
                        default:
                            throw new GeneralException(Exceptions.INVALID_CHOICE);
                    }
                }
            } catch (GeneralException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
