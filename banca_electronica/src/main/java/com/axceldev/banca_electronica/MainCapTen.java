package com.axceldev.banca_electronica;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.axceldev.banca_electronica.domain.Cuenta;
import com.axceldev.banca_electronica.domain.CuentaAhorro;


public class MainCapTen {

    private static final String PATH = "src\\\\main\\\\resources\\\\files\\\\cuentas.txt";

    public static void main(String[] args) {
    
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<List<Cuenta>> futureCuentas = executorService.submit(new CuentaCallable(PATH));

        try {
            List<Cuenta> cuentas = futureCuentas.get();
            for (Cuenta cuenta : cuentas) {
                System.out.println(cuenta);
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }

        System.out.println("La aplicación continúa funcionando correctamente.");

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

}

class CuentaCallable implements Callable<List<Cuenta>> {

    private String filePath;

    public CuentaCallable(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<Cuenta> call() throws Exception {
        List<Cuenta> cuentas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String datos = extraerDatos(line);
                String[] parts = datos.split(",");
                int nombre = Integer.parseInt(parts[0].trim());
                double saldo = Double.parseDouble(parts[2].trim());
                double tasa = Double.parseDouble(parts[3].trim());
                cuentas.add(new CuentaAhorro(nombre, saldo, tasa));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cuentas;
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


