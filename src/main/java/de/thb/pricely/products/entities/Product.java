package de.thb.pricely.products.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Long price;

    @Column
    private String name;

    @Column
    private String imagePath;

    @Column(length=10485760)
    private String description;

    @Column
    private Category category;

    @Column
    private String shop;

    @Column(length=10485760)
    private String linkShop;

    public Product() {
    }

    public Product(Long price, String name, String imagePath, String description, Category category, String shop, String linkShop) {
        this.price = price;
        this.name = name;
        this.imagePath = imagePath;
        this.description = description;
        this.category = category;
        this.shop = shop;
        this.linkShop = linkShop;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getLinkShop() {
        return linkShop;
    }

    public void setLinkShop(String linkShop) {
        this.linkShop = linkShop;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", shop='" + shop + '\'' +
                ", linkShop='" + linkShop + '\'' +
                '}';
    }
}
