package com.axceldev;

import com.axceldev.interfaces.Interface1;
import com.axceldev.interfaces.Interface10;
import com.axceldev.interfaces.Interface2;
import com.axceldev.interfaces.Interface3;
import com.axceldev.interfaces.Interface4;
import com.axceldev.interfaces.Interface5;
import com.axceldev.interfaces.Interface6;
import com.axceldev.interfaces.Interface7;
import com.axceldev.interfaces.Interface8;
import com.axceldev.interfaces.Interface9;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Ejecución de la aplicación - Lambda");

        Interface1 i1 = (a, b, c) -> {
            System.out.println("Operación realizada: " + a + " " + b + " " + c);
        };

        Interface2<Integer, Integer, Integer, Integer> i2 = (a, b, c) -> {
            return a + b + c;
        };

        Interface3 i3 = (a, b) -> {
            return a + "" + b;
        };

        Interface4 i4 = () -> {
            System.out.println("Operación realizada");
        };

        Interface5 i5 = (a, b) -> {
            return (long) a + b;
        };

        Interface6 i6 = (a, b) -> {
            return a + b;
        };

        Interface7 i7 = (a, b) -> {
            return a + b;
        };

        Interface8 i8 = () -> {
            return new Object();
        };

        Interface9 i9 = (a, b) -> {
            return a + " " + b;
        };

        Interface10 i10 = (a, b, c) -> {
            return a + " " + b + " " + c;
        };

        System.out.println("Ejecución de la operación - interfaz funcional 1");
        i1.operacion(1, "hola", 3.14f);

        System.out.println("Ejecución de la operación - interfaz funcional 2");
        System.out.println("Resultado: " + i2.operacion(1, 2, 3));

        System.out.println("Ejecución de la operación - interfaz funcional 3");
        System.out.println("Resultado: " + i3.operacion("Hola ", "Mundo"));

        System.out.println("Ejecución de la operación - interfaz funcional 4");
        i4.operacion();

        System.out.println("Ejecución de la operación - interfaz funcional 5");
        System.out.println("Resultado: " + i5.operacion(1, 2));

        System.out.println("Ejecución de la operación - interfaz funcional 6");
        System.out.println("Resultado: " + i6.operacion(1, 5L));

        System.out.println("Ejecución de la operación - interfaz funcional 7");
        System.out.println("Resultado: " + i7.operacion("Programción ", new StringBuilder("Java")));

        System.out.println("Ejecución de la operación - interfaz funcional 8");
        System.out.println("Resultado: " + i8.operacion());

        System.out.println("Ejecución de la operación - interfaz funcional 9");
        System.out.println("Resultado: " + i9.operacion("Hola", 3.14f));

        System.out.println("Ejecución de la operación - interfaz funcional 10");
        System.out.println("Resultado: " + i10.operacion(1, 'a', 3.14f));


    }
}