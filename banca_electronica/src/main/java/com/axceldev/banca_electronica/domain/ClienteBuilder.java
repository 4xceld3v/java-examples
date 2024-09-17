package com.axceldev.banca_electronica.domain;

import java.util.ArrayList;

public class ClienteBuilder implements Comparable<Cliente> {

    private int numero;
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cuenta> cuentas;
    private String fechaNacimiento;

    private ClienteBuilder(Builder builder) {
        this.numero = builder.numero;
        this.nombre = builder.nombre;
        this.domicilio = builder.domicilio;
        this.rfc = builder.rfc;
        this.telefono = builder.telefono;
        this.cuentas = builder.cuentas;
        this.fechaNacimiento = builder.fechaNacimiento;
    }

    public static class Builder {
        private int numero;
        private String nombre;
        private Domicilio domicilio;
        private String rfc;
        private String telefono;
        private ArrayList<Cuenta> cuentas;
        private String fechaNacimiento;

        public Builder setNumero(int numero) {
            this.numero = numero;
            return this;
        }

        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder setDomicilio(Domicilio domicilio) {
            this.domicilio = domicilio;
            return this;
        }

        public Builder setRfc(String rfc) {
            this.rfc = rfc;
            return this;
        }

        public Builder setTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder setCuentas(ArrayList<Cuenta> cuentas) {
            this.cuentas = cuentas;
            return this;
        }

        public Builder setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public ClienteBuilder build() {
            return new ClienteBuilder(this);
        }
    }

    public int getNumero() {
        return numero;
    }




    public void setNumero(int numero) {
        this.numero = numero;
    }




    public String getNombre() {
        return nombre;
    }




    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    public Domicilio getDomicilio() {
        return domicilio;
    }




    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }




    public String getRfc() {
        return rfc;
    }




    public void setRfc(String rfc) {
        this.rfc = rfc;
    }




    public String getTelefono() {
        return telefono;
    }




    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }




    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }




    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }




    public String getFechaNacimiento() {
        return fechaNacimiento;
    }




    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    @Override
    public int compareTo(Cliente o) {
        // Implement comparison logic here
        return 0;
    }
}