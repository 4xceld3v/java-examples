package com.axceldev.banca_electronica.interfaces.impl;

import com.axceldev.banca_electronica.domain.Cliente;
import com.axceldev.banca_electronica.interfaces.ServicioClientes;
import java.util.ArrayList;
import com.axceldev.banca_electronica.domain.Banco;

public class ServicioClientesImpl implements ServicioClientes {

    private Banco banco;

    public ServicioClientesImpl(Banco banco) {
        this.banco = banco;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {

        ArrayList<Cliente> clientes = banco.getClientes();

        clientes.add(cliente);

        banco.setClientes(clientes);

        return banco.getClientes().contains(cliente);
    }

    @Override
    public boolean eliminarCliente(int id) {

        ArrayList<Cliente> clientes = banco.getClientes();

        for (Cliente cliente : clientes) {
            if (cliente.getNumero() == id) {
                clientes.remove(cliente);
                return true;
            }
        }

        return false;
    }

    @Override
    public Cliente consultarCliente(int id) {
            
        ArrayList<Cliente> clientes = banco.getClientes();

        for (Cliente cliente : clientes) {
            if (cliente.getNumero() == id) {
                return cliente;
            }
        }

        return null;
    }

    @Override
    public ArrayList<Cliente> obtenerClientes() {
        return banco.getClientes();
    }

    @Override
    public Cliente buscarClientePorRFC(String rfc) {
        ArrayList<Cliente> clientes = banco.getClientes();

        for (Cliente cliente : clientes) {
            if (cliente.getRfc().equals(rfc)) {
                return cliente;
            }
        }

        return null;
    }
    
}
