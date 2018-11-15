/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author win 10
 */
@Entity
@Table(name = "libros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Libros.findAll", query = "SELECT l FROM Libros l")
    , @NamedQuery(name = "Libros.findByIdLibro", query = "SELECT l FROM Libros l WHERE l.idLibro = :idLibro")
    , @NamedQuery(name = "Libros.findByTitulo", query = "SELECT l FROM Libros l WHERE l.titulo = :titulo")
    , @NamedQuery(name = "Libros.findByAutor", query = "SELECT l FROM Libros l WHERE l.autor = :autor")
    , @NamedQuery(name = "Libros.findByEditorial", query = "SELECT l FROM Libros l WHERE l.editorial = :editorial")
    , @NamedQuery(name = "Libros.findByA\u00f1o", query = "SELECT l FROM Libros l WHERE l.a\u00f1o = :a\u00f1o")
    , @NamedQuery(name = "Libros.findByIsbn", query = "SELECT l FROM Libros l WHERE l.isbn = :isbn")
    , @NamedQuery(name = "Libros.findByGenero", query = "SELECT l FROM Libros l WHERE l.genero = :genero")
    , @NamedQuery(name = "Libros.findByCosto", query = "SELECT l FROM Libros l WHERE l.costo = :costo")
    , @NamedQuery(name = "Libros.findByExistencia", query = "SELECT l FROM Libros l WHERE l.existencia = :existencia")
    , @NamedQuery(name = "Libros.findByDescripcion", query = "SELECT l FROM Libros l WHERE l.descripcion = :descripcion")})
public class Libros implements Serializable {

    @Basic(optional = false)
    @Column(name = "activo")
    private boolean activo;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id_Libro")
    private Integer idLibro;
    @Basic(optional = false)
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Autor")
    private String autor;
    @Column(name = "Editorial")
    private String editorial;
    @Basic(optional = false)
    @Column(name = "Año")
    private long año;
    @Basic(optional = false)
    @Column(name = "ISBN")
    private long isbn;
    @Column(name = "Genero")
    private String genero;
    @Basic(optional = false)
    @Column(name = "Costo")
    private float costo;
    @Basic(optional = false)
    @Column(name = "Existencia")
    private int existencia;
    @Basic(optional = false)
    @Column(name = "Descripcion")
    private String descripcion;

    public Libros() {
    }

    public Libros(Integer idLibro) {
        this.idLibro = idLibro;
    }
    
    public Libros(Integer idLibro, boolean activo) {
        this.idLibro = idLibro;
        this.activo = activo;
    }

    public Libros(Integer id, String titulo, String autor, String editorial,
            long año, long isbn, String genero, float costo, int existencia, String descripcion, boolean activo) {
        
        this.idLibro = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.año = año;
        this.isbn = isbn;
        this.genero = genero;
        this.costo = costo;
        this.existencia = existencia;
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public long getAño() {
        return año;
    }

    public void setAño(long año) {
        this.año = año;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLibro != null ? idLibro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libros)) {
            return false;
        }
        Libros other = (Libros) object;
        if ((this.idLibro == null && other.idLibro != null) || (this.idLibro != null && !this.idLibro.equals(other.idLibro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Libros[ idLibro=" + idLibro + " ]";
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}
