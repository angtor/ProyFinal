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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author win 10
 */
@Entity
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u")
    , @NamedQuery(name = "Usuarios.findByIdUsuario", query = "SELECT u FROM Usuarios u WHERE u.idUsuario = :idUsuario")
    , @NamedQuery(name = "Usuarios.findByTel", query = "SELECT u FROM Usuarios u WHERE u.tel = :tel")
    , @NamedQuery(name = "Usuarios.findByCp", query = "SELECT u FROM Usuarios u WHERE u.cp = :cp")
    , @NamedQuery(name = "Usuarios.findByNExt", query = "SELECT u FROM Usuarios u WHERE u.nExt = :nExt")
    , @NamedQuery(name = "Usuarios.findByNInt", query = "SELECT u FROM Usuarios u WHERE u.nInt = :nInt")
    , @NamedQuery(name = "Usuarios.findByContra", query = "SELECT u FROM Usuarios u WHERE u.contra = :contra")
    , @NamedQuery(name = "Usuarios.findByCorreo", query = "SELECT u FROM Usuarios u WHERE u.correo = :correo")
    , @NamedQuery(name = "Usuarios.findByActivo", query = "SELECT u FROM Usuarios u WHERE u.activo = :activo")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Basic(optional = false)
    @Lob
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Lob
    @Column(name = "ApellidoP")
    private String apellidoP;
    @Basic(optional = false)
    @Lob
    @Column(name = "ApellidoM")
    private String apellidoM;
    @Basic(optional = false)
    @Lob
    @Column(name = "Genero")
    private String genero;
    @Basic(optional = false)
    @Lob
    @Column(name = "FNac")
    private String fNac;
    @Basic(optional = false)
    @Column(name = "Tel")
    private long tel;
    @Basic(optional = false)
    @Lob
    @Column(name = "Pais")
    private String pais;
    @Basic(optional = false)
    @Lob
    @Column(name = "Estado")
    private String estado;
    @Basic(optional = false)
    @Lob
    @Column(name = "Ciudad")
    private String ciudad;
    @Basic(optional = false)
    @Lob
    @Column(name = "Colonia")
    private String colonia;
    @Basic(optional = false)
    @Lob
    @Column(name = "Calle")
    private String calle;
    @Basic(optional = false)
    @Column(name = "CP")
    private int cp;
    @Basic(optional = false)
    @Column(name = "NExt")
    private int nExt;
    @Basic(optional = false)
    @Column(name = "NInt")
    private int nInt;
    @Basic(optional = false)
    @Lob
    @Column(name = "Usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "Contra")
    private String contra;
    @Basic(optional = false)
    @Lob
    @Column(name = "Tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "Correo")
    private String correo;
    @Basic(optional = false)
    @Lob
    @Column(name = "GenFav")
    private String genFav;
    @Basic(optional = false)
    @Column(name = "activo")
    private boolean activo;

    public Usuarios() {
    }

    public Usuarios(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public Usuarios(String usuario) {
        this.usuario = usuario;
    }

    public Usuarios(Integer idUsuario, String nombre, String apellidoP, String apellidoM, String genero, String fNac, long tel, String pais, String estado, String ciudad, String colonia, String calle, int cp, int nExt, int nInt, String usuario, String contra, String tipo, String correo, String genFav, boolean activo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.genero = genero;
        this.fNac = fNac;
        this.tel = tel;
        this.pais = pais;
        this.estado = estado;
        this.ciudad = ciudad;
        this.colonia = colonia;
        this.calle = calle;
        this.cp = cp;
        this.nExt = nExt;
        this.nInt = nInt;
        this.usuario = usuario;
        this.contra = contra;
        this.tipo = tipo;
        this.correo = correo;
        this.genFav = genFav;
        this.activo = activo;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFNac() {
        return fNac;
    }

    public void setFNac(String fNac) {
        this.fNac = fNac;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getNExt() {
        return nExt;
    }

    public void setNExt(int nExt) {
        this.nExt = nExt;
    }

    public int getNInt() {
        return nInt;
    }

    public void setNInt(int nInt) {
        this.nInt = nInt;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenFav() {
        return genFav;
    }

    public void setGenFav(String genFav) {
        this.genFav = genFav;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Usuarios[ idUsuario=" + idUsuario + " ]";
    }
    
}
