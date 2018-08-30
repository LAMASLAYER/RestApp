package com.restapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Assets {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String url;

    public Assets(String url, int id) {
        super();
        this.id = id;
        this.url = url;
    }

    public Assets(){
        super();
    }


    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
