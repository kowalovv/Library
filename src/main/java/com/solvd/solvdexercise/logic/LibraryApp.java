package com.solvd.solvdexercise.logic;

import com.solvd.solvdexercise.categories.CategoryName;
import com.solvd.solvdexercise.collections.CustomLinkedList;
import com.solvd.solvdexercise.data.Library;
import com.solvd.solvdexercise.exceptions.NoElementFoundException;
import com.solvd.solvdexercise.exceptions.NoMoreSpaceException;
import com.solvd.solvdexercise.data.Book;
import com.solvd.solvdexercise.data.Dvd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;


public class LibraryApp {

    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static Logger LOGGER = LogManager.getLogger(LibraryApp.class);

    public static void main(String[] args) throws NoMoreSpaceException {


        Library dvd = new Dvd("John Nowak", "Superman", 125);
        Library dvd2 = new Dvd("Nowak", "Superman", 125);
        Library book = new Book("Jan Kowalski", "Hulk", 347);
        Library book2 = new Book("John Wick", "Hulk", 347);
        Library book3 = new Book("Ton Gates", "Batman", 123);
        System.out.println(dvd.equals(dvd2));
        System.out.println(dvd.equals(book));
        System.out.println(book.equals(book3));
        System.out.println();
        System.out.println(dvd);
        System.out.println();
        System.out.println(book2);
        System.out.println();
        printLibraryName();
        dvd.printCategory();
        book3.printCategory();
        System.out.println();
        LOGGER.info("Working!!");

// try catch
        try {
            LibraryMethods.printAllClients();
        } catch (NoElementFoundException e) {
            System.err.println(e.getMessage());
        }

// throws exception in main method to ignore exception
        LibraryMethods.checkSpaceInDatabase();


// try with resources in method body
        LibraryMethods.addToDatabase("Spiderman");


// LinkedList with generic

        CustomLinkedList<Library> custom = new CustomLinkedList<>();
        custom.add(book);
        custom.add(book2);
        System.out.println("\nPrinting CustomLinkedList :\n");
        custom.display();


// ArrayList
        List<Library> list = new ArrayList<>();
        list.add(dvd2);
        list.add(book2);
        System.out.println("\nPrinting ArrayList :\n\n" + list);

// HashSet
        HashSet<Library> uniqueProducts = new HashSet<>();
        uniqueProducts.add(book);
        uniqueProducts.add(book);
        uniqueProducts.add(book);
        uniqueProducts.add(book2);
        uniqueProducts.add(book3);
        int size = uniqueProducts.size();
        System.out.println("\nPrinting size of HashSet " + size + "\n");

// TreeMap
        Map<Integer, Library> products = new TreeMap<>();
        products.put(1, book);
        products.put(3, dvd);
        products.put(2, book2);
        System.out.println("Printing TreeMap\n");
        for (Map.Entry<Integer, Library> integerLibraryEntry : products.entrySet()) {
            System.out.println(integerLibraryEntry);
        }

// Queue
        Queue<Library> queue = new ArrayBlockingQueue<>(3);
        queue.add(book);
        queue.add(book2);
        queue.add(book3);
        System.out.println("Printing products on queue");
        System.out.println(queue);
        queue.poll();
        System.out.println("Printing left products");
        System.out.println(queue);




    }

    private static void printLibraryName() {
        System.out.println(CategoryName.NAME);
    }
}