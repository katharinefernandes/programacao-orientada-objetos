package br.com.fiap.loja.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.loja.jdbc.ConnectionDB;

public class Cliente {

	private Long idCliente;
	private String nome;
	private String email;
	private String telefone;
	private String cpf;

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void insereCliente() {
		Connection con = ConnectionDB.obterConexao();
		String sql = " INSERT INTO cliente(id_cliente, nome, email, cpf, telefone) VALUES (?, ?, ?, ?, ?)";

		PreparedStatement pstmt;

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setLong(1, this.idCliente);
			pstmt.setString(2, this.nome);
			pstmt.setString(3, this.email);
			pstmt.setString(4, this.cpf);
			pstmt.setString(5, this.telefone);

			pstmt.executeUpdate();
			System.out.println("Cliente inserido com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void alteraCliente() {
		Connection con = ConnectionDB.obterConexao();
		PreparedStatement pstmt;
		String sql = "UPDATE CLIENTE SET EMAIL=?, TELEFONE=? WHERE ID_CLIENTE=? ";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, this.email);
			pstmt.setString(2, this.telefone);
			pstmt.setLong(3, this.idCliente);

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void excluiCliente() {
		Connection con = ConnectionDB.obterConexao();
		String sql = "DELETE FROM CLIENTE WHERE ID_CLIENTE =? ";

		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setLong(1, this.idCliente);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Cliente> pesquisarClientes() {
		Connection con = ConnectionDB.obterConexao();
		PreparedStatement stmt;

		String sql = "SELECT * FROM CLIENTE ";

		List<Cliente> listCliente = new ArrayList<>();

		try {
			stmt = con.prepareStatement(sql);
			ResultSet result = stmt.executeQuery();

			System.out.println("--- CLIENTES ---");
			while (result.next()) {
				Cliente c = new Cliente();
				c.idCliente = result.getLong("ID_CLIENTE");
				c.nome = result.getString("NOME");
				c.email = result.getString("EMAIL");
				c.telefone = result.getString("TELEFONE");
				c.cpf = result.getString("CPF");
				listCliente.add(c);
			}

			if (listCliente.isEmpty()) {
				System.out.println("Não há linhas para exibir");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listCliente;

	}

	public Cliente pesquisarCliente() {
		Connection con = ConnectionDB.obterConexao();
		PreparedStatement stmt;

		String sql = "SELECT * FROM CLIENTE WHERE ID_CLIENTE =? ";

		Cliente cliente = new Cliente();

		try {
			stmt = con.prepareStatement(sql);
			stmt.setLong(1, this.idCliente);
			ResultSet result = stmt.executeQuery();

			if (!result.next()) {
				System.out.println("Não há linhas para exibir");
			}

			System.out.println("--- CLIENTES ---");
			Cliente c = new Cliente();
			c.idCliente = result.getLong("ID_CLIENTE");
			c.nome = result.getString("NOME");
			c.email = result.getString("EMAIL");
			c.telefone = result.getString("TELEFONE");
			c.cpf = result.getString("CPF");
			cliente = c;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return cliente;

	}

	public List<Cliente> pesquisarClienteByName(String nome) {
		Connection con = ConnectionDB.obterConexao();
		PreparedStatement stmt;

		String sql = "SELECT * FROM CLIENTE WHERE NOME =? ";

		List<Cliente> clientes = new ArrayList<Cliente>();

		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, nome);
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				System.out.println("--- CLIENTES ---");
				Cliente c = new Cliente();
				c.idCliente = result.getLong("ID_CLIENTE");
				c.nome = result.getString("NOME");
				c.email = result.getString("EMAIL");
				c.telefone = result.getString("TELEFONE");
				c.cpf = result.getString("CPF");
				clientes.add(c);
			}
			
			if(clientes.isEmpty()) {
				System.out.println("Nenhum cliente com esse nome foi localizado!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return clientes;

	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone
				+ ", cpf=" + cpf + "]";
	}

}