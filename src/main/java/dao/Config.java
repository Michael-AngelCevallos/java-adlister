package dao;

public class Config {


    public String getURL(){
       return "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
    }
    public String getUser(){
        return "main";
    }

    public String getPassword(){
        return "codeup";
    }
}
