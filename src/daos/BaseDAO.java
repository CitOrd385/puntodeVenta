/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public abstract class BaseDAO<T> {
    
    public abstract void agregar(T entidad);
    public abstract ArrayList<T> consultar();
    public abstract T constultarPorId(Integer id);
    public abstract void actualizar (T entidad);
    public abstract void eliminar (T entidad);
    public abstract ArrayList<T> buscar(String nombre);
    
}
