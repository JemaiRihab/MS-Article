package com.sagemcom.msarticle.services;

import com.sagemcom.msarticle.dto.StockDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "articleStock", url = "http://localhost:9090/")
public interface ArticleClient {
    @RequestMapping(method = RequestMethod.GET, value = "/stock/{id}")
    StockDto getStock(@PathVariable("id") Long id);

    /*@RequestMapping(method = RequestMethod.POST, value = "/stock/{storeId}", consumes = "application/json")
    Store update(@PathVariable("storeId") Long storeId, Store store);*/
}
