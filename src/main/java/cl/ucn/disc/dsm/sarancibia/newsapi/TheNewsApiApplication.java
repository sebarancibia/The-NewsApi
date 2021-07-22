/*
 * Copyright (c) 2021. Sebastián Arancibia Arzic
 */

package cl.ucn.disc.dsm.sarancibia.newsapi;

import cl.ucn.disc.dsm.sarancibia.newsapi.model.News;
import cl.ucn.disc.dsm.sarancibia.newsapi.model.Source;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.ZonedDateTime;

/**
 * The NewsAPI Application.
 *
 * @author Sebastian Arancibia
 */
@SpringBootApplication
public class TheNewsApiApplication {

    /**
     * The News Repo to initialize the database
     */
    @Autowired
    private NewsRepository newsRepository;

    /**
     * The Starting point.
     *
     * @param args to use .
     */
    public static void main(final String[] args) {
        SpringApplication.run(TheNewsApiApplication.class, args);
    }

    /**
     * Initialize the database
     *
     * @return the {@link InitializingBean}
     */
    @Bean
    protected InitializingBean initializingDatabase() {
        return () -> {
            newsRepository.save(News.builder()
                    .title("titulo noticia")
                    .description("Descripcion noticia")
                    .content("Contenido de la noticia")
                    .author("autor noticia")
                    .publishedAt(ZonedDateTime.now())
                    .source(new Source("Propio"))
                    .url("Url de la noticia")
                    .urlImage("https://marvel-b1-cdn.bc0a.com/f00000000104050/www.monsterenergy.com/media/uploads_image/2020/12/02/auto/800/9e2a664d1cff74f6d14d554352395810.png?mod=v1_2d0b5ce4d957fe51acf6bd5da0d9a2a5")
                    .build()
            );
        };
    }

}
