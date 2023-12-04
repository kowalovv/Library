package com.solvd.solvdexercise.data.products;

import com.solvd.solvdexercise.categories.DvdCategory;
import com.solvd.solvdexercise.data.Library;
import com.solvd.solvdexercise.enums.ProductCategory;


import java.util.Objects;

public class Dvd extends Library {
    private int duration;

    public Dvd(String author, String title, ProductCategory category, int duration) {
        super(author, title, category);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dvd dvd = (Dvd) o;
        if (!getAuthor().equals(dvd.getAuthor())) return false;
        if (!getTitle().equals(dvd.getTitle())) return false;
        return duration == dvd.duration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration);
    }

    @Override
    public String toString() {
        return "Title - " + getTitle() +
                "\nauthor - " + getAuthor() +
                "\nduration - " + getDuration() + "\n";
    }

    @Override
    public void printCategory() {
        System.out.println(DvdCategory.CATEGORY_NAME);
    }

}
