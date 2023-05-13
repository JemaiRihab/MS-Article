package com.sagemcom.msarticle.dto;

import com.sagemcom.msarticle.entities.BaseEntity;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleDto {
    private Long id;
    private String name;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private int qte;
    private StockDto stock;
}
