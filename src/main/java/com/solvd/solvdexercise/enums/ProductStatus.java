package com.solvd.solvdexercise.enums;

public enum ProductStatus {

    BORROWED("All products are borrowed"),
    ORDERED("Product ordered. We are waiting for delivery to library"),
    AVAILABLE("Product is available"),
    UNAVAILABLE("Product are unavailable");

    private final String description;

    static {
        System.out.println("Initializing Product Status...\n");
    }

    ProductStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
