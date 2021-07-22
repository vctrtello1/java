package com.victortello.web.versioning;

public class PersonV1 {
    
    private String name;

    public PersonV1(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonV1() {
    }
}
