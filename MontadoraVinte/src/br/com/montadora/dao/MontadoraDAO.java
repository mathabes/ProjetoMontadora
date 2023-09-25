package br.com.montadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.montadora.model.Carro;
public class MontadoraDAO {
	private Connection con;
	public final Connection getCon() {
		return con;
	}
	 
	public final void setCon(Connection con) {
		this.con = con;
	}
	 
	public MontadoraDAO(Connection con) {
		setCon(con);
	}
	
	// Método Inserir 
	public String inserir(Carro carro) {
		String sql = "insert into MONTADORAVINTE(nomeMontadora, nomeCarro) values (?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getNomeMontadora());
			ps.setString(2, carro.getNomeCarro());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	//Método Deletar
	public String deletar(Carro carro){
		try {
			PreparedStatement ps = getCon().prepareStatement("delete from MONTADORAVINTE where nomeCarro = ?");
			ps.setString(1, carro.getNomeCarro());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro ao deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	// Método modificar
	public String alterar(Carro carro) {
		try {
			PreparedStatement ps = getCon().prepareStatement("update MONTADORAVINTE set nomeMontadora = ? where nomeCarro = ?");
			ps.setString(1, carro.getNomeMontadora());
			ps.setString(2, carro.getNomeCarro());
			if (ps.executeUpdate() > 0) {
				return "Alterado com sucesso";
			} else {
				return "Erro ao alterar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}
