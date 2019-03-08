/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Narudzbine;

/**
 *
 * @author Grupa1
 */
@Stateless
public class NarudzbineFacade extends AbstractFacade<Narudzbine> {

    @PersistenceContext(unitName = "navbarPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NarudzbineFacade() {
        super(Narudzbine.class);
    }
    
}
