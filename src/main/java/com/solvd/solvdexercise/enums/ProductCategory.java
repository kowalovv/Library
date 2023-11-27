package com.solvd.solvdexercise.enums;

public enum ProductCategory {

    LITERATURE("Books and Magazines"),
    ELECTRONIC("DVD Movies"),
    GAMES("Board Games");

    private final String description;

    static {
        System.out.println("Initializing Product Categories...\n");
    }

    ProductCategory(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void printAllCategories (){
        for (ProductCategory value : ProductCategory.values()) {
            System.out.println(value.getDescription());
        }

    }

}


