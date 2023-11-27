package com.solvd.solvdexercise.enums;

public enum CustomerStatus {

    STUDENT("Customer has a student status", 7),
    NORMAL("Customer has a regular status", 5),
    VIP("Customer has a VIP status", 10);

    private final String description;
    private final int maxProductsCanBorrow;

    static {
        System.out.println("Initializing Customer Status...\n");
    }

    CustomerStatus(String description, int maxProductsCanBorrow) {
        this.description = description;
        this.maxProductsCanBorrow = maxProductsCanBorrow;
    }

    public String getDescription() {
        return description;
    }

    public int getMaxProductsCanBorrow() {
        return maxProductsCanBorrow;
    }
}
