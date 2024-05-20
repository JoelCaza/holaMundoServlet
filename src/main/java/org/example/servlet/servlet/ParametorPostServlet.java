package org.example.servlet.servlet;


/*
Autor:Joel Caza
Materia: Lenguajes de Programacion
Fecha:17/05/2024
 */

// Importaciones necesarias para el funcionamiento del servlet
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// Declaración del servlet y asignación de la URL para acceder a él
@WebServlet("/servletParametros")

// Definición de la clase del servlet
public class ParametorPostServlet extends HttpServlet {

    // Método para manejar las peticiones GET (en este caso no se utiliza)
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    // Método para manejar las peticiones POST
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Creación de un objeto PrintWriter para escribir la respuesta HTTP
        PrintWriter out = resp.getWriter();

        // Obtención de los parámetros enviados en la petición POST
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String curso = req.getParameter("curso");
        String genero = req.getParameter("genero");
        String[] lenguajes = req.getParameterValues("lenguajes[]");
        String descripcion = req.getParameter("descripcion");

        // Escritura de la respuesta HTML
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

        // Verificación de si se seleccionaron lenguajes de programación
        if (lenguajes != null) {
            // Si se seleccionaron, se recorren e imprimen
            for (String lenguaje : lenguajes) {
                out.println("<li>" + lenguaje + "</li>");
            }
        } else {
            // Si no se seleccionaron lenguajes, se muestra un mensaje indicándolo
            out.println("<li>Ningún lenguaje seleccionado</li>");
        }

        // Impresión de la descripción
        out.println("<h2>Descripcion: " + descripcion + "</h2>");
        out.println("</body>");
        out.println("</html>");
    }
}
