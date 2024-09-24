package com.axceldev.banca_electronica;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.axceldev.banca_electronica.domain.CuentaAhorro;
import com.axceldev.banca_electronica.domain.CuentaCheque;

public class MainCapNine {

    private static final String CUENTA_AHORROS = "CA";
    private static final String CUENTA_CHEQUES = "CC";
    private static final String PATH = "src\\\\main\\\\resources\\\\files\\\\cuentas.txt";

    public static void main(String[] args) {

        SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); 
    
        List<String> cuentas = leerArchivo(PATH);
        for (String cuenta : cuentas) {
            if (cuenta.startsWith(CUENTA_AHORROS)) {
                System.out.println("Cuenta de ahorros: ");
                String datos = extraerDatos(cuenta);
                String[] dato = datos.split( ",");
                String fechaAperturaString = convertirFecha(dato[1].trim(), inputFormat, formatter);
                CuentaAhorro cuentaAhorro = new CuentaAhorro(
                    Integer.parseInt(dato[0].trim()),
                    fechaAperturaString,
                    Double.parseDouble(dato[2].trim()),
                    Double.parseDouble(dato[3].trim())
                );
                System.out.println(cuentaAhorro);
            } else if (cuenta.startsWith(CUENTA_CHEQUES)) {
                System.out.println("Cuenta de cheques: ");
                String datos = extraerDatos(cuenta);
                String[] dato = datos.split( ",");
                String fechaAperturaString = convertirFecha(dato[1].trim(), inputFormat, formatter);
                CuentaCheque cuentaCheque = new CuentaCheque(
                    Integer.parseInt(dato[0].trim()),
                    fechaAperturaString,
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

    public static String convertirFecha(String fecha, SimpleDateFormat inputFormat, SimpleDateFormat outputFormat) {
        try {
            Date fechaApertura = inputFormat.parse(fecha);
            return outputFormat.format(fechaApertura);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}



