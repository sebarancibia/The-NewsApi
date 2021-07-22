/*
 * Copyright (c) 2021. Sebastián Arancibia Arzic
 */

package cl.ucn.disc.dsm.sarancibia.newsapi;

import cl.ucn.disc.dsm.sarancibia.newsapi.model.News;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * The response of our API.
 *
 * @author Sebastian Arancibia
 */
@Builder
@Getter
public class NewsResponse {
    /**
     * The Status
     */
    private final String status;

    /**
     * The result size
     */
    private final int totalResult;

    /**
     * The News (Articles)
     */
    private final List<News> articles;
}
