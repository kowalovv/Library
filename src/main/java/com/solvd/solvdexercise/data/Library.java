package com.solvd.solvdexercise.data;

import com.solvd.solvdexercise.categories.*;

import java.util.Objects;

public abstract class Library implements CategoryName, CategoryA, CategoryB, CategoryC, CategoryD {
    private String author;
    private String title;

    public Library(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(author, library.author) && Objects.equals(title, library.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }

    @Override
    public String toString() {
        return "logic.Library{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
    static {
        System.out.println("Static block created");
        System.out.println();
    }
}