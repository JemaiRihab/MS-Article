package com.sagemcom.msarticle.dto;

import com.sagemcom.msarticle.entities.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDto {
    private Long id;
    private String name;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private int qte;
    private StockDto stock;
}
