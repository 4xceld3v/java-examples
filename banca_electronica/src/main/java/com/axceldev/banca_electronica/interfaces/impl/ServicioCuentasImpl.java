package com.axceldev.banca_electronica.interfaces.impl;

import java.util.ArrayList;

import com.axceldev.banca_electronica.domain.Cliente;
import com.axceldev.banca_electronica.domain.Cuenta;
import com.axceldev.banca_electronica.interfaces.ServicioCuentas;

public class ServicioCuentasImpl implements ServicioCuentas {

    private Cliente cliente;

    public ServicioCuentasImpl(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean agregarCuenta(Cuenta cuenta) {

        ArrayList<Cuenta> cuentas = cliente.getCuentas();

        cuentas.add(cuenta);

        cliente.setCuentas(cuentas);

        return cliente.getCuentas().contains(cuenta);
    }

    @Override
    public boolean CancelarCuenta(int numero) {
            
        ArrayList<Cuenta> cuentas = cliente.getCuentas();

        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero() == numero) {
                cuentas.remove(cuenta);
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean abonar(int numero, double abono) {
        ArrayList<Cuenta> cuentas = cliente.getCuentas();

        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero() == numero) {
                cuenta.setSaldo(cuenta.getSaldo() + abono);
                return true;
            }
        }

        return false;

    }

    @Override
    public boolean retirar(int numero, double retiro) {

        ArrayList<Cuenta> cuentas = cliente.getCuentas();

        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero() == numero) {
                if (cuenta.getSaldo() < retiro){
                    System.out.println("Saldo insuficiente");
                    return false;
                }
                cuenta.setSaldo(cuenta.getSaldo() - retiro);
                return true;
            }
        }

        return false;
    }

    @Override
    public ArrayList<Cuenta> obtenerCuentas() {
        return cliente.getCuentas();
    }

    @Override
    public double consultarSaldoCuenta(int numero) {
        ArrayList<Cuenta> cuentas = cliente.getCuentas();

        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero() == numero) {
                return cuenta.getSaldo();
            }
        }

        return 0;
    }
    
}
