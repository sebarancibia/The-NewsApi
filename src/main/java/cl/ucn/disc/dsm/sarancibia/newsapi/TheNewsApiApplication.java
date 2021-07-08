/*
 * Copyright (c) 2021. Sebastián Arancibia Arzic
 */

package cl.ucn.disc.dsm.sarancibia.newsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The NewsAPI Application.
 *
 * @author Sebastian Arancibia
 */
@SpringBootApplication
public class TheNewsApiApplication {

    /**
     * The Starting point.
     *
     * @param args to use .
     */
    public static void main(final String[] args) {
        SpringApplication.run(TheNewsApiApplication.class, args);
    }

}
