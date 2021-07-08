/*
 * Copyright (c) 2021. Sebastián Arancibia Arzic
 */

package cl.ucn.disc.dsm.sarancibia.newsapi;

import cl.ucn.disc.dsm.sarancibia.newsapi.model.News;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The News Controller
 *
 * @author Sebastian Arancibia
 */
@Slf4j
@RestController
public class NewsController {

    /**
     *
     * @return the lsit news in the backend
     */
    @GetMapping("/v1/news")
    public List<News> all (){

        final List<News> theNews = new ArrayList<>();

        for (int i = 0; i< 10 ;i++){
            theNews.add(News.builder()
                    .id(-1L)
                    .author("Sebastián")
                    .title("Titulo")
                    .description("descripcion")
                    .source("source")
                    .content("contenido")
                    .url("url")
                    .urlImage("urlImage")
                    .publishedAt(ZonedDateTime.now())
                    .build()
            );
        }

        return theNews;
    }

    /**
     *
     * @param id of the news to retrieve from the backend.
     * @return the news.
     */
    @GetMapping("/v1/news/{id}")
    public News one(@PathVariable final Long id){
        //TODO: Get the NEws from DB.
        return News.builder()
                .id(-1L)
                .author("Sebastián")
                .title("Titulo")
                .description("descripcion")
                .source("source")
                .content("contenido")
                .url("url")
                .urlImage("urlImage")
                .publishedAt(ZonedDateTime.now())
                .build();
    }
}
