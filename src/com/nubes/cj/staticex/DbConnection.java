package com.nubes.cj.staticex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
		static Connection con = null;
		static{
			try {
				con = DriverManager.getConnection("");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
