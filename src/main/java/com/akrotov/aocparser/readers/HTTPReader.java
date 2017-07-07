package com.akrotov.aocparser.readers;

import com.akrotov.aocparser.models.Ae;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import java.io.IOException;
import java.util.Map;

/**
 * Created by me on 07.07.17.
 */


public class HTTPReader implements ItemReader<Ae> {

    Map<String, String> cookies;
    @Override
    public Ae read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {


        return null;
    }


    private void authorize() throws IOException {

        String token = "";
        Connection.Response response = Jsoup
                .connect("https://passport.ageofclones.com/index.php/")
                .method(Connection.Method.POST)
                .data("signin[login]", "Artem.R")
                .data("signin[password]", "122311")
                .execute();

        cookies = response.cookies();
    }


    public static void main(String[] args) throws Exception {
        new HTTPReader().authorize();
    }
}
