package com.example.vikram.travellersguide;

public class userData
{
    private String fname;
    private String lname;
    private String username;
    private String contact_no;
    private String email;



    public String getFname() {
        return fname;
    }

    public userData(String fname, String lname, String username, String contact_no, String email) {
        this.fname = fname;
        this.lname = lname;
        this.username = username;
        this.contact_no = contact_no;
        this.email = email;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
