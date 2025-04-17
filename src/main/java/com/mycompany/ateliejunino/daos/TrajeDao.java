package com.mycompany.ateliejunino.daos;

import com.mycompany.ateliejunino.entidades.Traje;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TrajeDao extends GenericDao {
    // Salvar um Traje
    public void salvar(Traje traje) {
        String sql = "INSERT INTO traje (descricao, numeroTraje, valor) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, traje.getDescricao());
            stmt.setInt(2, traje.getNumeroTraje());
            stmt.setDouble(3, traje.getValor());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Excluir pelo ID
    public void excluir(int id) {
        String sql = "DELETE FROM traje WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Editar
    public void editar(Traje traje) {
        String sql = "UPDATE traje SET descricao = ?, numeroTraje = ?, valor = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, traje.getDescricao());
            stmt.setInt(2, traje.getNumeroTraje());
            stmt.setDouble(3, traje.getValor());
            stmt.setInt(4, traje.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Pesquisar todos
    public List<Traje> pesquisar() {
        List<Traje> trajes = new ArrayList<>();
        String sql = "SELECT * FROM traje";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Traje traje = new Traje();
                traje.setId(rs.getInt("id"));
                traje.setDescricao(rs.getString("descricao"));
                traje.setNumeroTraje(rs.getInt("numeroTraje"));
                traje.setValor(rs.getDouble("valor"));
                trajes.add(traje);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return trajes;
    }

    // Pesquisar por ID
    public Traje pesquisarPorId(int id) {
        String sql = "SELECT * FROM traje WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Traje traje = new Traje();
                traje.setId(rs.getInt("id"));
                traje.setDescricao(rs.getString("descricao"));
                traje.setNumeroTraje(rs.getInt("numeroTraje"));
                traje.setValor(rs.getDouble("valor"));
                return traje;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
