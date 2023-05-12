package com.sagemcom.msarticle.services;

import com.sagemcom.msarticle.dto.ArticleDto;
import com.sagemcom.msarticle.entities.Article;
import com.sagemcom.msarticle.generic.IServiceGeneric;

public interface ArticleServ extends IServiceGeneric<Article,Long> {
    public ArticleDto get(Long id);
}
