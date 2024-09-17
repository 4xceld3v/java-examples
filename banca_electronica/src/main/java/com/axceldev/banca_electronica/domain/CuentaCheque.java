package com.axceldev.banca_electronica.domain;

public class CuentaCheque extends Cuenta {

    private double costoManejoMensual;

    public CuentaCheque(int numero, double saldo, double costoManejoMensual) {
        super(numero, saldo);
        this.costoManejoMensual = costoManejoMensual;
    }

    public double getCostoManejoMensual() {
        return costoManejoMensual;
    }

    public void setCostoManejoMensual(double costoManejoMensual) {
        this.costoManejoMensual = costoManejoMensual;
    }

    @Override
    public String toString() {
        return "CuentaCheque [costoManejoMensual=" + costoManejoMensual + ", getNumero()=" + getNumero() + ", getFechaApertura()="
                + getFechaApertura() + ", getSaldo()=" + getSaldo() + ", getFechaCancelacion()=" + getFechaCancelacion()
                + "]";
    }
    
}
