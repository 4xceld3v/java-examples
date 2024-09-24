package com.axceldev.banca_electronica.domain;

public class CuentaAhorro extends Cuenta {

    private double tasaInteresMensual;

    public CuentaAhorro(int numero, double saldo, double tasaInteresMensual) {
        super(numero, saldo);
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public CuentaAhorro(int numero, String fechaApertura, double saldo, double tasaInteresMensual) {
        super(numero, fechaApertura, saldo);
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public double getTasaInteresMensual() {
        return tasaInteresMensual;
    }

    public void setTasaInteresMensual(double tasaInteresMensual) {
        this.tasaInteresMensual = tasaInteresMensual;
    }

    @Override
    public String toString() {
        return "CuentaAhorro [tasaInteres=" + tasaInteresMensual + ", getNumero()=" + getNumero() + ", getFechaApertura()="
                + getFechaApertura() + ", getSaldo()=" + getSaldo() + ", getFechaCancelacion()=" + getFechaCancelacion()
                + "]";
    }

    @Override
    public int compareTo(Cuenta o) {
        return this.getNumero() - o.getNumero();
    }
    
}
