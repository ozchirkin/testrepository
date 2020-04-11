package com.store.domain;

public class Product {
    private int product_id;
    private String productName;
    private String price;
    private String description;
    private boolean availability;
    private String manufactured;
    private Category category_of_pr;
/** добавленны гетеры и сетеры*/

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getManufactured() {
        return manufactured;
    }

    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;
    }

    public Category getCategory_of_pr() {
        return category_of_pr;
    }

    public void setCategory_of_pr(Category category_of_pr) {
        this.category_of_pr = category_of_pr;
    }
}