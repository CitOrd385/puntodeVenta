/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;


import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import objetosNegocio.Venta;
/**
 *
 * @author Citlali Orduño, David Valdez
 */
@Entity
@Table(name="clientes")
public class Cliente implements Serializable {

   
    @Id
    @Column(name="idCliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="nombre", nullable= false, length= 20)
    private String nombre;
    
    @Column(name="direccion", length=50)
    private String direccion;
    
    @Column(name= "rfc", unique= true, nullable= false, length= 10)
    private String rfc;
    
    @Column(name="telefono", length= 15)
    private String telefono;
    
    @OneToMany(cascade= CascadeType.ALL, mappedBy= "cliente") 
    private List<Venta> ventas;

    
    public Cliente() {
    }

    public Cliente(Integer id,String nombre, String direccion, String rfc, String telefono) {
        this.id = id;
        this.direccion = direccion;
        this.nombre = nombre;
        this.rfc = rfc;
        this.telefono = telefono;
    }

    
    public Cliente(String nombre, String direccion, String rfc, String telefono) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.rfc = rfc;
        this.telefono = telefono;
    }
    
    

    public Cliente(String nombre, String direccion,String rfc, String telefono, List<Venta> ventas) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.rfc = rfc;
        this.telefono = telefono;
        this.ventas = ventas;
    }

    public Cliente(Integer id, String nombre,String direccion, String rfc, String telefono, List<Venta> ventas) {
        this.id = id;
        this.direccion = direccion;
        this.nombre = nombre;
        this.rfc = rfc;
        this.telefono = telefono;
        this.ventas = ventas;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id= " + id + ", direccion= " + direccion + 
                ", nombre= " + nombre + ", rfc= " + rfc + ", telefono= " 
                + telefono + ", ventas= " + ventas + '}';
    }

    

   
    
}
