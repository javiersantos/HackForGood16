package com.servis.servis.models;

import android.graphics.drawable.Drawable;

/**
 * Created by alejandrohall on 26/02/16.
 */
public class Microservice {

    private String title;
    private String direction;
    private Double rating;
    private Double price;
    private String category;
    private String payType;
    private String description;
    private String user;
    private Drawable image;

    public Microservice(String title, String direction, Double rating, Double price, String description, String user, Drawable image) {
        this.title = title;
        this.direction = direction;
        this.rating = rating;
        this.price = price;
        this.description = description;
        this.user = user;
        this.image = image;
    }

    public Drawable getImage() {
        return image;
    }

    public String getUser(){
        return user;
    }

    public Double getRating() {
        return rating;
    }

    public String getDirection() {
        return direction;
    }

    public Double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getPayType() {
        return payType;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Microservice)) return false;

        Microservice that = (Microservice) o;

        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (direction != null ? !direction.equals(that.direction) : that.direction != null)
            return false;
        if (rating != null ? !rating.equals(that.rating) : that.rating != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null)
            return false;
        if (payType != null ? !payType.equals(that.payType) : that.payType != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null)
            return false;
        return !(user != null ? !user.equals(that.user) : that.user != null);

    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (payType != null ? payType.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }
}
