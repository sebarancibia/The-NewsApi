/*
 * Copyright (c) 2021. Sebastián Arancibia-Arzic
 */

package cl.ucn.disc.dsm.sarancibia.newsapi.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.ZonedDateTime;

/**
 * The News Model.
 *
 * @author Sebastian Arancibia
 */
@Builder // The Builder pattern
@Getter // All the fields has get*
@NoArgsConstructor // Add empty constructor
@Entity // The JPA
public final class News {

    /**
     * Unique id.
     */
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    /**
     *  The title.
     *  Restrictions:
     *  - not nulls.
     *  - size > 2
     */
    private String title;

    /**
     * The source.
     */
    private String source;

    /**
     * The author.
     */
    private String author;

    /**
     * The Url.
     */
    private String url;

    /**
     * The Url Image.
     */
    private String urlImage;

    /**
     * The Description.
     */
    private String description;

    /**
     * The Content.
     */
    private String content;

    /**
     * The Date of Publish
     */
    private ZonedDateTime publishedAt;

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
