package com.mycompany.ateliejunino.daos;

import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) {
        GenericDao genericDao = new GenericDao();

        try {
            if (genericDao.connection != null && !genericDao.connection.isClosed()) {
                System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
            } else {
                System.out.println("Não foi possível estabelecer conexão com o banco de dados.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Erro ao testar conexão com o banco de dados: " + e.getMessage());
        } finally {
            genericDao.closeConnection();
        }
    }
}
