package br.com.montadora.main;

import java.sql.Connection;

import br.com.montadora.conexoes.Conexao;
import br.com.montadora.dao.MontadoraDAO;
import br.com.montadora.model.Carro;

public class ProgramaAlterar {

	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();
		
		Carro carro = new Carro();
		MontadoraDAO montadoradao = new MontadoraDAO(con);
		
		//Testando o método inserir
		carro.setNomeMontadora("HONDA");
		carro.setNomeCarro("CITY");
		System.out.println(montadoradao.alterar(carro));
		
		Conexao.fecharConexao(con);
	}
}