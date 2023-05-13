package com.sagemcom.msarticle.contollers;

import com.sagemcom.msarticle.dto.ArticleDto;
import com.sagemcom.msarticle.entities.Article;
import com.sagemcom.msarticle.generic.RestControllerGeneric;
import com.sagemcom.msarticle.mappers.ArticleMapper;
import com.sagemcom.msarticle.services.ArticleServ;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("article")
public class ArticleCont extends RestControllerGeneric<Article , Long>{
    private final ArticleServ articleServ;
    @GetMapping("articleStockClient/{id}")
    public ArticleDto findArticleWithStock(@PathVariable("id") Long id) {
        return ArticleMapper.mapToDto();
    }
}
