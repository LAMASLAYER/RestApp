package com.restapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int user_id;
    private Date creation_date;
    private String username;
    private String password;
    private int credentials;

    public Users(int user_id, Date creation_date, int credentials, String name,String password) {
        super();
        this.username = name;
        this.password = password;
        this.credentials = credentials;
        this.user_id = user_id;
        this.creation_date = creation_date;
    }

    public Users(){
        super();
    }

    public String getUsrname() {
        return username;
    }

    public void setUsrname(String usrname) {
        this.username = usrname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCredendtials() {
        return credentials;
    }

    public void setCrendtials(int credentials) {
        this.credentials = credentials;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

}
