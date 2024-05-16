package org.example.servlet.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
//path o llave para poder enlazar servlet
@WebServlet("/servletParametros")

public class ParametorGetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet ParametorGetServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet ParametorGetServlet</h1>");
        out.println("<h2>Nombre: " + nombre + "</h2>");
        out.println("<h2>Apellido: " + apellido + "</h2>");
        out.println("</body>");
        out.println("</html>");

    }
}
