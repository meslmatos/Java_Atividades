import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class Categoria extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //armazenando o parâmetro em uma variável
        String nomeCategoria = req.getParameter("nome");
        String descricaoCategoria = req.getParameter("descricao");

        PrintWriter out = resp.getWriter();
        out.println("Modulo Categoria");

        out.printf("Nome da categoria: %s \nDescricao: %s", nomeCategoria,descricaoCategoria);

    }  
}