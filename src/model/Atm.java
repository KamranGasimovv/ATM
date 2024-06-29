package model;

import java.util.Map;

public class Atm {
    private Map<String, Customer> customers;

    public Atm(Map<String, Customer> customers) {
        this.customers = customers;
    }

}
