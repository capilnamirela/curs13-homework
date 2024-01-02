package org.fasttrackit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;



public class QuotesFromFile {

    static private List<Quote> quotesList = new ArrayList<>();

    public static List<Quote> quotesFromFile() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("files", "quotes.txt"));
        int id = 0;

        while (scanner.hasNext()) {
            id++;
            String[] line = scanner.nextLine().split(Pattern.quote("~"));
            quotesList.add(new Quote(id, line[0], line[1], false));
        }
        return quotesList;

    }
}
