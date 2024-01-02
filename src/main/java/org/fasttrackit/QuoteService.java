package org.fasttrackit;

import java.util.*;

public class QuoteService {

    public static List<String> getAllQuotes(List<Quote> quoteList) {
        List<String> allQuotes = new ArrayList<>();
        for (Quote quote : quoteList) {
            allQuotes.add(quote.getQuote());
        }
        return allQuotes;
    }

    public static Set<String> getAllAuthors(List<Quote> quoteList) {
        Set<String> allAuthores = new HashSet<>();
        for (Quote quote : quoteList) {
            allAuthores.add(quote.getAuthor());
        }
        return allAuthores;
    }

    public static List<Quote> getQuotesFromAuthor(String author, List<Quote> quoteList) {
        List<Quote> quotesFromAuthor = new ArrayList<>();
        boolean verify = false;
        for (Quote quote : quoteList) {
            if (quote.getAuthor().equals(author)) {
                quotesFromAuthor.add(quote);
                verify = true;
            }
        }
        if (verify) {
            return quotesFromAuthor;
        } else {
            throw new NoAuthorWithThatNameException("This author doesn't exist in our list");
        }
    }


    public static void setFavourite(int id, List<Quote> quoteList) {
        boolean verify = false;
        for (Quote quote : quoteList) {
            if (quote.getId() == id) {
                quote.setFavourite(true);
                verify = true;
            }
        }
        if (!verify) throw new NoIdInOurList("This ID : " + id + " is not in our list, you have to choose from 1 to " + quoteList.size());
    }

    public static List<Quote> getFavoritesQuotes(List<Quote> quoteList) {
        List<Quote> favQuote = new ArrayList<>();
        for (Quote quote : quoteList) {
            if (quote.isFavourite()) {
                favQuote.add(quote);
            }
        }
        return favQuote;
    }

    public static void getRandomQuote(List<Quote> quoteList) {
        Random random = new Random();
        int nrRandom = random.nextInt(1, quoteList.size() + 1);
        for (Quote quote : quoteList) {
            if (quote.getId() == nrRandom) {
                System.out.println(quote);
            }
        }


    }


}
