package br.com.montadora.main;

import java.sql.Connection;

import br.com.montadora.conexoes.Conexao;
import br.com.montadora.dao.MontadoraDAO;
import br.com.montadora.model.Carro;

public class ProgramaInserir {

	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();
		
		Carro carro = new Carro();
		MontadoraDAO montadoradao = new MontadoraDAO(con);
		
		//Testando o método inserir
		carro.setNomeMontadora("FIAT");
		carro.setNomeCarro("CITY");
		System.out.println(montadoradao.inserir(carro));
		
		Conexao.fecharConexao(con);
	}
}
