package br.com.fiap.loja.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.loja.jdbc.ConnectionDB;

public class Categoria {

	private Integer idCategoria;
	private String descricao;

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void inserirCategoria() {
		Connection con = ConnectionDB.obterConexao();
		PreparedStatement stmt;

		String sql = "INSERT INTO CATEGORIA (IDCATEGORIA, DESCRICAO) VALUES (?, ?) ";

		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, this.idCategoria);
			stmt.setString(2, this.descricao);
			stmt.executeUpdate();
			System.out.println("Categoria inserida com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void alterarCategoria() {
		Connection con = ConnectionDB.obterConexao();
		PreparedStatement stmt;

		String sql = "UPDATE CATEGORIA SET DESCRICAO =? WHERE IDCATEGORIA=?  ";

		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, this.descricao);
			stmt.setInt(2, this.idCategoria);
			stmt.executeUpdate();
			System.out.println("Categoria atualizada com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void excluirCategoria() {
		Connection con = ConnectionDB.obterConexao();
		PreparedStatement stmt;

		String sql = "DELETE FROM CATEGORIA WHERE IDCATEGORIA=?  ";

		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(2, this.idCategoria);
			stmt.executeUpdate();
			System.out.println("Categoria removida com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Categoria> pesquisarCategorias() {
		Connection con = ConnectionDB.obterConexao();
		PreparedStatement stmt;

		String sql = "SELECT * FROM CATEGORIA";

		List<Categoria> listCategorias = new ArrayList<>();

		try {
			stmt = con.prepareStatement(sql);
			ResultSet result = stmt.executeQuery();

			System.out.println("--- CATEGORIAS ---");
			while (result.next()) {
				Categoria c = new Categoria();
				c.idCategoria = result.getInt("IDCATEGORIA");
				c.descricao = result.getString("DESCRICAO");
				listCategorias.add(c);
			}

			if (listCategorias.isEmpty()) {
				System.out.println("Não há linhas para exibir");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listCategorias;

	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", descricao=" + descricao + "]";
	}

}
