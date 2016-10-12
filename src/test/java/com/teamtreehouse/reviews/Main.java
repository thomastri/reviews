package com.teamtreehouse.reviews;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;

/**
 * Created by thomasle on 10/11/16.
 */

public class Main {
    public static void main(String[] args) {
        try {
            CSVPrinter printer = new CSVPrinter(System.out, CSVFormat.EXCEL);
            printer.printRecord("Thomas", "Le", 5, "Liked");
            printer.printRecord("Thomas", "Lee", 4, "Aight");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
