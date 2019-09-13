package utilities;

import java.sql.*;
import java.util.ArrayList;

public class DBLookup {

    private Connection connect() {

        try {
    
            String server = "jdbc:mysql://127.0.0.1:3306/swingy";
            String user = "root";
            String password = "password";
            Class.forName("com.mysql.jdbc.Driver");
    
            return DriverManager.getConnection(server, user, password);


        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        
    }

    public ArrayList<String> getHeroNames() {
        
        ArrayList<String> heroNames = new ArrayList<String>();

        try {

            Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT name FROM HERO");

            stmt.close();
            conn.close();

            while (resultSet.next()) {
                heroNames.add(resultSet.getString("name"));
            }
            return heroNames;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public ResultSet getHero(int id) {
        
        try {

            Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM HERO WHERE Id = " + id);
            
            stmt.close();
            conn.close();

            return resultSet;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void updateHero(int id, String name, int attack, int defense, int hitPoints, int level, int xp) {
        
        try {
            Connection conn = connect();

            String sql = 
                "UPDATE HERO " +
                "SET (?, ?, ?, ?, ?, ?) " +
                "WHERE Id = ?";

            PreparedStatement preparedStmt = conn.prepareStatement(sql);

            preparedStmt.setString(1, name);
            preparedStmt.setInt(2, attack);
            preparedStmt.setInt(3, defense);
            preparedStmt.setInt(4, hitPoints);
            preparedStmt.setInt(5, level);
            preparedStmt.setInt(6, xp);
            preparedStmt.setInt(7, id);

            preparedStmt.executeUpdate(sql);

            preparedStmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveHero(String name, int attack, int defense, int hitPoints) {
         
        try {
            Connection conn = connect();

            String sql = 
                "INSERT INTO HERO " +
                "VALUES (?, ?, ?, ?, ?, ?) ";

            PreparedStatement preparedStmt = conn.prepareStatement(sql);

            preparedStmt.setString(1, name);
            preparedStmt.setInt(2, attack);
            preparedStmt.setInt(3, defense);
            preparedStmt.setInt(4, hitPoints);
            preparedStmt.setInt(5, 1);
            preparedStmt.setInt(6, 1000);

            preparedStmt.executeUpdate(sql);

            preparedStmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}