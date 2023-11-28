package com.solvd.solvdexercise.data.products;

import com.solvd.solvdexercise.categories.MagazineCategory;
import com.solvd.solvdexercise.data.Library;
import com.solvd.solvdexercise.enums.ProductCategory;

public class Magazine extends Library {

    private int releaseMonth;

    public Magazine(String author, String title, ProductCategory category, int releaseMonth) {
        super(author, title, category);
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
        System.out.println(MagazineCategory.CATEGORY_NAME);
    }
}
