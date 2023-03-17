DROP DATABASE IF EXISTS adlister_db;

CREATE DATABASE adlister_db;

USE adlister_db;

#THe order in which you create the tables DOES MATTER!!!
#Create users table first because their is no dependency with the ads table(meaning ads needs something from users but NOT vice versa)

CREATE TABLE users(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,  #UNSIGNED key word means you CANNOT have a negative value(will bring back an error if value is negative;
    username VARCHAR(100) NOT NULL, # the  varchar needs to be high because once hashed out can far exceed users password char amount
    email VARCHAR(255) NOT NULL,
    password VARCHAR(100) NOT NULL,
    PRIMARY KEY(id) # Primary key uniquely defines a record, id is the primary key here/ primary keys can NOT be NULL value
);

CREATE TABLE ads (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    title VARCHAR(255),
    description TEXT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(id), # FOREIGN KEY ALLOWS for cross reference with variable from another table(in this case id from users table)
    PRIMARY KEY (id)

);