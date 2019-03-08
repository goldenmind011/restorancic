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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Grupa1
 */
@Entity
@Table(name = "narudzbine")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Narudzbine.findAll", query = "SELECT n FROM Narudzbine n")
    , @NamedQuery(name = "Narudzbine.findByIdNarudzbina", query = "SELECT n FROM Narudzbine n WHERE n.idNarudzbina = :idNarudzbina")
    , @NamedQuery(name = "Narudzbine.findByNapomena", query = "SELECT n FROM Narudzbine n WHERE n.napomena = :napomena")
    , @NamedQuery(name = "Narudzbine.findByAdresaDostava", query = "SELECT n FROM Narudzbine n WHERE n.adresaDostava = :adresaDostava")})
public class Narudzbine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_narudzbina")
    private Integer idNarudzbina;
    @Size(max = 250)
    @Column(name = "napomena")
    private String napomena;
    @Size(max = 60)
    @Column(name = "adresa_dostava")
    private String adresaDostava;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "narudzbineIdNarudzbina")
    private List<DetaljiNarudzbina> detaljiNarudzbinaList;
    @JoinColumn(name = "korisnici_ID_korisnik", referencedColumnName = "ID_korisnik")
    @ManyToOne(optional = false)
    private Korisnici korisniciIDkorisnik;

    public Narudzbine() {
    }

    public Narudzbine(Integer idNarudzbina) {
        this.idNarudzbina = idNarudzbina;
    }

    public Integer getIdNarudzbina() {
        return idNarudzbina;
    }

    public void setIdNarudzbina(Integer idNarudzbina) {
        this.idNarudzbina = idNarudzbina;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public String getAdresaDostava() {
        return adresaDostava;
    }

    public void setAdresaDostava(String adresaDostava) {
        this.adresaDostava = adresaDostava;
    }

    @XmlTransient
    public List<DetaljiNarudzbina> getDetaljiNarudzbinaList() {
        return detaljiNarudzbinaList;
    }

    public void setDetaljiNarudzbinaList(List<DetaljiNarudzbina> detaljiNarudzbinaList) {
        this.detaljiNarudzbinaList = detaljiNarudzbinaList;
    }

    public Korisnici getKorisniciIDkorisnik() {
        return korisniciIDkorisnik;
    }

    public void setKorisniciIDkorisnik(Korisnici korisniciIDkorisnik) {
        this.korisniciIDkorisnik = korisniciIDkorisnik;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNarudzbina != null ? idNarudzbina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Narudzbine)) {
            return false;
        }
        Narudzbine other = (Narudzbine) object;
        if ((this.idNarudzbina == null && other.idNarudzbina != null) || (this.idNarudzbina != null && !this.idNarudzbina.equals(other.idNarudzbina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Narudzbine[ idNarudzbina=" + idNarudzbina + " ]";
    }
    
}
