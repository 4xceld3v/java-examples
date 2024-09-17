package com.axceldev.exercises_for;

public class Ejercicios {
    public static void ejercicio1() {
        System.out.println("Imprime los números del 10 al 1:\r\n" + //
                           "Escribe un programa que utilice un bucle for para imprimir los números del 10 al 1 en orden descendente. \n");
        for (int i = 10; i >= 1; i--) {
            System.out.printf("numero: %d \n", i);
        }
    }

    public static void ejercicio2() {
        System.out.println("Imprime los números pares del 2 al 20:\r\n" + //
                        "Escribe un programa que utilice un bucle for para imprimir todos los números pares entre 2 y 20. \n");
        
        for (int i = 2; i <= 20; i += 2) {
            System.out.printf("numero: %d \n", i);
        }
    }

    public static void ejercicio3() {
        System.out.println("Imprime los números impares del 1 al 19:\r\n" + //
                        "Escribe un programa que utilice un bucle for para imprimir todos los números impares entre 1 y 19. \n");

        for (int i = 1; i <= 19; i += 2) {
            System.out.printf("numero: %d \n", i);
        }
    }

    public static void ejercicio4() {
        System.out.println("Imprime la tabla de multiplicar del 5:\r\n" + //
                        "Escribe un programa que utilice un bucle for para imprimir la tabla de multiplicar del 5, desde 5x1 hasta 5x10. \n");
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("5 x %d = %d \n", i, 5 * i);
        }
    }

    public static void ejercicio5() {
        System.out.println("Imprime los primeros 10 números cuadrados:\r\n" + //
                        "Escribe un programa que utilice un bucle for para imprimir los primeros 10 números elevados al cuadrado (1², 2², 3², ...). \n");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d² = %d \n", i, i * i);
        }
    }

    public static void ejercicio6() {
        System.out.println("Imprime los números del 1 al 10 y su doble:\r\n" + //
                "Escribe un programa que utilice un bucle for para imprimir los números del 1 al 10 junto con su doble (por ejemplo: \"1 - 2\", \"2 - 4\", ...). \n");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d - %d \n", i, i * 2);
        }
    }

    public static void ejercicio7() {
        System.out.println("Imprime los primeros 10 números en forma de lista:\r\n" + //
                        "Escribe un programa que utilice un bucle for para imprimir los primeros 10 números, cada uno en una línea diferente, con el formato: \"Número: X\". \n");
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Número: %d \n", i);
        }
    }

    public static void ejercicio8() {
        System.out.println("Suma de los primeros 10 números:\r\n" + //
                        "Escribe un programa que utilice un bucle for para calcular la suma de los primeros 10 números enteros (1+2+3+...+10). \n");

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.printf("La suma de los primeros 10 números es: %d \n", sum);
    }

    public static void ejercicio9() {
        System.out.println("Imprime una secuencia de asteriscos:\r\n" + //
                        "Escribe un programa que utilice un bucle for para imprimir 10 asteriscos en una sola línea (**********). \n");
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }
    }

    public static void ejercicio10() {
        System.out.println("Imprime los elementos de un array:\r\n" + //
                        "Escribe un programa que utilice un bucle for para imprimir todos los elementos de un array de números, uno por línea. \n");
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Elemento %d: %d \n", i, array[i]);
        }
    }

    public static void ejercicio11() {
        System.out.println("Suma de los elementos de un array:\r\n" + //
                        "Escribe un programa que utilice un bucle for para calcular la suma de todos los elementos en un array de números. \n");
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.printf("Suma: %d", sum);
    }

    public static void ejercicio12() {
        System.out.println("Encuentra el número más grande en un array:\r\n" + //
                        "Escribe un programa que utilice un bucle for para encontrar y mostrar el número más grande en un array de números. \n");
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.printf("El número más grande es: %d", max);
    }

    public static void ejercicio13() {
        System.out.println("Cuenta cuántos números son mayores que 10 en un array:\r\n" + //
                        "Escribe un programa que utilice un bucle for para contar cuántos números en un array son mayores que 10. \n");
        
        int[] array = {1, 20, 3, 40, 50, 6, 7, 8, 9, 10};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                count++;
            }
        }
        System.out.printf("Hay %d números mayores que 10", count);
    }

    public static void ejercicio14() {
        System.out.println("Imprime los números del 1 al 100, pero solo los múltiplos de 3:\r\n" + //
                        "Escribe un programa que utilice un bucle for para imprimir solo los números entre 1 y 100 que sean múltiplos de 3. \n");
        
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.printf("Número: %d \n", i);
            }
        }
    }

    public static void ejercicio15() {
        System.out.println("Reversa los elementos de un array:\r\n" + //
        "Escribe un programa que utilice un bucle for para imprimir los elementos de un array en orden inverso. \n");

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = array.length - 1; i >= 0; i--) {
        System.out.printf("Elemento %d: %d \n", i, array[i]);
        }
    }

    public static void ejercicio16() {
        System.out.println("Imprime los primeros 10 números Fibonacci:\r\n" + //
        "Escribe un programa que utilice un bucle for para imprimir los primeros 10 números de la secuencia de Fibonacci. \n");

        int n = 10;
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
        System.out.printf("Fibonacci(%d): %d \n", i, a);
        int sum = a + b;
        a = b;
        b = sum;
        }
    }

    public static void ejercicio17() {
        System.out.println("Imprime las letras de una palabra:\r\n" + //
                        "Escribe un programa que utilice un bucle for para imprimir cada letra de una palabra (string) en una línea diferente. \n");
        
        String word = "hola";
        for (int i = 0; i < word.length(); i++) {
            System.out.printf("Letra %d: %c \n", i, word.charAt(i));
        }
    }

    public static void ejercicio18() {
        System.out.println("Convierte todos los elementos de un array a mayúsculas:\r\n" + //
                        "Escribe un programa que utilice un bucle for para recorrer un array de strings y convertir cada elemento a mayúsculas. \n");
        
        String[] array = {"hola", "mundo", "java"};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
            System.out.printf("Elemento %d: %s \n", i, array[i]);
        }
    }

    public static void ejercicio19() {
        System.out.println("Crea un patrón de pirámide con asteriscos:\r\n" + //
                        "Escribe un programa que utilice un bucle for para crear una pirámide de asteriscos como la siguiente:\r\n");

        int rows = 5; // Number of rows for the pyramid

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void ejercicio20() {
        System.out.println("Verifica si un array contiene un número específico:\r\n" + //
                        "Escribe un programa que utilice un bucle for para verificar si un array contiene un número específico. Si el número está presente, imprime \"Encontrado\"; de lo contrario, imprime \"No encontrado\". \n");
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Encontrado");
        } else {
            System.out.println("No encontrado");
        }
    }

    public static void ejercicio21() {
        System.out.println("Imprime los elementos en posiciones impares de un array:\r\n" + //
                        "Escribe un programa que utilice un bucle for para imprimir los elementos que están en posiciones impares de un array. \n");
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.printf("Elemento %d: %d \n", i, array[i]);
            }
        }
    }

    public static void ejercicio22() {
        System.out.println("Calcula el promedio de un array de números:\r\n" + //
                        "Escribe un programa que utilice un bucle for para calcular el promedio de todos los números en un array. \n");
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        System.out.printf("Promedio: %.2f", average);
    }

    public static void ejercicio23() {
        System.out.println("Cuenta cuántos elementos en un array son strings:\r\n" + //
                        "Escribe un programa que utilice un bucle for para contar cuántos elementos en un array son de tipo string. \n");

        Object[] array = {1, "dos", 3, "cuatro", 5, "seis", 7, "ocho", 9, "diez"};

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof String) {
                count++;
            }
        }
        System.out.printf("Hay %d elementos de tipo string", count);
    }

    public static void ejercicio24() {
        System.out.println("Concatena todos los elementos de un array en un solo string:\r\n" + //
                        "Escribe un programa que utilice un bucle for para concatenar todos los elementos de un array en un solo string, separado por comas. \n");
                
        String[] array = {"hola", "mundo", "java"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }

        System.out.printf(result.toString());
    }

    public static void ejercicio25() {
        System.out.println("Crea un patrón de pirámide invertida con asteriscos:\r\n" + //
                        "Escribe un programa que utilice un bucle for para crear una pirámide invertida de asteriscos como la siguiente: \n");

        int rows = 5; 

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void ejercicio26() {
        System.out.println("Convierte un array de strings a un array de números:\r\n" + //
                        "Escribe un programa que utilice un bucle for para convertir un array de strings que representan números (por ejemplo, [\"1\", \"2\", \"3\"]) en un array de números (por ejemplo, [1, 2, 3]). \n");
                
        String[] array = {"1", "2", "3", "4", "5"};
        int[] numbers = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            numbers[i] = Integer.parseInt(array[i]);
            System.out.printf("Elemento %d: %d \n", i, numbers[i]);
        }

    }

    public static void ejercicio27() {
        System.out.println("Filtra los números mayores a 50 en un array:\r\n" + //
                        "Escribe un programa que utilice un bucle for para filtrar todos los números mayores a 50 de un array y los almacene en un nuevo array. \n");
            
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 50) {
                count++;
            }
        }

        int[] result = new int[count];

        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 50) {
                result[index] = array[i];
                index++;
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.printf("Elemento %d: %d \n", i, result[i]);
        }
    }
}