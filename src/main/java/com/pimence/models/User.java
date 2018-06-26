package com.pimence.models;

public class User {

    private String usrname;
    private String password;
    private int crendtials;

    public User(int crendtials, String name,String password) {
        this.usrname = name;
        this.password = password;
        this.crendtials = getCrendtials();
    }

    public String getUsrname() {
        return usrname;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCrendtials() {
        return crendtials;
    }

    public void setCrendtials(int crendtials) {
        this.crendtials = crendtials;
    }
}
