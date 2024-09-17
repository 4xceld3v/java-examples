package com.axceldev.banca_electronica.helper;
import java.util.Comparator;
import com.axceldev.banca_electronica.domain.Cliente;

public class OrdenamientoClientes implements Comparator<Cliente> {

    @Override
    public int compare(Cliente cliente1, Cliente cliente2) {
        return cliente1.getNumero() - cliente2.getNumero();
    }

    // return cliente1.getNumero() - cliente2.getNumero(); --> Menor a mayor
    // return cliente2.getNumero() - cliente1.getNumero(); --> Mayor a menor
    
}
