/*
 * Copyright (c) 2021. Sebastián Arancibia Arzic
 */

package cl.ucn.disc.dsm.sarancibia.newsapi.exceptions;

/**
 * News Not Found.: 404 !!
 * @author Sebastian Arancibia
 */
public class NewsNotFoundException extends RuntimeException {

    /**
     * The Constructor
     *
     * @param message to use.
     */
    public NewsNotFoundException(String message) {
        super(message);
    }
}
