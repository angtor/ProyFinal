/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlCliente;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author win 10
 */
public class UsuariosC extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        Connection con = null;
        String dbName = "libreria";
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/";
        try (PrintWriter out = response.getWriter()) {
            
            String titulo = request.getParameter("Titulo");
            String autor = request.getParameter("Autor");
            String editorial = request.getParameter("Editorial");
            String año = request.getParameter("Año");
            String isbn = request.getParameter("ISBN");
            String genero = request.getParameter("Genero");
            String costo = request.getParameter("Costo");
            String existencia = request.getParameter("Existencia");
            String descripcion = request.getParameter("Descripcion");
            
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url+dbName, "root", "");
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into libreria values (?,?,?,?,?,?,?,?,?)");
            
            ps.setString(1, titulo);
            ps.setString(2, autor);
            ps.setString(3, editorial);
            ps.setString(4, año);
            ps.setString(5, isbn);
            ps.setString(6, genero);
            ps.setString(7, costo);
            ps.setString(8, existencia);
            ps.setString(9, descripcion);
            
            int i = ps.executeUpdate();
            String msg = "";
            
            if(i!=0){
                msg = "Se han ha registrado el libro: " + titulo;
                out.println("<font size='6' color=blue>" + msg + "</font>");
                
            } else {
                msg = "Error al registrar, por favor revise";
                out.println("<font size='6' color=blue>" + msg + "</font>");
            }
            ps.close();
            

        }
    }

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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuariosC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(UsuariosC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(UsuariosC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosC.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuariosC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(UsuariosC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(UsuariosC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosC.class.getName()).log(Level.SEVERE, null, ex);
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
