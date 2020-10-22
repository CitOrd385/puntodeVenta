/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Citlali Orduño
 */
@Entity
@Table(name="relProductoVentas")
public class RelProductoVentas implements Serializable {

    
    @Id
    @Column(name="idRelProductoVenta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne(optional= false)
    @JoinColumn(name = "idProducto", nullable = false)
    private Producto producto;
    
    @ManyToOne(optional= false)
    private Venta venta;
    
    
    @Column(name="cantidad", length =11, nullable= false)
    private Integer cantidad;
    
    @Column(name="precio", nullable= false)
    private float precio;
    
    @Column(name="montoTotal", nullable= false)
    private float importe;

    
    
    public RelProductoVentas() {
    }

    public RelProductoVentas(Producto producto, Venta venta, Integer cantidad, float precio, float importe) {
        this.producto = producto;
        this.venta = venta;
        this.cantidad = cantidad;
        this.precio = precio;
        this.importe = importe;
    }

    public RelProductoVentas(Integer id, Producto producto, Venta venta, Integer cantidad, float precio, float importe) {
        this.id = id;
        this.producto = producto;
        this.venta = venta;
        this.cantidad = cantidad;
        this.precio = precio;
        this.importe = importe;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
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
        if (!(object instanceof RelProductoVentas)) {
            return false;
        }
        RelProductoVentas other = (RelProductoVentas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RelProductoVentas{" + "id= " + id + ", producto= " + producto +
                ", venta= " + venta + ", cantidad=" + cantidad + ", precio= " 
                + precio + ", importe= " + importe + '}';
    }

    
    
}
