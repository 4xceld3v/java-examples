package com.axceldev.banca_electronica;

import java.util.ArrayList;

import com.axceldev.banca_electronica.domain.Banco;
import com.axceldev.banca_electronica.domain.Cliente;
import com.axceldev.banca_electronica.domain.Cuenta;
import com.axceldev.banca_electronica.domain.CuentaAhorro;
import com.axceldev.banca_electronica.domain.CuentaCheque;
import com.axceldev.banca_electronica.domain.Domicilio;

public class MainCapOne {
    public static void main(String[] args) {

        // Crear un objeto de la clase Domicilio para el banco y el cliente

        Domicilio domicilioBanco = new Domicilio(
            "Calle 1",
            "Ciudad 1",
            "Colonia 1",
            "Estado 1",
            12345
        );

        Domicilio domicilioCliente = new Domicilio(
            "Calle 2",
            "Ciudad 2",
            "Colonia 2",
            "Estado 2",
            54321
        );

        // Crear un objeto de la clase Banco
        Banco banco = new Banco(
            "Banco de la República",
            domicilioBanco,
            "1234567890",
            "1234567890"
        );


        // Crear un objeto de la clase Cliente
        Cliente cliente1 = new Cliente(
            1,
            "Juan Pérez",
            domicilioCliente,
            "RFC123456",
            "1234567890",
            "01/01/1990"
        );

        // Asociar el cliente con el banco
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        banco.setClientes(clientes);

        // Crear un objeto de la clase Cuenta Ahorro
        CuentaAhorro cuentaAhorro = new CuentaAhorro(
            12,
            1000.0,
            1.5
        );

        // Crear un objeto de la clase Cuenta Cheque
        CuentaCheque cuentaCheque = new CuentaCheque(
            13,
            2000.0,
            100.0
        );

        // Asociar la cuenta de ahorro y cheque con el cliente
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        cuentas.add(cuentaAhorro);
        cuentas.add(cuentaCheque);
        cliente1.setCuentas(cuentas);

        // Imprimir el Banco
        System.out.println("Información Banco");
        System.out.println(banco);

        // Imprimir el cliente
        System.out.println("Información Cliente");
        System.out.println(cliente1);

        // Imprimir la cuentas del cliente
        System.out.println("Información Cuentas del Cliente");
        System.out.println(cliente1.getCuentas());

    }
}


