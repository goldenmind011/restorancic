/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Grupa1
 */
@Entity
@Table(name = "rezervacije")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rezervacije.findAll", query = "SELECT r FROM Rezervacije r")
    , @NamedQuery(name = "Rezervacije.findByIdRezervacija", query = "SELECT r FROM Rezervacije r WHERE r.idRezervacija = :idRezervacija")
    , @NamedQuery(name = "Rezervacije.findByTip", query = "SELECT r FROM Rezervacije r WHERE r.tip = :tip")
    , @NamedQuery(name = "Rezervacije.findByBrojGostiju", query = "SELECT r FROM Rezervacije r WHERE r.brojGostiju = :brojGostiju")
    , @NamedQuery(name = "Rezervacije.findByDatum", query = "SELECT r FROM Rezervacije r WHERE r.datum = :datum")
    , @NamedQuery(name = "Rezervacije.findByVreme", query = "SELECT r FROM Rezervacije r WHERE r.vreme = :vreme")
    , @NamedQuery(name = "Rezervacije.findByKomentar", query = "SELECT r FROM Rezervacije r WHERE r.komentar = :komentar")})
public class Rezervacije implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_rezervacija")
    private Integer idRezervacija;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tip")
    private String tip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "broj_gostiju")
    private int brojGostiju;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datum")
    @Temporal(TemporalType.DATE)
    private Date datum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vreme")
    @Temporal(TemporalType.TIME)
    private Date vreme;
    @Size(max = 250)
    @Column(name = "Komentar")
    private String komentar;
    @JoinColumn(name = "id_korisnik", referencedColumnName = "ID_korisnik")
    @ManyToOne(optional = false)
    private Korisnici idKorisnik;

    public Rezervacije() {
    }

    public Rezervacije(Integer idRezervacija) {
        this.idRezervacija = idRezervacija;
    }

    public Rezervacije(Integer idRezervacija, String tip, int brojGostiju, Date datum, Date vreme) {
        this.idRezervacija = idRezervacija;
        this.tip = tip;
        this.brojGostiju = brojGostiju;
        this.datum = datum;
        this.vreme = vreme;
    }

    public Integer getIdRezervacija() {
        return idRezervacija;
    }

    public void setIdRezervacija(Integer idRezervacija) {
        this.idRezervacija = idRezervacija;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getBrojGostiju() {
        return brojGostiju;
    }

    public void setBrojGostiju(int brojGostiju) {
        this.brojGostiju = brojGostiju;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Date getVreme() {
        return vreme;
    }

    public void setVreme(Date vreme) {
        this.vreme = vreme;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    public Korisnici getIdKorisnik() {
        return idKorisnik;
    }

    public void setIdKorisnik(Korisnici idKorisnik) {
        this.idKorisnik = idKorisnik;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRezervacija != null ? idRezervacija.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rezervacije)) {
            return false;
        }
        Rezervacije other = (Rezervacije) object;
        if ((this.idRezervacija == null && other.idRezervacija != null) || (this.idRezervacija != null && !this.idRezervacija.equals(other.idRezervacija))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Rezervacije[ idRezervacija=" + idRezervacija + " ]";
    }
    
}
