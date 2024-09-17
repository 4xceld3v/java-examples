package com.axceldev.banca_electronica.interfaces;

import java.util.ArrayList;
import com.axceldev.banca_electronica.domain.Cliente;

public interface ServicioClientes {

    public boolean agregarCliente(Cliente cliente);
    
    public boolean eliminarCliente(int id);
    
    public Cliente consultarCliente(int id);
    
    public ArrayList<Cliente> obtenerClientes();

    public Cliente buscarClientePorRFC(String rfc);
}
