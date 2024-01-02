package org.fasttrackit;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.fasttrackit.QuoteService.*;
import static org.fasttrackit.QuotesFromFile.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        List<Quote> quotes = new ArrayList<>();
        quotes.addAll(quotesFromFile());

        //System.out.println(quotes);
        System.out.println(getAllQuotes(quotes));
        System.out.println(getQuotesFromAuthor("Buddha", quotes));
        System.out.println(getAllAuthors(quotes));

        setFavourite(1, quotes);
        setFavourite(15, quotes);
        setFavourite(1548, quotes);
        setFavourite(5421, quotes);
        System.out.println(getFavoritesQuotes(quotes));
        QuoteService.getRandomQuote(quotes);

    }
}
