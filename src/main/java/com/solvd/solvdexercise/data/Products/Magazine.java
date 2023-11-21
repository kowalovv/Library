package com.solvd.solvdexercise.data.Products;

import com.solvd.solvdexercise.categories.CategoryC;
import com.solvd.solvdexercise.data.Library;

public class Magazine extends Library {

    private int releaseMonth;

    public Magazine(String author, String title, int releaseMonth) {
        super(author, title);
        this.releaseMonth = releaseMonth;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    @Override
    public void printCategory() {
        System.out.println(CategoryC.CATEGORY_NAME);
    }
}
