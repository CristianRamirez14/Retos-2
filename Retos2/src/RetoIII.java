// Reto3. Programa que permite realizar la funcion del ahorcado

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class RetoIII {

// Escribimos el metodo main para poder ejecutar.

    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
    
        String[] palabras = {"balon", "luz", "amarillo", "gafas"};

// Escribimos random para que se pueda escoger al azar la palabra.

        Random random = new Random();
        String palabra = palabras[random.nextInt(palabras.length)];

        System.out.println("   JUEGO DEL AHORCADO INTENTA ADIVINAR LA PALABRA.   ");
        System.out.println("_______________________________________________________");

        char[] lCorrecta = new char[palabra.length()];
        Arrays.fill(lCorrecta, '_');

        int cIntentos = 0;
        boolean pCompleta = false;

        while (cIntentos < 5 && !pCompleta) {
            System.out.println("Palabra: " + String.valueOf(lCorrecta));

// Escribimos println para que el usuario pueda saber que tiene que realizar.

            System.out.print("Escribe una letra:");
            char letra = capturar.next().charAt(0);
            boolean lAdivinada = false;

// Escribimos for para que se pueda repetir las veces que sea necesario.

            for (int p = 0; p < palabra.length(); p++) {
                if (palabra.charAt(p) == letra) {
                    lCorrecta[p] = letra;
                    lAdivinada = true;
                }
            }

// Escribimos if para que el programa le quite una vida al usuario y le muestre que la palabra es incorrecta.

            if (!lAdivinada) {
                cIntentos++;
                System.out.println("La letra no esta en la palabra. Te quedan " + (5 - cIntentos) + " intentos.");
            }

// Escribimos if para que el programa muestre que esta correcta la letra.

            if (Arrays.equals(lCorrecta, palabra.toCharArray())) {
                pCompleta = true;
            }
        }

        System.out.println("___________________________________________________________" );

// Escribimos (if) para que le muestre al usuario que a adivinado la palabra.
        
        if (pCompleta) {
            System.out.println("Haz adivinado la palabra FELICIDADES =)" );
            System.out.println("          la palabra es:  " + palabra      );

// Escribimos (else) si no ha adivinado la palabra.

        } else {
            System.out.println(" No haz adivinado la palabra PERDISTE =( ");
            System.out.println("    La palabra correcta era: " + palabra    );
        }

// Cerramos lo que capturamos.


        capturar.close();
    }

}

