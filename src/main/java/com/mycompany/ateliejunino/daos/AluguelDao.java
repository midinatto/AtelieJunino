package com.mycompany.ateliejunino.daos;

import com.mycompany.ateliejunino.entidades.Aluguel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AluguelDao extends GenericDao {

    // Salvar um Aluguel
    public void salvar(Aluguel aluguel) throws SQLException {
        String sql = "INSERT INTO aluguel (observacao, acompanhamentos, Atendente, escola, DataQuadrilha, DataReserva, DataDevolucao, numeroTraje, valor, adiantamento, restante) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, aluguel.getObservacao());
            stmt.setString(2, aluguel.getAcompanhamentos());
            stmt.setString(3, aluguel.getAtendente());
            stmt.setString(4, aluguel.getEscola());
            stmt.setDate(5, Date.valueOf(aluguel.getDataQuadrilha()));
            stmt.setDate(6, Date.valueOf(aluguel.getDataReserva()));
            stmt.setDate(7, Date.valueOf(aluguel.getDataDevolucao()));
            stmt.setInt(8, aluguel.getNumeroTraje());
            stmt.setDouble(9, aluguel.getValor());
            stmt.setDouble(10, aluguel.getAdiantamento());
            stmt.setDouble(11, aluguel.getRestante());
            stmt.executeUpdate();
        }
    }

    // Listar todos os atendentes (pra ComboBox)
    public List<String> listarAtendentes() {
        List<String> atendentes = new ArrayList<>();
        String sql = "SELECT nome FROM atendente ORDER BY nome"; // Assume que a tabela se chama 'atendente' e tem coluna 'nome'

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                atendentes.add(rs.getString("nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return atendentes;
    }

    // Excluir
    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM aluguel WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    // Editar
    public void editar(Aluguel aluguel) throws SQLException {
        String sql = "UPDATE aluguel SET observacao = ?, acompanhamentos = ?, Atendente = ?, escola = ?, DataQuadrilha = ?, DataReserva = ?, DataDevolucao = ?, numeroTraje = ?, valor = ?, adiantamento = ?, restante = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, aluguel.getObservacao());
            stmt.setString(2, aluguel.getAcompanhamentos());
            stmt.setString(3, aluguel.getAtendente());
            stmt.setString(4, aluguel.getEscola());
            stmt.setDate(5, Date.valueOf(aluguel.getDataQuadrilha()));
            stmt.setDate(6, Date.valueOf(aluguel.getDataReserva()));
            stmt.setDate(7, Date.valueOf(aluguel.getDataDevolucao()));
            stmt.setInt(8, aluguel.getNumeroTraje());
            stmt.setDouble(9, aluguel.getValor());
            stmt.setDouble(10, aluguel.getAdiantamento());
            stmt.setDouble(11, aluguel.getRestante());
            stmt.setInt(12, aluguel.getId());
            stmt.executeUpdate();
        }
    }

    // Buscar todos os aluguéis
    public List<Aluguel> pesquisar() {
        List<Aluguel> aluguels = new ArrayList<>();
        String sql = "SELECT * FROM aluguel";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                aluguels.add(new Aluguel(
                        rs.getInt("id"),
                        rs.getString("observacao"),
                        rs.getString("acompanhamentos"),
                        rs.getString("Atendente"),
                        rs.getString("escola"),
                        rs.getDate("DataQuadrilha").toLocalDate(),
                        rs.getDate("DataReserva").toLocalDate(),
                        rs.getDate("DataDevolucao").toLocalDate(),
                        rs.getInt("numeroTraje"),
                        rs.getDouble("valor"),
                        rs.getDouble("adiantamento"),
                        rs.getDouble("restante")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return aluguels;
    }

    // Buscar por ID
    public Aluguel pesquisarPorId(int id) {
        String sql = "SELECT * FROM aluguel WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Aluguel(
                        rs.getInt("id"),
                        rs.getString("observacao"),
                        rs.getString("acompanhamentos"),
                        rs.getString("Atendente"),
                        rs.getString("escola"),
                        rs.getDate("DataQuadrilha").toLocalDate(),
                        rs.getDate("DataReserva").toLocalDate(),
                        rs.getDate("DataDevolucao").toLocalDate(),
                        rs.getInt("numeroTraje"),
                        rs.getDouble("valor"),
                        rs.getDouble("adiantamento"),
                        rs.getDouble("restante")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
