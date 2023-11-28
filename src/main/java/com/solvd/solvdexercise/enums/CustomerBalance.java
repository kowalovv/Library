package com.solvd.solvdexercise.enums;

public enum CustomerBalance {

    OVERDUE_BALANCE("Customer has exceeded the deadline"),
    NOT_OVERDUE_BALANCE("Customer did not exceed the deadline");

    private final String description;

    static {
        System.out.println("Initializing Customer Balance...\n");
    }

    CustomerBalance(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
