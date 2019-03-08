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
import model.Jela;

/**
 *
 * @author Grupa1
 */
@Stateless
public class JelaFacade extends AbstractFacade<Jela> {

    @PersistenceContext(unitName = "navbarPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JelaFacade() {
        super(Jela.class);
    }

    @Override
    public List<Jela> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Jela find(Object id) {
        return super.find(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Jela entity) {
        super.remove(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Jela entity) {
        super.edit(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(Jela entity) {
        super.create(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
}
