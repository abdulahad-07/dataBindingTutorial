package com.example.databindingtutorial.model;

import java.math.BigDecimal;

public class Product {
    
    private String title;
    private String desc;
    private int image;
    private BigDecimal price;
    private BigDecimal sale_price;
    private int num_ratings;
    private BigDecimal ratings;
    
    public Product(String title, String desc, int image, BigDecimal price, BigDecimal sale_price, int num_ratings, BigDecimal ratings) {
        this.title = title;
        this.desc = desc;
        this.image = image;
        this.price = price;
        this.sale_price = sale_price;
        this.num_ratings = num_ratings;
        this.ratings = ratings;
    }
    
    public boolean hasSalePrice() {
        double salePrice = sale_price.doubleValue();
        return salePrice > 0;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public void setImage(int image) {
        this.image = image;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    public void setSale_price(BigDecimal sale_price) {
        this.sale_price = sale_price;
    }
    
    public void setNum_ratings(int num_ratings) {
        this.num_ratings = num_ratings;
    }
    
    public void setRatings(BigDecimal ratings) {
        this.ratings = ratings;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getDesc() {
        return desc;
    }
    
    public int getImage() {
        return image;
    }
    
    public BigDecimal getPrice() {
        return price;
    }
    
    public BigDecimal getSale_price() {
        return sale_price;
    }
    
    public int getNum_ratings() {
        return num_ratings;
    }
    
    public BigDecimal getRatings() {
        return ratings;
    }
}
