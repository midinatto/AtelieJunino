package com.mycompany.ateliejunino.daos;

import com.mycompany.ateliejunino.entidades.Cliente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao extends GenericDao{
        //salvar um Cliente
        public void salvar(Cliente cliente) {
            String sql = "INSERT INTO cliente (nomeResponsavel, nomeDancante, idade, rua, num, complemento, cidade, estado, telefone, escola) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, cliente.getnomeResponsavel());
                stmt.setString(2, cliente.getnomeDancante());
                stmt.setString(3, String.valueOf(cliente.getidade()));
                stmt.setString(4, cliente.getrua());
                stmt.setString(5, cliente.getnum());
                stmt.setString(6, cliente.getcomplemento());
                stmt.setString(7, cliente.getcidade());
                stmt.setString(8, cliente.getestado());
                stmt.setString(9, cliente.gettelefone());
                stmt.setString(10, cliente.getescola());
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // excluir pelo ID
        public void excluir(int id) throws SQLException {
            String sql = "DELETE FROM cliente WHERE id = ?";
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // editar
        public void editar(Cliente cliente) throws SQLException {
            String sql = "UPDATE especialidade SET nomeResponsavel = ?, nomeDancante = ?, idade = ?, rua = ?, num = ?, complemento = ?, cidade = ?, estado = ?, telefone = ?, escola = ? WHERE id = ?";
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, cliente.getnomeResponsavel());
                stmt.setString(2, cliente.getnomeDancante());
                stmt.setString(3, String.valueOf(cliente.getidade()));
                stmt.setString(4, cliente.getrua());
                stmt.setString(5, cliente.getnum());
                stmt.setString(6, cliente.getcomplemento());
                stmt.setString(7, cliente.getcidade());
                stmt.setString(8, cliente.getestado());
                stmt.setString(9, cliente.gettelefone());
                stmt.setString(10, cliente.getescola());
                stmt.setInt(11, cliente.getId());
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // pesquisar todos
        public List<Cliente> pesquisar() {
            List<Cliente> clientes = new ArrayList<>();
            String sql = "SELECT * FROM cliente";
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    clientes.add(new Cliente(
                            rs.getInt("id"),
                            rs.getString("nomeResponsavel"),
                            rs.getString("nomeDancante"),
                            rs.getInt("idade"),
                            rs.getString("rua"),
                            rs.getString("num"),
                            rs.getString("complemento"),
                            rs.getString("cidade"),
                            rs.getString("estado"),
                            rs.getString("telefone"),
                            rs.getString("escola")
                            ));
                }
                return clientes;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }

        // pesquisar por ID
        public Cliente pesquisarPorId(int id) {
            String sql = "SELECT * FROM cliente WHERE id = ?";
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return new Cliente(
                            rs.getInt("id"),
                            rs.getString("nomeResponsavel"),
                            rs.getString("nomeDancante"),
                            rs.getInt("idade"),
                            rs.getString("rua"),
                            rs.getString("num"),
                            rs.getString("complemento"),
                            rs.getString("cidade"),
                            rs.getString("estado"),
                            rs.getString("telefone"),
                            rs.getString("escola")
                    );
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
