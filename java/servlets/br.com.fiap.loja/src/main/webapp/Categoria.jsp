<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Categoria</title>
</head>
<body>

<form method="post" action="CategoriaServlet">
	<input type="hidden" name="editar" value="" />
	ID:<input type="text" name="idCategoria" value=""/><br/> 
	Description: <input type="text" name="descricao" value=""/><br/>
	<input type="submit" value="Salvar"/>
</form>

</body>
</html>