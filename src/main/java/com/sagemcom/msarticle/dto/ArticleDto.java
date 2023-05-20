package com.sagemcom.msarticle.dto;

import com.sagemcom.entities.BaseEntity;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleDto extends BaseEntity {
    private String name;
    private int qte;
    private StockDto stock;
}
