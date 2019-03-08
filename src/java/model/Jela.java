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
@Table(name = "jela")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jela.findAll", query = "SELECT j FROM Jela j")
    , @NamedQuery(name = "Jela.findByIDjelo", query = "SELECT j FROM Jela j WHERE j.iDjelo = :iDjelo")
    , @NamedQuery(name = "Jela.findByNazivJela", query = "SELECT j FROM Jela j WHERE j.nazivJela = :nazivJela")
    , @NamedQuery(name = "Jela.findByOpisJela", query = "SELECT j FROM Jela j WHERE j.opisJela = :opisJela")
    , @NamedQuery(name = "Jela.findByCena", query = "SELECT j FROM Jela j WHERE j.cena = :cena")
    , @NamedQuery(name = "Jela.findByKategorija", query = "SELECT j FROM Jela j WHERE j.kategorija = :kategorija")})
public class Jela implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_jelo")
    private Integer iDjelo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "naziv_jela")
    private String nazivJela;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "opis_jela")
    private String opisJela;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cena")
    private int cena;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "kategorija")
    private String kategorija;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jelaIDjelo")
    private List<DetaljiNarudzbina> detaljiNarudzbinaList;

    public Jela() {
    }

    public Jela(Integer iDjelo) {
        this.iDjelo = iDjelo;
    }

    public Jela(Integer iDjelo, String nazivJela, String opisJela, int cena, String kategorija) {
        this.iDjelo = iDjelo;
        this.nazivJela = nazivJela;
        this.opisJela = opisJela;
        this.cena = cena;
        this.kategorija = kategorija;
    }

    public Integer getIDjelo() {
        return iDjelo;
    }

    public void setIDjelo(Integer iDjelo) {
        this.iDjelo = iDjelo;
    }

    public String getNazivJela() {
        return nazivJela;
    }

    public void setNazivJela(String nazivJela) {
        this.nazivJela = nazivJela;
    }

    public String getOpisJela() {
        return opisJela;
    }

    public void setOpisJela(String opisJela) {
        this.opisJela = opisJela;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    @XmlTransient
    public List<DetaljiNarudzbina> getDetaljiNarudzbinaList() {
        return detaljiNarudzbinaList;
    }

    public void setDetaljiNarudzbinaList(List<DetaljiNarudzbina> detaljiNarudzbinaList) {
        this.detaljiNarudzbinaList = detaljiNarudzbinaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDjelo != null ? iDjelo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jela)) {
            return false;
        }
        Jela other = (Jela) object;
        if ((this.iDjelo == null && other.iDjelo != null) || (this.iDjelo != null && !this.iDjelo.equals(other.iDjelo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Jela[ iDjelo=" + iDjelo + " ]";
    }
    
}
