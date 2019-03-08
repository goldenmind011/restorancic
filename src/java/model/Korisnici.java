/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Grupa1
 */
@Entity
@Table(name = "korisnici")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Korisnici.findAll", query = "SELECT k FROM Korisnici k")
    , @NamedQuery(name = "Korisnici.findByIDkorisnik", query = "SELECT k FROM Korisnici k WHERE k.iDkorisnik = :iDkorisnik")
    , @NamedQuery(name = "Korisnici.findByEmail", query = "SELECT k FROM Korisnici k WHERE k.email = :email")
    , @NamedQuery(name = "Korisnici.findByAdresa", query = "SELECT k FROM Korisnici k WHERE k.adresa = :adresa")
    , @NamedQuery(name = "Korisnici.findByTelefon", query = "SELECT k FROM Korisnici k WHERE k.telefon = :telefon")
    , @NamedQuery(name = "Korisnici.findByGrad", query = "SELECT k FROM Korisnici k WHERE k.grad = :grad")
    , @NamedQuery(name = "Korisnici.findByIme", query = "SELECT k FROM Korisnici k WHERE k.ime = :ime")
    , @NamedQuery(name = "Korisnici.findByPrezime", query = "SELECT k FROM Korisnici k WHERE k.prezime = :prezime")
    , @NamedQuery(name = "Korisnici.findByPassword", query = "SELECT k FROM Korisnici k WHERE k.password = :password")})
public class Korisnici implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_korisnik")
    private Integer iDkorisnik;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "adresa")
    private String adresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "telefon")
    private String telefon;
    @Size(max = 45)
    @Column(name = "grad")
    private String grad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ime")
    private String ime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "prezime")
    private String prezime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "password")
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idKorisnik")
    private List<Rezervacije> rezervacijeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "korisniciIDkorisnik")
    private List<Narudzbine> narudzbineList;

    public Korisnici() {
    }

    public Korisnici(Integer iDkorisnik) {
        this.iDkorisnik = iDkorisnik;
    }

    public Korisnici(Integer iDkorisnik, String email, String adresa, String telefon, String ime, String prezime, String password) {
        this.iDkorisnik = iDkorisnik;
        this.email = email;
        this.adresa = adresa;
        this.telefon = telefon;
        this.ime = ime;
        this.prezime = prezime;
        this.password = password;
    }
    
    public Korisnici(String ime, String prezime, String email, String password, String adresa, String telefon, String grad) {
        this.grad = grad;
        this.email = email;
        this.adresa = adresa;
        this.telefon = telefon;
        this.ime = ime;
        this.prezime = prezime;
        this.password = password;
    }

    public Integer getIDkorisnik() {
        return iDkorisnik;
    }

    public void setIDkorisnik(Integer iDkorisnik) {
        this.iDkorisnik = iDkorisnik;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlTransient
    public List<Rezervacije> getRezervacijeList() {
        return rezervacijeList;
    }

    public void setRezervacijeList(List<Rezervacije> rezervacijeList) {
        this.rezervacijeList = rezervacijeList;
    }

    @XmlTransient
    public List<Narudzbine> getNarudzbineList() {
        return narudzbineList;
    }

    public void setNarudzbineList(List<Narudzbine> narudzbineList) {
        this.narudzbineList = narudzbineList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDkorisnik != null ? iDkorisnik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Korisnici)) {
            return false;
        }
        Korisnici other = (Korisnici) object;
        if ((this.iDkorisnik == null && other.iDkorisnik != null) || (this.iDkorisnik != null && !this.iDkorisnik.equals(other.iDkorisnik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Korisnici[ iDkorisnik=" + iDkorisnik + " ]";
    }
    
}
