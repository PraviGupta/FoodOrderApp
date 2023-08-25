package com.example.project1301;

public class UserData {
    String uuid;
    String name;
    String phone;
    String mail;
    String pass;
    String address;

    public UserData() {
    }

    public UserData(String uuid, String name, String phone, String mail, String pass, String address) {
        this.uuid = uuid;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.pass = pass;
        this.address = address;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
