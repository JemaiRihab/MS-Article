package com.sagemcom.msarticle.mappers;

import com.sagemcom.msarticle.dto.ArticleDto;
import com.sagemcom.msarticle.entities.Article;
import com.sagemcom.msarticle.repositories.ArticleRepo;
import com.sagemcom.msarticle.services.ArticleClient;


public class ArticleMapper {
    private static ArticleRepo articleRepo;
    static ArticleClient articleClient;
    public static ArticleDto mapToDto(){
        ArticleDto articleDto = ArticleDto.builder().build();
        articleDto.setName(articleDto.getName());
        articleDto.setQte(articleDto.getQte());
        articleDto.setCreatedAt(articleDto.getCreatedAt());
        articleDto.setUpdatedAt(articleDto.getUpdatedAt());
        articleDto.setId(articleDto.getId());
        return articleDto;
    }
    private static ArticleDto mapToArticle(Article article) {
        ArticleDto articleDto = ArticleDto.builder().build();
        articleDto.setId(article.getId());
        articleDto.setCreatedAt(article.getCreatedAt());
        articleDto.setUpdatedAt(article.getUpdatedAt());
        return articleDto;
    }
}
