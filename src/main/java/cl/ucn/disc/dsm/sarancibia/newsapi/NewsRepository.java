/*
 * Copyright (c) 2021. Sebastián Arancibia Arzic
 */

package cl.ucn.disc.dsm.sarancibia.newsapi;

import cl.ucn.disc.dsm.sarancibia.newsapi.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The News Repository
 * @author Sebastian Arancibia
 */
@Repository
public interface NewsRepository extends JpaRepository<News, Long> {

}
