package com.mycompany.ateliejunino.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDao {
        private static final String url = "jdbc:mysql://localhost:3306/ateliejunino";
        private static final String user = "root";
        private static final String password = "050905";

        protected static Connection connection;

        public GenericDao() {
            try {
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao conectar com o banco de dados", e);
            }
        }

        public void closeConnection() {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

