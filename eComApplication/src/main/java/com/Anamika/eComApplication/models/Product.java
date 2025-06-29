package com.Anamika.eComApplication.models;


import lombok.Data;

@Data
public class Product {
    private Long id;
    private String title ;
    private String description;
    private double price;
    private String imageUrl;


}
