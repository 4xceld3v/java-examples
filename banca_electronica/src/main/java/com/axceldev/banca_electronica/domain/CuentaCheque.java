package com.axceldev.banca_electronica.domain;

public class CuentaCheque extends Cuenta {

    private double costoManejoMensual;

    public CuentaCheque(int numero, double saldo, double costoManejoMensual) {
        super(numero, saldo);
        this.costoManejoMensual = costoManejoMensual;
    }

    public CuentaCheque(int numero, String fechaApertura, double saldo, double costoManejoMensual) {
        super(numero, fechaApertura, saldo);
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

    @Override
    public int compareTo(Cuenta o) {
        return this.getNumero() - o.getNumero();
    }
    
}
