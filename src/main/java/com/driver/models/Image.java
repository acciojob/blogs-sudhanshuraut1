package com.driver.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name =  "Image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

   private String description;

   private String dimentions;

    public Image() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDimentions() {
        return dimentions;
    }

    public void setDimentions(String dimentions) {
        this.dimentions = dimentions;
    }

    @ManyToOne
    @JoinColumn
    private Blog blog;

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}
