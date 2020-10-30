/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import objetosNegocio.RelProductoVentas;

/**
 *
 * @author Citlali Orduño
 */
public class RelProductoVentasDAO {
    
     EntityManagerFactory emf = Persistence.createEntityManagerFactory("PuntoDeVentaPU");
     EntityManager em = emf.createEntityManager();
    
    public void insertarRelacion(RelProductoVentas relacion) {
       
        em.getTransaction().begin();

        em.persist(relacion);
        em.getTransaction().commit();
        System.out.println("La relacion se ha insertado");
    }
}
