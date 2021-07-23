package com.victortello.web.user;

import javax.persistence.Entity;

@Entity
public class Post {

    private Integer id;
    private String description;
    
    public Post(Integer id, String description) {
        this.setId(id);
        this.setDescription(description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Post() {
    }

}
