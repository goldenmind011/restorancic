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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Grupa1
 */
@Entity
@Table(name = "detalji_narudzbina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetaljiNarudzbina.findAll", query = "SELECT d FROM DetaljiNarudzbina d")
    , @NamedQuery(name = "DetaljiNarudzbina.findByIDdetaljinarudzbine", query = "SELECT d FROM DetaljiNarudzbina d WHERE d.iDdetaljinarudzbine = :iDdetaljinarudzbine")
    , @NamedQuery(name = "DetaljiNarudzbina.findByKolicina", query = "SELECT d FROM DetaljiNarudzbina d WHERE d.kolicina = :kolicina")})
public class DetaljiNarudzbina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_detalji_narudzbine")
    private Integer iDdetaljinarudzbine;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kolicina")
    private int kolicina;
    @JoinColumn(name = "jela_ID_jelo", referencedColumnName = "ID_jelo")
    @ManyToOne(optional = false)
    private Jela jelaIDjelo;
    @JoinColumn(name = "narudzbine_id_narudzbina", referencedColumnName = "id_narudzbina")
    @ManyToOne(optional = false)
    private Narudzbine narudzbineIdNarudzbina;

    public DetaljiNarudzbina() {
    }

    public DetaljiNarudzbina(Integer iDdetaljinarudzbine) {
        this.iDdetaljinarudzbine = iDdetaljinarudzbine;
    }

    public DetaljiNarudzbina(Integer iDdetaljinarudzbine, int kolicina) {
        this.iDdetaljinarudzbine = iDdetaljinarudzbine;
        this.kolicina = kolicina;
    }

    public Integer getIDdetaljinarudzbine() {
        return iDdetaljinarudzbine;
    }

    public void setIDdetaljinarudzbine(Integer iDdetaljinarudzbine) {
        this.iDdetaljinarudzbine = iDdetaljinarudzbine;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public Jela getJelaIDjelo() {
        return jelaIDjelo;
    }

    public void setJelaIDjelo(Jela jelaIDjelo) {
        this.jelaIDjelo = jelaIDjelo;
    }

    public Narudzbine getNarudzbineIdNarudzbina() {
        return narudzbineIdNarudzbina;
    }

    public void setNarudzbineIdNarudzbina(Narudzbine narudzbineIdNarudzbina) {
        this.narudzbineIdNarudzbina = narudzbineIdNarudzbina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDdetaljinarudzbine != null ? iDdetaljinarudzbine.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetaljiNarudzbina)) {
            return false;
        }
        DetaljiNarudzbina other = (DetaljiNarudzbina) object;
        if ((this.iDdetaljinarudzbine == null && other.iDdetaljinarudzbine != null) || (this.iDdetaljinarudzbine != null && !this.iDdetaljinarudzbine.equals(other.iDdetaljinarudzbine))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.DetaljiNarudzbina[ iDdetaljinarudzbine=" + iDdetaljinarudzbine + " ]";
    }
    
}
