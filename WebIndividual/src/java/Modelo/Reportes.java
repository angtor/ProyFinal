/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author win 10
 */
@Entity
@Table(name = "reportes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reportes.findAll", query = "SELECT r FROM Reportes r")
    , @NamedQuery(name = "Reportes.findByMes", query = "SELECT r FROM Reportes r WHERE r.mes = :mes")
    , @NamedQuery(name = "Reportes.findByIdLibro", query = "SELECT r FROM Reportes r WHERE r.idLibro = :idLibro")})
public class Reportes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "mes")
    @Temporal(TemporalType.DATE)
    private Date mes;
    @Basic(optional = false)
    @Column(name = "Id_Libro")
    private String idLibro;

    public Reportes() {
    }

    public Reportes(Date mes) {
        this.mes = mes;
    }

    public Reportes(Date mes, String idLibro) {
        this.mes = mes;
        this.idLibro = idLibro;
    }

    public Date getMes() {
        return mes;
    }

    public void setMes(Date mes) {
        this.mes = mes;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mes != null ? mes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reportes)) {
            return false;
        }
        Reportes other = (Reportes) object;
        if ((this.mes == null && other.mes != null) || (this.mes != null && !this.mes.equals(other.mes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Reportes[ mes=" + mes + " ]";
    }
    
}
