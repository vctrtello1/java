package com.victortello.web.versioning;

public class PersonV2 {

    private Name name;

    public PersonV2(Name name) {
        this.setName(name);
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public PersonV2() {
    }
    
}
