/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Korisnici;

/**
 *
 * @author Grupa1
 */
@Stateless
public class KorisniciFacade extends AbstractFacade<Korisnici> {

    @PersistenceContext(unitName = "navbarPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public KorisniciFacade() {
        super(Korisnici.class);
    }

    @Override
    public List<Korisnici> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Korisnici find(Object id) {
        return super.find(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Korisnici entity) {
        super.remove(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Korisnici entity) {
        super.edit(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(Korisnici entity) {
        super.create(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
}
