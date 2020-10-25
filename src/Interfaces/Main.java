/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import daos.ClienteDAO;
import java.util.Calendar;
import java.util.GregorianCalendar;
import objetosNegocio.Cliente;
import objetosNegocio.Producto;
import objetosNegocio.Venta;

/**
 *
 * @author Citlali Orduño
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ClienteDAO clientedao = new ClienteDAO();
       
       Cliente cliente = new Cliente("Maribel S.","Villa ITSON 1035", "DVAV041434", "6443264762");
       
       
       Calendar fecha= new GregorianCalendar();
       //Venta venta = new Venta(20, fecha, 230, cliente);
       
       //clientedao.agregar(cliente);
       
       
       
      // clientedao.consultar();
       
     // Cliente clientecito= clientedao.constultarPorId(1);
       // System.out.println(clientecito);
    }
    
    
}
