// Reto5. Programa que permite realizar la funcion del Juego concentrese.

import java.util.Scanner;;
public class RetoV {

// Escribimos el metodo main para poder ejecutar.

    public static void main(String[] args) {

// Declarar variables.

        boolean exit = false;
        int f1 = 0;
        int f2 = 0;
        int c1 = 0;
        int c2 = 0;
        int acierto=6;

        String sElegido, sElegido2;
        String[][] emparejar = {
            {"@", "*", ";", "+", "#", "$"},
            {"$", "#", "@", "$", ";", "+"}
        };
        Scanner capturar = new Scanner(System.in);

        System.out.println("________________________________________________");
        System.out.println("                 JUEGO CONCENTRESE.             ");
        System.out.println(" El juego consiste en emparejar signos iguales. ");
        System.out.println("      Las palabras a encontrar su pareja son:   ");
        System.out.println("________________________________________________");

// Escribimos for para que se pueda repetir las veces que sea necesario.

        for (int p = 0; p < emparejar.length - 1; p++) {
            for (int j = 0; j < emparejar[p].length; j++) {
                System.out.print(emparejar[p][j] + " \t");
            }
            System.out.println();
        }


        do {
            int tFilas = emparejar.length;
            int tColumnas = emparejar[0].length;
            boolean[][] descubierto = new boolean[tFilas][tColumnas];

// Escribimos for para que se pueda repetir las veces que sea necesario.

            for (int p = 0; p < tFilas; p++) {
                for (int j = 0; j < tColumnas; j++) {
                    System.out.print("[?]\t");
                }
                System.out.println();
            }
    
            do {

// Escribimos println para que el usuario pueda saber que tiene que realizar.


                System.out.println("Ingresa la fila del primer signo: ");
                f1 = capturar.nextInt();
                System.out.println("Ingresa la columna del primer signo: ");
                c1 = capturar.nextInt();
                while (descubierto[f1][c1]) {
                    System.out.println("Haz escogido una posicion ya descubierta escoge otra porfavor");
                    System.out.println("Ingresa la fila del primer signo:");
                    f1 = capturar.nextInt();
                    System.out.println("Ingresa la columna del primer signo: ");
                    c1 = capturar.nextInt();
                }
                sElegido = emparejar[f1][c1];
                descubierto[f1][c1] = true;
                
// Escribimos for para que se pueda repetir las veces que sea necesario.

                for (int p = 0; p < tFilas; p++) {
                    for (int j = 0; j < tColumnas; j++) {
                        if (descubierto[p][j]) {
                            System.out.print("[" + emparejar[p][j] + "]\t");
                        } else {
                            System.out.print("[?]\t");
                        }
                    }
                    System.out.println();
                }

// Escribimos println para que el usuario pueda saber que tiene que realizar.

                System.out.println("Ingresa la fila del segundo signo: ");
                f2 = capturar.nextInt();
                System.out.println("Ingresa la columna del segundo signo: ");
                c2 = capturar.nextInt();
                while (descubierto[f2][c2]) {
                    System.out.println("Haz escogido una posicion ya descubierta escoge otra porfavor");
                    System.out.println("Ingresa la fila del segundo signo: ");
                    f2 = capturar.nextInt();
                    System.out.println("Ingresa la columna del segundo signo: ");
                    c2 |= capturar.nextInt();
                }

                sElegido2 = emparejar[f2][c2];
                descubierto[f2][c2] = true;

// Escribimos for para que se pueda repetir las veces que sea necesario.

                for (int p = 0; p < tFilas; p++) {
                    for (int j = 0; j < tColumnas; j++) {
                        if (descubierto[p][j]) {
                            System.out.print("[" + emparejar[p][j] + "]\t");
                        } else {
                            System.out.print("[?]\t");
                        }
                    }
                    System.out.println();
                }

// Escribimos if para que el programa le muestre al usuario que los signos son iguales.

                if (sElegido.equalsIgnoreCase(sElegido2)) {
                    System.out.println("Muy bien haz encontrado los signos iguales. =)");
                    acierto--;

// Escribimos (else) cuando signos no son iguales.

                } else {
                    System.out.println("Los signos no son iguales.=| ");
                    descubierto[f1][c1] = false;
                    descubierto[f2][c2] = false;
                }


            } while (acierto>0);

            System.out.println("¿Quieres jugar de nuevo?");
            String opcion = capturar.next();

// Escribimos if para que el programa se salga.

            if (opcion.equalsIgnoreCase("NO")) {
                exit = true;
            }

        } while (!exit);

        System.out.println("Se ha terminado el juego.");

// Cerramos lo que capturamos.

        capturar.close();

    }
}