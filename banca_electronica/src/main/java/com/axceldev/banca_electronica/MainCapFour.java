package com.axceldev.banca_electronica;

import com.axceldev.banca_electronica.domain.ClienteBuilder;
import com.axceldev.banca_electronica.domain.Domicilio;

public class MainCapFour {

    public static void main(String[] args) {

        // Crear un objeto de la clase Domicilio para el cliente

        Domicilio domicilioCliente = new Domicilio(
            "Calle 2",
            "Ciudad 2",
            "Colonia 2",
            "Estado 2",
            54321
        );

        // Crear un objeto de la clase Cliente
        ClienteBuilder clienteBuilder = new ClienteBuilder.Builder()
            .setNumero(1)
            .setNombre("Juan Pérez")
            .setDomicilio(domicilioCliente)
            .setRfc("RFC123456")
            .setTelefono("1234567890")
            .setFechaNacimiento("01/01/1990").build();

        System.out.println(clienteBuilder.getNombre());

    }
}


