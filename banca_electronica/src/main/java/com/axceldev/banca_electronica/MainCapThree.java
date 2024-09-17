package com.axceldev.banca_electronica;

import java.util.Set;
import java.util.TreeSet;

import com.axceldev.banca_electronica.domain.Banco;
import com.axceldev.banca_electronica.domain.Cliente;
import com.axceldev.banca_electronica.domain.CuentaAhorro;
import com.axceldev.banca_electronica.domain.CuentaCheque;
import com.axceldev.banca_electronica.domain.Domicilio;
import com.axceldev.banca_electronica.helper.OrdenamientoClientes;
import com.axceldev.banca_electronica.helper.OrdenamientoCuentas;
import com.axceldev.banca_electronica.interfaces.ServicioClientes;
import com.axceldev.banca_electronica.interfaces.ServicioCuentas;
import com.axceldev.banca_electronica.interfaces.impl.ServicioClientesImpl;
import com.axceldev.banca_electronica.interfaces.impl.ServicioCuentasImpl;

public class MainCapThree {

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

        // Crear un objeto de la clase ServicioClientes
        ServicioClientes servicioClientes = new ServicioClientesImpl(banco);


        // Crear un objeto de la clase Cliente
        Cliente cliente1 = new Cliente(
            1,
            "Juan Pérez",
            domicilioCliente,
            "RFC123456",
            "1234567890",
            "01/01/1990"
        );

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

        // Crear un objeto de la clase ServicioCuentas
        ServicioCuentas servicioCuentas = new ServicioCuentasImpl(cliente1);

        // Agregar el cliente al banco
        servicioClientes.agregarCliente(cliente1);

        // Agregar la cuenta de ahorro al cliente
        servicioCuentas.agregarCuenta(cuentaAhorro);

        // Agregar la cuenta de cheque al cliente
        servicioCuentas.agregarCuenta(cuentaCheque);

        OrdenamientoCuentas ordenamientoCuentas = new OrdenamientoCuentas();

        Set<CuentaAhorro> cuentasAhorro = new TreeSet<>(ordenamientoCuentas);

        cuentasAhorro.add(new CuentaAhorro(
            12,
            1000.0,
            1.5
        ));

        cuentasAhorro.add(new CuentaAhorro(
            14,
            2000.0,
            1.5
        ));

        cuentasAhorro.add(new CuentaAhorro(
            13,
            3000.0,
            1.5
        ));

        System.out.println("Cuentas de ahorro ordenadas por saldo");
        for (CuentaAhorro cuentaAhorro1 : cuentasAhorro) {
            System.out.println(cuentaAhorro1);
        }

        OrdenamientoClientes ordenamientoClientes = new OrdenamientoClientes();

        Set<Cliente> clientes = new TreeSet<>(ordenamientoClientes);

        clientes.add(new Cliente(
            1,
            "Juan Pérez",
            domicilioCliente,
            "RFC123456",
            "1234567890",
            "01/01/1990"
        ));

        clientes.add(new Cliente(
            2,
            "María López",
            domicilioCliente,
            "RFC123456",
            "1234567890",
            "01/01/1990"
        ));

        clientes.add(new Cliente(
            3,
            "Pedro Ramírez",
            domicilioCliente,
            "RFC123456",
            "1234567890",
            "01/01/1990"
        ));

        System.out.println("Clientes ordenados por número");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }







    }
}


