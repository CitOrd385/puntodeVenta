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

import objetosNegocio.Producto;

/**
 *
 * @author Citlali Orduño
 */
public class ProductoDAO extends BaseDAO<Producto> {

    @Override
    public void agregar(Producto produto) {
        EntityManager em= this.getEntityManager();
        em.getTransaction().begin();
        em.persist(produto);
        System.out.println("Se agregó correctamente el producto");
        em.getTransaction().commit();
    }

    @Override
    public ArrayList<Producto> consultar() {
        EntityManager em = this.getEntityManager();

        Query consulta = em.createQuery("SELECT P FROM Producto p ");
        em.getTransaction().begin();

        List<Producto> productos = consulta.getResultList();

        for (Producto productos1 : productos) {
            System.out.println(productos1);
        }
        em.getTransaction().commit();
        return new ArrayList<>(productos);
    }

    @Override
    public Producto constultarPorId(Integer id) {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        em.getTransaction().commit();
        return em.find(Producto.class, id);
    }

    @Override
    public void actualizar(Producto producto) {
       EntityManager em = this.getEntityManager();
       
       Producto productoX= em.find(Producto.class, producto.getId());
       if(productoX != null ){
           productoX.setNombre(producto.getNombre());
           productoX.setPrecioActual(producto.getPrecioActual());
           productoX.setStock(producto.getStock());
            em.persist(productoX);
       }else{
            throw new IllegalArgumentException("El cliente no existe");
       }
        em.getTransaction().commit();
        System.out.println("El producto se actualizó ");
    }

    @Override
    public void eliminar(Integer id) {
        EntityManager em = this.getEntityManager();

        em.getTransaction().begin();
        Producto productoX = em.find(Producto.class, id);
        if (productoX != null) {
            em.remove(id);
        } else {
            throw new IllegalArgumentException("El cliente no existe");
        }

        em.getTransaction().commit();
        System.out.println("El cliente fue eliminado");
    }

    @Override
    public ArrayList<Producto> buscar(String nombre) {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        List<Producto> productos;
        if (!nombre.equals("")) {
            String jpql = String.format("SELECT * FROM puntodeventa.productos WHERE puntodeventa.productos.nombre LIKE '%%"+nombre+"%%'");
            productos = em.createNativeQuery(jpql, Producto.class).getResultList();
        } else {
            String jpql = "SELECT * FROM puntodeventa.productos;";
            productos = em.createNativeQuery(jpql, Producto.class).getResultList();
        }
        em.getTransaction().commit();

        return new ArrayList<>(productos);
    }
    
}
