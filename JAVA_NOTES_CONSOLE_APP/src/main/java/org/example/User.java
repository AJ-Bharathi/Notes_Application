package org.example;

public class User {
    private String email,password, userName;
    private int userID;
    public User(int userID,String email, String password,String userName)
    {
        this.userID=userID;
        this.email=email;
        this.password=password;
        this.userName=userName;
    }
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }
    public String getEmail(){
        return email;
    }
    public int getUserID(){
        return userID;
    }
}
