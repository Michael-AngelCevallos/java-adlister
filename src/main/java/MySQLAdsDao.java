import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class MySQLAdsDao implements Ads  {

// in order to communicate with database you need to establish a connection
    private Connection connection;

// passes in Config to pull out values that are  necessary for establishing connection
    public MySQLAdsDao(Config config)  {

        try {
            // register driver
            DriverManager.registerDriver(new Driver()); // if you have red squigglies under driver you need to update dependency in pom to 8.0.27 and wrap in a try catch
            this.connection = DriverManager.getConnection(
                    config.getURL(),
                    config.getUser(),
                    config.getPassword()

            ); // DriverManager finds the appropriate driver/ getconnection establishes that connection


        } catch ( SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    // retrieves ads from database and returns as a list
    @Override
    public List<Ad> all() {
        //returns list of Ads
        List<Ad> ads = new ArrayList<>(); // this is empty arraylist of ads
        String query = "SELECT * FROM ads"; // select query gets all the ads
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            // iterate over Result set with while loop for each record
            while(rs.next()){

                //stores each value in an Ad instance
                Ad ad = new Ad(
                  // pass in these values everytime
                  rs.getLong("id"),
                   rs.getLong("user_id"),
                   rs.getString("title"),
                   rs.getString("description")
                );
                // this adds the ad to our collection
                ads.add(ad);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // returns collection of ads
        return ads;
    }


    // this method inserts ad into the database
    @Override
    public Long insert(Ad ad) throws SQLException {
        Long lastInsertedId = 0L;
        try {
            Statement statement = connection.createStatement();
            String insertQuery = String.format(" INSERT INTO ads(user_id, title, description) VALUES (%d, '%s', '%s' ",
                    ad.getUserId(), ad.getTitle(), ad.getDescription());
            statement.executeUpdate(insertQuery, statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();
            lastInsertedId = rs.getLong(1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return lastInsertedId;
    }


//    public static void main(String[] args) throws SQLException {



        // this makes sure dao works
//MySQLAdsDao mySQLAdsDao = new MySQLAdsDao(new Config());
//
//        Ad adToInsert = new Ad(
//              1,
//              "Test Insert Ad",
//              "Test Insert Ad Description"
//
//        );
//
//
//
//        System.out.println(mySQLAdsDao.insert(adToInsert));

    }
}
