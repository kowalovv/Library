package com.solvd.solvdexercise.logic;

import com.solvd.solvdexercise.exceptions.NoElementFoundException;
import com.solvd.solvdexercise.exceptions.NoMoreSpaceException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

abstract class LibraryMethods {

    static int space = 10;
    final static String FILE_NAME = "Database.txt";

    static void printAllClients() throws NoElementFoundException {
        throw new NoElementFoundException("No clients in database!!");
    }

    static void checkSpaceInDatabase() throws NoMoreSpaceException {
        if (space == 0)
            throw new NoMoreSpaceException("No more space in database");
        else
            System.out.println(space);
    }

    static void addToDatabase(String name) {
        try (var fw = new FileWriter(FILE_NAME, true);
             var bw = new BufferedWriter(fw)) {
            bw.write(name);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
