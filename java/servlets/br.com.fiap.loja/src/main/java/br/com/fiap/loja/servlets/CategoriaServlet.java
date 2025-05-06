package br.com.fiap.loja.servlets;

import java.io.IOException;

import br.com.fiap.loja.model.Categoria;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CategoriaServlet
 */
public class CategoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CategoriaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("passe no get");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Categoria categoria = new Categoria();
		categoria.setIdCategoria(Integer.parseInt(request.getParameter("idCategoria")));
		categoria.setDescricao(request.getParameter("descricao"));
		categoria.inserirCategoria();
		// redireciona para página de cadastro
		request.getRequestDispatcher("Categoria.jsp").forward(request, response);
	}

}
