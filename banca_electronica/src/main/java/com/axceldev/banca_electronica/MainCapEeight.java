package com.axceldev.banca_electronica;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

public class MainCapEeight {

    private static final String CUENTA_AHORROS = "CA";
    private static final String CUENTA_CHEQUES = "CC";
    private static final String PATH = "src\\\\main\\\\resources\\\\files\\\\cuentas.txt";

    public static void main(String[] args) {
    
        List<String> cuentas = leerArchivo(PATH);
        for (String cuenta : cuentas) {
            if (cuenta.startsWith(CUENTA_AHORROS)) {
                System.out.println("Cuenta de ahorros: ");
                String datos = extraerDatos(cuenta);
                String[] dato = datos.split( ",");
                CuentaAhorro cuentaAhorro = new CuentaAhorro(
                    Integer.parseInt(dato[0].trim()),
                    Double.parseDouble(dato[2].trim()),
                    Double.parseDouble(dato[3].trim())
                );
                System.out.println(cuentaAhorro);
            } else if (cuenta.startsWith(CUENTA_CHEQUES)) {
                System.out.println("Cuenta de cheques: ");
                String datos = extraerDatos(cuenta);
                String[] dato = datos.split( ",");
                CuentaCheque cuentaCheque = new CuentaCheque(
                    Integer.parseInt(dato[0].trim()),
                    Double.parseDouble(dato[2].trim()),
                    Double.parseDouble(dato[3].trim())
                );
                System.out.println(cuentaCheque);
            }
        }

    }

    public static List<String> leerArchivo(String filePath) {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineas;
    }

    public static String extraerDatos(String cuenta) {
        Pattern pattern = Pattern.compile("\\[(.*?)\\]");
        Matcher matcher = pattern.matcher(cuenta);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }
    
}



