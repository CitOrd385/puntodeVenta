/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author david
 */
public abstract class BaseDAO<T> {
    
    protected EntityManager getEntityManager(){
    
      try{
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("PuntoDeVentaPU");
        //Crea el entityManager real
        EntityManager em= emf.createEntityManager();
        return em;
      }catch(Exception ex){
          throw ex;
      }
      
  } 
    
    public abstract void agregar(T entidad);
    public abstract ArrayList<T> consultar();
    public abstract T constultarPorId(Integer id);
    public abstract void actualizar (T entidad);
    public abstract void eliminar (T entidad);
    public abstract ArrayList<T> buscar(String nombre);
    
}
