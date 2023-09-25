package br.com.montadora.main;

import java.sql.Connection;

import br.com.montadora.conexoes.Conexao;
import br.com.montadora.dao.MontadoraDAO;
import br.com.montadora.model.Carro;

public class ProgramaDeletar {

	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();
		
		Carro carro = new Carro();
		MontadoraDAO montadoradao = new MontadoraDAO(con);
		
		//Testando o método deletar
		carro.setNomeCarro("Sandero");
		System.out.println(montadoradao.deletar(carro));
		
		Conexao.fecharConexao(con);
	}

}
