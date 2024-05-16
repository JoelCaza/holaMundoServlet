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
        Integer edad = Integer.valueOf(req.getParameter("edad"));
        Double precio = Double.valueOf(req.getParameter("precio"));
        Boolean estado = Boolean.valueOf(req.getParameter("estado"));
        Float iva = Float.valueOf(req.getParameter("iva"));



        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet ParametorGetServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet ParametorGetServlet</h1>");
        out.println("<h2>Nombre: " + nombre + "</h2>");
        out.println("<h2>Apellido: " + apellido + "</h2>");
        out.println("<h2>Edad: " + edad + "</h2>");
        out.println("<h2>Precio: " + precio + "</h2>");
        out.println("<h2>EdadActual: " + estado + "</h2>");
        out.println("<h2>Iva: " + iva + "</h2>");
        out.println("</body>");
        out.println("</html>");

    }
}
