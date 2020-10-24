/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import objetosNegocio.Cliente;

/**
 *
 * @author Citlali Orduño, David Valdez
 */
public class ClienteDAO extends BaseDAO<Cliente>{

    @Override
    public void agregar(Cliente entidad) {
        EntityManager em= this.getEntityManager();
        em.getTransaction().begin();
        em.persist(entidad);
        System.out.println("Se guardó el cliente");
        em.getTransaction().commit();
        
    }

    @Override
    public ArrayList<Cliente> consultar() {
        EntityManager em= this.getEntityManager();
     
        
         Query consulta= em.createQuery("SELECT C FROM Cliente c ");
        em.getTransaction().begin();

        List<Cliente> clientes = consulta.getResultList();
        
        
        for (Cliente clientes1 : clientes) {
            System.out.println(clientes1);
        }
        
        return new ArrayList<>(clientes);
  
    }

    @Override
    public Cliente constultarPorId(Integer id) {
        EntityManager em= this.getEntityManager();

        em.getTransaction().begin();
        em.getTransaction().commit();

        return em.find(Cliente.class, id);
    }

    @Override
    public void actualizar(Cliente entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Cliente entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> buscar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
