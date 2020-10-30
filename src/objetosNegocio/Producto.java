/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Citlali Orduño
 */
@Entity
@Table(name="productos")
public class Producto implements Serializable {

    @Id
    @Column(name="idProducto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;
    
    @Column(name = "precioActual", nullable= false)
    private float precioActual;
    
    @Column(name = "stock", nullable= false, length= 11)
    private Integer stock;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    private List<RelProductoVentas> ventas;

    

    public Producto() {
      this.ventas = new ArrayList<>();
    }

    public Producto(String nombre, float precioActual, Integer stock) {
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.stock = stock;
       
    }

    public Producto(Integer id, String nombre, float precioActual, Integer stock) {
        this.id = id;
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.stock = stock;
        
    }

    public Producto(String nombre, float precioActual, Integer stock, List<RelProductoVentas> ventas) {
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.stock = stock;
        this.ventas = ventas;
    }

    public Producto(Integer id, String nombre, float precioActual, Integer stock, List<RelProductoVentas> ventas) {
        this.id = id;
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.stock = stock;
        this.ventas = ventas;
    }
    
    
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(float precioActual) {
        this.precioActual = precioActual;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

   
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " " +nombre+ " ";
    }

   
    
}
