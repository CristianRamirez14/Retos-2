/// Reto4. programa que permite que ingreses el nombre y precio de un producto y que se acomode en vectores.

import java.util.Scanner;
public class RetoIV {
    
// Escribimos el metodo main para poder ejecutar.

    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);

// Declarar variables.

        int cProductos=0;
        String [][] producto = new String [4][4];

        for (int p = 0; p < producto.length; p++) {
            for (int j = 0; j < producto.length; j++) {
                cProductos++;

// Escribimos println para que el usuario pueda saber que tiene que realizar.

                System.out.println("Ingresa el nombre del producto "+(cProductos)+":");
                String nProducto = capturar.nextLine();
                System.out.println("Ingresa el valor del producto "+(cProductos)+":");
                int vProducto = capturar.nextInt(); 
                capturar.nextLine();
                producto[p][j] = "["+nProducto+"]"+"[$"+vProducto+"]";   
            }

        }
        System.out.println("___________________________________________");

// Escribimos for para que se pueda repetir las veces que sea necesario.

        for (int p = 0; p < producto.length; p++) {
            for (int j = 0; j < producto.length; j++) {
                System.out.print(p+""+j+" "+producto[p][j]+" \t");
            }
            System.out.println();
        }


// Cerramos lo que capturamos.

        capturar.close();
    }
}
