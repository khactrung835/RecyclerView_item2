package com.example.recyclerview_item2;

public class Model {

    private String Name;
    private String Description;
    private int Image;

    public Model(String name, String description, int image) {
        Name = name;
        Description = description;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public int getImage() {
        return Image;
    }
}
