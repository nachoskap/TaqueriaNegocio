/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DTO.ClienteDTO;
import DTO.PedidoDTO;
import DTO.PersonaDTO;

import Interfaz.IPersistencia;
import Persistencia.Persistencia;
import PersistenciaMapa.PersistenciaMapa;


import java.awt.List;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author *
 */
public class Control {

    IPersistencia persistencia;
    PersistenciaMapa map=new PersistenciaMapa();
  

    public void crear(PersonaDTO dto) {
        persistencia = new Persistencia();
        try {
            persistencia.crear((ClienteDTO) dto);
        } catch (SQLException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ClienteDTO buscar(PersonaDTO dto) {
        persistencia = new Persistencia();
        try {
            return persistencia.leer((ClienteDTO) dto);
        } catch (SQLException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void actualizar(PersonaDTO dto) {
        persistencia = new Persistencia();
        try {
            persistencia.actualiza((ClienteDTO) dto);
        } catch (SQLException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(PersonaDTO dto) {
        persistencia = new Persistencia();
        try {
            persistencia.elimina((ClienteDTO) dto);
        } catch (SQLException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<ClienteDTO> listarClientes() {
        persistencia = new Persistencia();
        try {
            return  persistencia.listarClientes();
        } catch (SQLException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
//    
//    public List listarRepartidores() {
//        
//    }

    public void crear(PedidoDTO pedido) {
        persistencia = new Persistencia();
        PedidoDTO pdido = new PedidoDTO(pedido.getOrden(), pedido.getCliente(), pedido.getRepartidor());
    }

    public void buscar(PedidoDTO pedido) {
        persistencia = new Persistencia();
    }

    public void actualizar(PedidoDTO pedido) {
        persistencia = new Persistencia();
    }

    public void eliminar(PedidoDTO pedido) {
        persistencia = new Persistencia();
    }

//    public List listarPedidos(Lapso????) {
//        
//    }

    public void ConsultarUbicacion(String[] args, String direccion){
     map.ConsultarUbicacion(args, direccion);
    }

}