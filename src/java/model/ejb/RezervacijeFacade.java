/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Rezervacije;

/**
 *
 * @author Grupa1
 */
@Stateless
public class RezervacijeFacade extends AbstractFacade<Rezervacije> {

    @PersistenceContext(unitName = "navbarPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RezervacijeFacade() {
        super(Rezervacije.class);
    }
    
}
