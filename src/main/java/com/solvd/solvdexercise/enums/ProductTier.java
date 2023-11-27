package com.solvd.solvdexercise.enums;

public enum ProductTier {

    MAGAZINE(1),
    BOOK(2),
    DVD(3),
    BOARD_GAME(4);

    private final int tierNumber;

    static {
        System.out.println("Initializing Product Tier According To Value...\n");
    }

    ProductTier(int tierNumber) {
        this.tierNumber = tierNumber;
    }

    public int getTierNumber() {
        return tierNumber;
    }
}
