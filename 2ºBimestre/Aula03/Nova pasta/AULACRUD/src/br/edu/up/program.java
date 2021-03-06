package br.edu.up;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class program {

	public static void main(String[] args) throws SQLException {
		
		/*	  
			INSERT into cliente (nome, data_nsc, CPF, email) VALUES ('iasmin', '2000/12/31', '555.666.777-88', 'anazinha@gmail.com')
		  
 			SELECT * FROM cliente
 		
 			UPDATE cliente set nome = 'Ana Banana' WHERE id = 3
 			
 			DELETE from cliente where id = 4
		*/
		incluir();
		listar();
		//atualizar();
		//apagar;
	
		

		
	}
	
	public static void listar() throws SQLException {
		//1. Abrir conex?o com Banco de Dados;
		String url = "jdbc:sqlite:C:\\Users\\11070083950\\Desktop\\Nova pasta\\AULACRUD\\db\\salve_bando_de_dados.db";
		Connection conexao = DriverManager.getConnection(url);
		
		//2. Criar o comando e executar o SQL;
		Statement comando = conexao.createStatement();
		String querySelect = "select * from cliente";
		ResultSet resultado = comando.executeQuery(querySelect);
		
		
		//3. Mostrar os dados;
		while(resultado.next()) {
			int codigo = resultado.getInt(1);
			String nome = resultado.getString(2);
			String dtaNsc = resultado.getString(3);
			String cpf = resultado.getString(4);
			String email = resultado.getString(5);
			
			System.out.println("ID: " + codigo);
			System.out.println("Nome: " + nome);
			System.out.println("Data Nascimento: " + dtaNsc);
			System.out.println("CPF: " + cpf);
			System.out.println("EMAIL: " + email);
			System.out.println("-------------");
		}
	}	
	
	public static void incluir() throws SQLException {
		//1. Abrir conex?o com Banco de Dados;
		String url = "jdbc:sqlite:C:\\Users\\11070083950\\Desktop\\Nova pasta\\AULACRUD\\db\\salve_bando_de_dados.db";
		Connection conexao = DriverManager.getConnection(url);
		
		//2. Criar o comando e executar o SQL;
		Statement comando = conexao.createStatement();
		String queryInsert = "INSERT into cliente (nome, data_nsc, CPF, email) VALUES ('iasmin', '2000/12/31', '555.666.777-88', 'anazinha@gmail.com')";
		comando.execute(queryInsert);

		}	
	
	public static void atualizar() throws SQLException {
		//1. Abrir conex?o com Banco de Dados;
		String url = "jdbc:sqlite:C:\\Users\\11070083950\\Desktop\\Nova pasta\\AULACRUD\\db\\salve_bando_de_dados.db";
		Connection conexao = DriverManager.getConnection(url);
		
		//2. Criar o comando e executar o SQL;
		Statement comando = conexao.createStatement();
		String queryUpdate = "UPDATE cliente set nome = 'Ana Banana' WHERE id = 3";
		comando.executeUpdate(queryUpdate);

		}	
	
	public static void apagar() throws SQLException {
		//1. Abrir conex?o com Banco de Dados;
		String url = "jdbc:sqlite:C:\\Users\\11070083950\\Desktop\\Nova pasta\\AULACRUD\\db\\salve_bando_de_dados.db";
		Connection conexao = DriverManager.getConnection(url);
		
		//2. Criar o comando e executar o SQL;
		Statement comando = conexao.createStatement();
		String queryDelete = "DELETE from cliente where id = 4";
		comando.execute(queryDelete);
	}	
}	
	



