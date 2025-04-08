package br.com.fiap.loja.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.fiap.loja.jdbc.ConnectionDB;

public class Produto {

	private Integer idProduto;
	private String descricao;
	private Double preco;
	private Categoria categoria;

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void inserirProduto() {
		Connection con = ConnectionDB.obterConexao();
		PreparedStatement stmt;

		String sql = " INSERT INTO PRODUTO (IDPRODUTO, DESCRICAO, PRECO, IDCATEGORIA) VALUES (?,?,?,?) ";

		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, this.idProduto);
			stmt.setString(2, this.descricao);
			stmt.setDouble(3, this.preco);
			stmt.setInt(4, this.categoria.getIdCategoria());

			stmt.executeUpdate();
			
			System.out.println("Produto adicionado com sucesso!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", descricao=" + descricao + ", preco=" + preco + ", categoria="
				+ categoria + "]";
	}

}
