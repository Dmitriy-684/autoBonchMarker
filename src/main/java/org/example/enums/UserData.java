package org.example.enums;

public enum UserData {

    USERNAME_DMITRIY(""),
    PASSWORD_DMITRIY(""),
    USERNAME_MAKSIM(""),
    PASSWORD_MAKSIM(""),
    USERNAME_DAVID(""),
    PASSWORD_DAVID("");
    private String data;

    UserData(String data){
        this.data = data;
    }
    public String getData(){
        return data;
    }
}
