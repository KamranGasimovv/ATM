package model;

public class Customer {
    private String name;
    private String iban;
    private Double totalAmount;

    public Customer(String name, String iban, Double totalAmount) {
        this.name = name;
        this.iban = iban;
        this.totalAmount = totalAmount;
    }

    public String getName() {
        return name;
    }

    public String getIban() {
        return iban;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }
}
