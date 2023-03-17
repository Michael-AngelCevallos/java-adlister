# seeder file is used to hold the actual data inputed into the tables

USE adlister_db;

INSERT INTO  users(username, email, password) VALUES
('mikeC', 'michaelcevallos94@yahoo.com' , 'abc123');

INSERT INTO ads(user_id, title, description) VALUES
 (1, 'Test Ads 1', 'This is the Description of test ad 1'),
 (1, 'Test Ads 2', 'This is the Description of test ad 2'),
 (1, 'Test Ads 3', 'This is the Description of test ad 3'),
 (1, 'Test Ads 4', 'This is the Description of test ad 4'),
 (1, 'Test Ads 5', 'This is the Description of test ad 5');