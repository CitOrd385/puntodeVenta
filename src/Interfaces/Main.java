/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import daos.ClienteDAO;
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
       
       Cliente cliente = new Cliente("Jazmin Gaxiola","Modulo deportivo", "JGSA021493", "6442639845");
       
       clientedao.agregar(cliente);
       
       clientedao.consultar();
       
    }
    
}
