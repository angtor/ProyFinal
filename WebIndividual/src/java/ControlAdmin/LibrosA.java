/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlAdmin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Controladores.LibrosJpaController;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Modelo.Libros;
/**
 *
 * @author win 10
 */
public class LibrosA extends HttpServlet {
    
    EntityManagerFactory emf = Persistence
            .createEntityManagerFactory("WebIndividualPU");
    EntityManager em = emf.createEntityManager();
    Libros libr = null;
    

    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            
            
        }    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=iso-8859-1");
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=iso-8859-1");
        try (PrintWriter out = response.getWriter()) {
            
            int id = Integer.parseInt(request.getParameter("id"));
            String titulo = request.getParameter("Titulo");
            String autor = request.getParameter("Autor");
            String editorial = request.getParameter("Editorial");
            long año = Long.parseLong(request.getParameter("Ano"));
            long isbn = Long.parseLong(request.getParameter("ISBN"));
            String genero = request.getParameter("Genero");
            float costo = Float.parseFloat(request.getParameter("Precio"));
            int existencia = Integer.parseInt(request.getParameter("Existencia"));
            String descripcion = request.getParameter("Descripcion");
            boolean activo = true;
            
            LibrosJpaController lib = new LibrosJpaController(emf);
            libr = new Libros(id, titulo, autor, editorial, año, isbn, genero, costo, existencia, descripcion, activo);
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Se ha agregado el libro: " + id +"');");
            out.println("</script>");
            response.sendRedirect("Catalogo.jsp");
            lib.create(libr);
    }   catch (Exception ex) {
            
            System.out.println(ex.getMessage() + "");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
