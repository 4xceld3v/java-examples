package com.axceldev.banca_electronica;

import java.util.List;

import com.axceldev.banca_electronica.domain.Banco;
import com.axceldev.banca_electronica.domain.Cliente;
import com.axceldev.banca_electronica.domain.Cuenta;
import com.axceldev.banca_electronica.domain.CuentaAhorro;
import com.axceldev.banca_electronica.domain.CuentaCheque;
import com.axceldev.banca_electronica.domain.Domicilio;
import com.axceldev.banca_electronica.interfaces.ServicioClientes;
import com.axceldev.banca_electronica.interfaces.ServicioCuentas;
import com.axceldev.banca_electronica.interfaces.impl.ServicioClientesImpl;
import com.axceldev.banca_electronica.interfaces.impl.ServicioCuentasImpl;

public class MainCapSeven {

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

        // Imprimir el Banco
        System.out.println("Información Banco");
        System.out.println(banco.getNombre());

       //Imprimir cliente
       List<Cliente> clientes = servicioClientes.obtenerClientes();

       clientes.stream()
       .filter(cliente -> cliente.getNumero() == 1)
       .forEach(cliente -> {
           System.out.println("Información Cliente");
           System.out.println(cliente.getNombre());
           System.out.println(cliente.getRfc());
           System.out.println(cliente.getTelefono());
           System.out.println(cliente.getFechaNacimiento());
       });

       List<Cuenta> cuentas = servicioCuentas.obtenerCuentas();

       cuentas.stream().filter(cuenta -> cuenta.getNumero() == 12)
       .forEach(cuenta -> {
           System.out.println("Información Cuenta Ahorro");
           System.out.println(cuenta.getSaldo());
           System.out.println(((CuentaAhorro) cuenta).getNumero());
           System.out.println(((CuentaAhorro) cuenta).getSaldo());
       });



    }
}


