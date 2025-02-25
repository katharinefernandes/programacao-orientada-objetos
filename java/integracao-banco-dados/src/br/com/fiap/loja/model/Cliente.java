package br.com.fiap.loja.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.ConnectionDB;

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

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone
				+ ", cpf=" + cpf + "]";
	}

}
