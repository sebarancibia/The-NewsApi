/*
 * Copyright (c) 2021. Sebastián Arancibia-Arzic
 */

package cl.ucn.disc.dsm.sarancibia.newsapi.model;

import lombok.Builder;
import lombok.Getter;

import java.time.ZonedDateTime;

/**
 * The class.
 *
 * @author Sebastian Arancibia
 */
@Builder
public final class News {

    /**
     * Unique id.
     */
    @Getter
    private final Long id;

    /**
     *  The title.
     *  Restrictions:
     *  - not nulls.
     *  - size > 2
     */
    @Getter
    private final String title;

    /**
     * The source.
     */
    @Getter
    private final String source;

    /**
     * The author.
     */
    @Getter
    private final String author;

    /**
     * The Url.
     */
    @Getter
    private final String url;

    /**
     * The Url Image.
     */
    @Getter
    private final String urlImage;

    /**
     * The Description.
     */
    @Getter
    private final String description;

    /**
     * The Content.
     */
    @Getter
    private final String content;

    /**
     * The Date of Publish
     */
    @Getter
    private final ZonedDateTime publishedAt;

    /**
     * The Constructor.
     * @param id
     * @param title
     * @param source
     * @param author
     * @param url
     * @param urlImage
     * @param description
     * @param content
     * @param publishedAt
     */
    public News(
            final Long id,
            final String title,
            final String source,
            final String author,
            final String url,
            final String urlImage,
            final String description,
            final String content,
            final ZonedDateTime publishedAt) {
        // FIXME: add the hash (title + source + author)


        //Title replace
        this.title= (title != null && title.length()>0) ? title : "No Title";

        // Source validation
        if (source == null){
            throw new IllegalArgumentException("Source was null");
        }
        if (source.length() < 2 ){
            throw new IllegalArgumentException("Source size < 2 [" + source + "]");
        }
        this.source =source;

        //Author
        this.author = (author != null && author.length() > 0) ? author : "No Author";

        this.id = id;

        this.url = url;
        this.urlImage = urlImage;
        this.description = description;
        this.content = content;

        //PublishedAt validation
        if (publishedAt == null){
            throw new IllegalArgumentException("The PublishedAt needed");
        }
        this.publishedAt = publishedAt;
    }

}
