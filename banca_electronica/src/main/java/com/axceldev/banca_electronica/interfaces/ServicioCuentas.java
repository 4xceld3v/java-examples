package com.axceldev.banca_electronica.interfaces;

import java.util.ArrayList;

import com.axceldev.banca_electronica.domain.Cuenta;

public interface ServicioCuentas {
    public boolean agregarCuenta(Cuenta cuenta);
    public boolean CancelarCuenta(int numero);
    public boolean abonar(int numero, double abono);
    public boolean retirar(int numero, double retiro);
    public double consultarSaldoCuenta(int numero);
    public ArrayList<Cuenta> obtenerCuentas();
}
