package de.thb.pricely.products.entities;

public enum Category {

    cafe("cafe", "img/icons/cafe.png"),
    muesli("muesli","img/icons/muesli.png"),
    noodle("noodle","img/icons/noodle.png");

    public String name;
    public String image;

    Category(String name, String image){
        this.name = name;
        this.image = image;
    }

    public static Category getCategory(String name){
        if(cafe.name.equals(name))
            return cafe;
        else if(muesli.name.equals(name))
            return muesli;
        else if(noodle.name.equals(name))
            return noodle;
        else
            return cafe;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
