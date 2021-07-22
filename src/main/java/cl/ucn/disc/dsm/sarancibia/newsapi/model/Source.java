/*
 * Copyright (c) 2021. Sebastián Arancibia Arzic
 */

package cl.ucn.disc.dsm.sarancibia.newsapi.model;

import com.github.slugify.Slugify;
import lombok.*;

import javax.persistence.Embeddable;

/**
 * The Source
 *
 * @author Sebastian Arancibia
 */

@Getter
@AllArgsConstructor
@NoArgsConstructor // Add empty constructor
@Embeddable
public class Source {

    /**
     * The Slugify
     */
    private static final Slugify SLUGIFY = new Slugify();

    /**
     * The name of the source.
     */
    private String name;

    /**
     *
     * @return the id of the name.
     */
    public String getId(){
        return SLUGIFY.slugify(this.name);
    }
}
