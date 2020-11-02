/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import objetosNegocio.RelProductoVentas;

/**
 *
 * @author Citlali Orduño
 */
public class RelProductoVentasDAO extends BaseDAO<RelProductoVentas>{
    
     EntityManagerFactory emf = Persistence.createEntityManagerFactory("PuntoDeVentaPU");
     EntityManager em = emf.createEntityManager();
    
    @Override
    public void agregar(RelProductoVentas relacion) {
        EntityManager em = this.getEntityManager();

        em.getTransaction().begin();
        em.persist(relacion);
        em.getTransaction().commit();
        System.out.println("La relacion se ha insertado");
    }

    @Override
    public ArrayList<RelProductoVentas> consultar() {
        EntityManager em = this.getEntityManager();

        em.getTransaction().begin();

        Query consulta = em.createQuery("SELECT R FROM RelProductoVentas r ");
        List<RelProductoVentas> relpvs = consulta.getResultList();

        for (RelProductoVentas relpvs1 : relpvs) {
            System.out.println(relpvs1);
        }

        return new ArrayList<>(relpvs);
    }

    @Override
    public RelProductoVentas constultarPorId(Integer id) {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        em.getTransaction().commit();
        return em.find(RelProductoVentas.class, id);
    }

    @Override
    public void actualizar(RelProductoVentas relProductoVenta) {
        EntityManager em = this.getEntityManager();

         RelProductoVentas relprodVen = em.find(RelProductoVentas.class, relProductoVenta.getId());

         if(relprodVen != null){
             relprodVen.setCantidad(relProductoVenta.getCantidad());
             relprodVen.setImporte(relProductoVenta.getImporte());
             relprodVen.setPrecio(relProductoVenta.getPrecio());
             relprodVen.setProducto(relProductoVenta.getProducto());
             relprodVen.setVenta(relProductoVenta.getVenta());
             em.persist(relprodVen);
         }else{
             throw new IllegalArgumentException("No existe la relación");
         }
          em.getTransaction().commit();
          System.out.println("La relación se ha actualizado");
    }

    @Override
    public void eliminar(Integer id) {
        EntityManager em = this.getEntityManager();

        em.getTransaction().begin();
            RelProductoVentas relProdVenX = em.find(RelProductoVentas.class, id);
        if (relProdVenX != null) {
            em.remove(relProdVenX);
        } else {
            throw new IllegalArgumentException("la relación no existe");
        }

        em.getTransaction().commit();
        System.out.println("La relación fue eliminada");
    }

    @Override
    public ArrayList<RelProductoVentas> buscar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
