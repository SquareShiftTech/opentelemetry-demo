package com.opentelemetry.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PriceDetailsImpl implements PriceDetails{
    @Override
    public void calculatePrice() {
        getPriceForEachProduct();
        System.out.println("Calculating price");
    }

    public void getPriceForEachProduct(){
        System.out.println("product1 = 20");
    }
}
