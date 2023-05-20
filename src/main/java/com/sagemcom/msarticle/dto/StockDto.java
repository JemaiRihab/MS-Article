package com.sagemcom.msarticle.dto;

import com.sagemcom.entities.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StockDto extends BaseEntity {
    private String zone;
}
