/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Citlali Orduño, David Valdez
 */
@Entity
@Table(name="ventas")
public class Venta implements Serializable {

    
    @Id
    @Column(name="idVenta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="descuento", nullable= false)
    private float descuento;
    
    @Column(name="fecha")
    @Temporal(TemporalType.DATE)
    private Calendar fecha;
    
    @Column(name="montoTotal")
    private float montoTotal;

    @ManyToOne(optional= false)
    @JoinColumn(name="idCliente")
    private Cliente cliente;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy= "venta")
    private List<RelProductoVentas> productos;

    public Venta() {
        productos= new ArrayList<>();
    }

    public Venta(float descuento, Calendar fecha, float montoTotal, Cliente cliente) {
        this.descuento = descuento;
        this.fecha = fecha;
        this.montoTotal = montoTotal;
        this.cliente = cliente;
    }

    public Venta(Integer id, float descuento, Calendar fecha, float montoTotal, Cliente cliente) {
        this.id = id;
        this.descuento = descuento;
        this.fecha = fecha;
        this.montoTotal = montoTotal;
        this.cliente = cliente;
    }

    
    
    public Venta(float descuento, Calendar fecha, float montoTotal, Cliente cliente, List<RelProductoVentas> productos) {
        this.descuento = descuento;
        this.fecha = fecha;
        this.montoTotal = montoTotal;
        this.cliente = cliente;
        this.productos = productos;
    }

    public Venta(Integer id, float descuento, Calendar fecha, float montoTotal, Cliente cliente, List<RelProductoVentas> productos) {
        this.id = id;
        this.descuento = descuento;
        this.fecha = fecha;
        this.montoTotal = montoTotal;
        this.cliente = cliente;
        this.productos = productos;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<RelProductoVentas> getProductos() {
        return productos;
    }

    public void setProductos(List<RelProductoVentas> productos) {
        this.productos = productos;
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
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Venta{" + "id= " + id + ", descuento= " + descuento +
                ", fecha= " + fecha + ", montoTotal= " + montoTotal + 
                ", cliente= " + cliente + ", productos= " + productos + '}';
    }

    
    
}
