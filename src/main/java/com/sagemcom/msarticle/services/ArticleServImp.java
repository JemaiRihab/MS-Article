package com.sagemcom.msarticle.services;

import com.sagemcom.msarticle.dto.ArticleDto;
import com.sagemcom.msarticle.dto.StockDto;
import com.sagemcom.msarticle.entities.Article;
import com.sagemcom.msarticle.generic.ServiceGeneric;
import com.sagemcom.msarticle.repositories.ArticleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class ArticleServImp extends ServiceGeneric <Article, Long> implements ArticleServ {
    private final ArticleRepo articleRepo;
    @Autowired
    ArticleClient articleClient;
    @Override
    public Article save(Article entity) {
        entity.setCreatedAt(LocalDate.now());
        return articleRepo.save(entity);
    }

    @Override
    public ArticleDto get(Long id){
        Article article=articleRepo.findById(id).orElse(null);
        StockDto  stockDto =  articleClient.getStock(article.getIdStock());

        return mapToArticle( article , stockDto);
    }


    private ArticleDto mapToArticle(Article article , StockDto stock) {
        ArticleDto articleDto = new ArticleDto();
        articleDto.setStock(stock);
        articleDto.setName(article.getName());
        articleDto.setQte(article.getQte());
        articleDto.setCreatedAt(article.getCreatedAt());
        articleDto.setUpdatedAt(article.getUpdatedAt());
        articleDto.setId(article.getId());

        return articleDto;
    }
}
