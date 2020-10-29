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
import objetosNegocio.Venta;

/**
 *
 * @author Citlali Orduño
 */
public class VentaDAO extends BaseDAO<Venta>{

    @Override
    public void agregar(Venta venta) {
        EntityManager em= this.getEntityManager();
        em.getTransaction().begin();
        em.persist(venta);
        
        
    }

    @Override
    public ArrayList<Venta> consultar() {
       EntityManager em= this.getEntityManager();
       em.getTransaction().begin();
       
       Query consulta = em.createQuery("SELECT P FROM Producto p ");
        em.getTransaction().begin();

        List<Venta> ventas= consulta.getResultList();

        for (Venta ventas1 : ventas) {
            System.out.println(ventas1);
        }

        return new ArrayList<>(ventas);
    }

    @Override
    public Venta constultarPorId(Integer id) {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        em.getTransaction().commit();
        return em.find(Venta.class, id);
    }

    @Override
    public void actualizar(Venta venta) {
         EntityManager em = this.getEntityManager();
         
         Venta ventaX= em.find(Venta.class, venta);
         
         if(ventaX != null){
             ventaX.setFecha(venta.getFecha());
             ventaX.setCliente(venta.getCliente());
             ventaX.setDescuento(venta.getDescuento());
             ventaX.setMontoTotal(venta.getMontoTotal());
             ventaX.setProductos(venta.getProductos());
             em.persist(ventaX);  
         }else{
             throw new IllegalArgumentException("El cliente no existe");
         }
          em.getTransaction().commit();
          System.out.println("La venta se ha actualizado");
         
         
    }

    @Override
    public void eliminar(Integer id) {
        EntityManager em = this.getEntityManager();

        em.getTransaction().begin();
            Venta ventaX = em.find(Venta.class, id);
        if (ventaX != null) {
            em.remove(ventaX);
        } else {
            throw new IllegalArgumentException("la venta no existe");
        }

        em.getTransaction().commit();
        System.out.println("La venta fue eliminada");
    }

    @Override
    public ArrayList<Venta> buscar(String nombre) {
         EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        
        List<Venta> ventas;
        if (!nombre.equals("")) {
            String jpql = String.format("SELECT * FROM puntodeventa.ventas WHERE puntodeventa.ventas.nombre = '%s';", nombre);
            ventas = em.createNativeQuery(jpql, Venta.class).getResultList();
        } else {
            String jpql = "SELECT * FROM puntodeventa.ventas;";
            ventas = em.createNativeQuery(jpql, Venta.class).getResultList();
        }
        em.getTransaction().commit();

        return new ArrayList<>(ventas);
    }
    
    public List<Venta> consultarVentasPorRango(String fechaInicio, String fechaFin, Integer id) {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();

        List<Venta> ventas;
        if (id > -1) {
            String jpql = String.format("SELECT * FROM punto_venta.ventas WHERE punto_venta.ventas.fecha >= '%s' and punto_venta.ventas.fecha <= '%s'"
                    + " and punto_venta.ventas.idCliente = %d ;", fechaInicio, fechaFin, id);
            ventas = em.createNativeQuery(jpql, Venta.class).getResultList();
        } else {
            String jpql = String.format("SELECT * FROM punto_venta.ventas WHERE punto_venta.ventas.fecha >= '%s' and punto_venta.ventas.fecha <= '%s';", fechaInicio, fechaFin, id);
            ventas = em.createNativeQuery(jpql, Venta.class).getResultList();
        }
        em.getTransaction().commit();
        return ventas;

    }
    
}
