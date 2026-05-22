package com.oraclejava.jdbc;

import java.sql.*;

public class Test1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url =  "jdbc:mysql://localhost:3306/books?useSSL=false&serverTimezone=GMT%2B9";
            String user = "root";
            String password = "oraclejava";
            Connection conn = DriverManager.getConnection(url, user, password);

            PreparedStatement pstmt = conn.prepareStatement("select * from books");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String isbn = rs.getString("isbn");
                String title = rs.getString("title");
                String author = rs.getString("author");
                Date publishDate = rs.getDate("pub_date");
                System.out.println(isbn);
                System.out.println(title);
                System.out.println(author);
                System.out.println(publishDate);
                System.out.println("=================");
            }

            rs.close();
            pstmt.close();
            conn.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
