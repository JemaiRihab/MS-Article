package com.sagemcom.msarticle.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StockDto {
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private String zone;
}
