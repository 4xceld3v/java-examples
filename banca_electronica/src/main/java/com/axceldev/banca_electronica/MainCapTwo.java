package com.axceldev.banca_electronica;

import com.axceldev.banca_electronica.domain.Banco;
import com.axceldev.banca_electronica.domain.Cliente;
import com.axceldev.banca_electronica.domain.CuentaAhorro;
import com.axceldev.banca_electronica.domain.CuentaCheque;
import com.axceldev.banca_electronica.domain.Domicilio;
import com.axceldev.banca_electronica.interfaces.ServicioClientes;
import com.axceldev.banca_electronica.interfaces.ServicioCuentas;
import com.axceldev.banca_electronica.interfaces.impl.ServicioClientesImpl;
import com.axceldev.banca_electronica.interfaces.impl.ServicioCuentasImpl;

public class MainCapTwo {

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

        // Consultar el cliente
        Cliente cliente = servicioClientes.consultarCliente(1);
        System.out.printf("Información Clientes del Banco %s", banco.getNombre());
        System.out.println(cliente);

        // Imprimir la cuentas del cliente
        System.out.printf("Información Cuentas del Cliente %s", cliente.getNombre());
        servicioCuentas.obtenerCuentas().forEach(System.out::println);

        // Abonar la cuenta de ahorro
        servicioCuentas.abonar(12, 100.0);

        // Retirar de la cuenta de ahorro
        servicioCuentas.retirar(12, 50.0);

        // Imprimir saldo de la cuenta de ahorro
        System.out.println("Saldo de la cuenta de ahorro");
        System.out.println(servicioCuentas.consultarSaldoCuenta(12));

        // Cancelar la cuenta de ahorro
        servicioCuentas.CancelarCuenta(12);
    

        // Abonar la cuenta de cheque
        servicioCuentas.abonar(13, 100.0);

        // Retirar de la cuenta de cheque
        servicioCuentas.retirar(13, 70.0);

        // Imprimir saldo de la cuenta de cheque
        System.out.println("Saldo de la cuenta de cheque");
        System.out.println(servicioCuentas.consultarSaldoCuenta(13));

        // Cancelar la cuenta de cheque
        servicioCuentas.CancelarCuenta(13);


        // Eliminar el cliente del banco
        servicioClientes.eliminarCliente(1);



    }
}


