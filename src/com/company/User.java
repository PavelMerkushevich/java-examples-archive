package com.company;

public class User {
    public String username;
    public String name;
    public String lastname;

    User(String username, String name, String lastname){
        constructor(username, name, lastname);
    }
    public void constructor(String username, String name, String lastname){
        this.username = username;
        this.name = name;
        this.lastname = lastname;
    }
    public String getUserInfo(){
        return "Логин: " + this.username + "\n" + "Имя: " + this.name + "\n" + "Фамилия: " + this.lastname;
    }
}
