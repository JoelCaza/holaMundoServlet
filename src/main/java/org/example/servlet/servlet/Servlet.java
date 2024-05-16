package org.example.servlet.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//path o llave para poder enlazar servlet
@WebServlet("/servlet")
public class Servlet  extends HttpServlet
{
    //Indicamos el metodo utilizar en el servlet, enviamos los datos mediante un link

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet Get</h1>");

        // Recuperar parámetros
        String parametro1 = req.getParameter("parametro1");
        String parametro2 = req.getParameter("parametro2");
        String parametro3 = req.getParameter("parametro3");

        // Mostrar los parámetros en la página
        out.println("<p>Parámetro 1: " + parametro1 + "</p>");
        out.println("<p>Parámetro 2: " + parametro2 + "</p>");
        out.println("Parametro 3:" + parametro3);

        out.println("</body>");
        out.println("</html>");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);





    }
}
