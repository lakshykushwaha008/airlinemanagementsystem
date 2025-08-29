package airlinemanagementsystem;

import java.sql.*;

public class Conn { // ← renamed from Connection to Conn
    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagementsystem", "root", "lakshya_editt");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}