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


//nombre,edad,apellido,curso,radio button donde seleccione el genero,select con
//lenguajes de programacion y un text area descripcion
public class ParametorGetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String curso = req.getParameter("curso");
        String genero = req.getParameter("genero");
        String[] lenguajes = req.getParameterValues("lenguajes[]");
        String descripcion = req.getParameter("descripcion");

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Post</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet Post</h1>");
        out.println("<h2>Nombre: " + nombre + "</h2>");
        out.println("<h2>Apellido: " + apellido + "</h2>");
        out.println("<h2>Curso: " + curso + "</h2>");
        out.println("<h2>Genero: " + genero + "</h2>");
        out.println("<h2>Lenguajes de Programacion:</h2>");

        if (lenguajes != null) {
            for (String lenguaje : lenguajes) {
                out.println("<li>" + lenguaje + "</li>");
            }
        } else {
            out.println("<li>Ningún lenguaje seleccionado</li>");
        }
        out.println("<h2>Descripcion: " + descripcion + "</h2>");
        out.println("<a href=\"servlet\" methods=\"get\">xd</a>");
        out.println("</body>");
        out.println("</html>");

    }

}
