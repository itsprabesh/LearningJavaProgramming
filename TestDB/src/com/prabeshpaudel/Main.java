package com.prabeshpaudel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:/Users/prabesh/Desktop/LearningJavaProgramming/TestDB/test.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE music (name TEXT, phone INTEGER, email TEXT)");

            statement.close();
            conn.close();

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

/*        try(// create a connection to the database
            Connection conn = DriverManager.getConnection(url);
            Statement statement = conn.createStatement()) {

            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }*/
    }
}
