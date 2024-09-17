package com.axceldev.exercises_for;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercises for Java - For Loop");
        int input;
    
        do {
            System.out.println("Ejercicio 1:");
            System.out.println("Ejercicio 2:");
            System.out.println("Ejercicio 3:");
            System.out.println("Ejercicio 4:");
            System.out.println("Ejercicio 5:");
            System.out.println("Ejercicio 6:");
            System.out.println("Ejercicio 7:");
            System.out.println("Ejercicio 8:");
            System.out.println("Ejercicio 9:");
            System.out.println("Ejercicio 10:");
            System.out.println("Ejercicio 11:");
            System.out.println("Ejercicio 12:");
            System.out.println("Ejercicio 13:");
            System.out.println("Ejercicio 14:");
            System.out.println("Ejercicio 15:");
            System.out.println("Ejercicio 16:");
            System.out.println("Ejercicio 17:");
            System.out.println("Ejercicio 18:");
            System.out.println("Ejercicio 19:");
            System.out.println("Ejercicio 20:");
            System.out.println("Ejercicio 21:");
            System.out.println("Ejercicio 22:");
            System.out.println("Ejercicio 23:");
            System.out.println("Ejercicio 24:");
            System.out.println("Ejercicio 25:");
            System.out.println("Ejercicio 26:");
            System.out.println("Ejercicio 27:");
            System.out.println("Seleciona el ejercicio que deseas ejecutar: ");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    Ejercicios.ejercicio1();
                    break;
                case 2:
                    Ejercicios.ejercicio2();
                    break;
                case 3:
                    Ejercicios.ejercicio3();
                    break;
                case 4:
                    Ejercicios.ejercicio4();
                    break;
                case 5:
                    Ejercicios.ejercicio5();
                    break;
                case 6:
                    Ejercicios.ejercicio6();
                    break;
                case 7:
                    Ejercicios.ejercicio7();
                    break;
                case 8:
                    Ejercicios.ejercicio8();
                    break;
                case 9:
                    Ejercicios.ejercicio9();
                    break;
                case 10:
                    Ejercicios.ejercicio10();
                    break;
                case 11:
                    Ejercicios.ejercicio11();
                    break;
                case 12:
                    Ejercicios.ejercicio12();
                    break;
                case 13:
                    Ejercicios.ejercicio13();
                    break;
                case 14:
                    Ejercicios.ejercicio14();
                    break;
                case 15:
                    Ejercicios.ejercicio15();
                    break;
                case 16:
                    Ejercicios.ejercicio16();
                    break;
                case 17:
                    Ejercicios.ejercicio17();
                    break;
                case 18:
                    Ejercicios.ejercicio18();
                    break;
                case 19:
                    Ejercicios.ejercicio19();
                    break;
                case 20:
                    Ejercicios.ejercicio20();
                    break;
                case 21:
                    Ejercicios.ejercicio21();
                    break;
                case 22:
                    Ejercicios.ejercicio22();
                    break;
                case 23:
                    Ejercicios.ejercicio23();
                    break;
                case 24:
                    Ejercicios.ejercicio24();
                    break;
                case 25:
                    Ejercicios.ejercicio25();
                    break;
                case 26:
                    Ejercicios.ejercicio26();
                    break;
                case 27:
                    Ejercicios.ejercicio27();
                    break;
                default:
                    System.out.println("Ejercicio no válido, por favor selecciona un número entre 1 y 27.");
            }

        } while (input < 1 || input > 27);

        scanner.close();
    }
}