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
public class ClienteDAO extends BaseDAO<Cliente> {

    @Override
    public void agregar(Cliente entidad) {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        em.persist(entidad);
        System.out.println("Se guardó el cliente");
        em.getTransaction().commit();

    }

    @Override
    public ArrayList<Cliente> consultar() {
        EntityManager em = this.getEntityManager();

        Query consulta = em.createQuery("SELECT C FROM Cliente c ");
        em.getTransaction().begin();

        List<Cliente> clientes = consulta.getResultList();

        for (Cliente clientes1 : clientes) {
            System.out.println(clientes1);
        }

        return new ArrayList<>(clientes);

    }

    @Override
    public Cliente constultarPorId(Integer id) {
        EntityManager em = this.getEntityManager();

        em.getTransaction().begin();
        em.getTransaction().commit();

        return em.find(Cliente.class, id);
    }

    @Override
    public void actualizar(Cliente cliente) {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();

        Cliente clienteX = em.find(Cliente.class, cliente.getId());
        if (clienteX != null) {
            clienteX.setNombre(cliente.getNombre());
            clienteX.setDireccion(cliente.getDireccion());
            clienteX.setRfc(cliente.getRfc());
            clienteX.setTelefono(cliente.getTelefono());
            em.persist(clienteX);
        } else {
            throw new IllegalArgumentException("El cliente no existe");
        }
        em.getTransaction().commit();
        System.out.println("El ciente fue actualizado");
    }

    @Override
    public void eliminar(Integer id) {
        EntityManager em = this.getEntityManager();

        em.getTransaction().begin();
        Cliente clienteX = em.find(Cliente.class, id);
        if (clienteX != null) {
            em.remove(clienteX);
        } else {
            throw new IllegalArgumentException("El cliente no existe");
        }

        em.getTransaction().commit();
        System.out.println("El cliente fue eliminado");
    }

    @Override
    public ArrayList<Cliente> buscar(String nombre) {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        List<Cliente> clientes;
        if (!nombre.equals("")) {
            String jpql = String.format("SELECT * FROM puntodeventa.clientes WHERE puntodeventa.clientes.nombre LIKE '%%"+nombre+"%%'");
            clientes = em.createNativeQuery(jpql, Cliente.class).getResultList();
        } else {
            String jpql = "SELECT * FROM puntodeventa.clientes;";
            clientes = em.createNativeQuery(jpql, Cliente.class).getResultList();
        }
        em.getTransaction().commit();

        return new ArrayList<>(clientes);
    }
    
    
}
