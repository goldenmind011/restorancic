/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Grupa1
 */
@Entity
@Table(name = "kontakt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kontakt.findAll", query = "SELECT k FROM Kontakt k")
    , @NamedQuery(name = "Kontakt.findByIDkontakt", query = "SELECT k FROM Kontakt k WHERE k.iDkontakt = :iDkontakt")
    , @NamedQuery(name = "Kontakt.findByImeKontakta", query = "SELECT k FROM Kontakt k WHERE k.imeKontakta = :imeKontakta")
    , @NamedQuery(name = "Kontakt.findByEmail", query = "SELECT k FROM Kontakt k WHERE k.email = :email")
    , @NamedQuery(name = "Kontakt.findByTelefonKontakta", query = "SELECT k FROM Kontakt k WHERE k.telefonKontakta = :telefonKontakta")
    , @NamedQuery(name = "Kontakt.findByPoruka", query = "SELECT k FROM Kontakt k WHERE k.poruka = :poruka")})
public class Kontakt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_kontakt")
    private Integer iDkontakt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ime_kontakta")
    private String imeKontakta;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "email")
    private String email;
    @Size(max = 20)
    @Column(name = "telefon_kontakta")
    private String telefonKontakta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "poruka")
    private String poruka;

    public Kontakt() {
    }

    public Kontakt(Integer iDkontakt) {
        this.iDkontakt = iDkontakt;
    }

    public Kontakt(Integer iDkontakt, String imeKontakta, String email, String poruka) {
        this.iDkontakt = iDkontakt;
        this.imeKontakta = imeKontakta;
        this.email = email;
        this.poruka = poruka;
    }

    public Kontakt(String imeKontakta, String email, String telefonKontakta, String poruka) {
        this.imeKontakta = imeKontakta;
        this.email = email;
        this.telefonKontakta = telefonKontakta;
        this.poruka = poruka;
    }
    

    public Integer getIDkontakt() {
        return iDkontakt;
    }

    public void setIDkontakt(Integer iDkontakt) {
        this.iDkontakt = iDkontakt;
    }

    public String getImeKontakta() {
        return imeKontakta;
    }

    public void setImeKontakta(String imeKontakta) {
        this.imeKontakta = imeKontakta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonKontakta() {
        return telefonKontakta;
    }

    public void setTelefonKontakta(String telefonKontakta) {
        this.telefonKontakta = telefonKontakta;
    }

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDkontakt != null ? iDkontakt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kontakt)) {
            return false;
        }
        Kontakt other = (Kontakt) object;
        if ((this.iDkontakt == null && other.iDkontakt != null) || (this.iDkontakt != null && !this.iDkontakt.equals(other.iDkontakt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Kontakt[ iDkontakt=" + iDkontakt + " ]";
    }
    
}
