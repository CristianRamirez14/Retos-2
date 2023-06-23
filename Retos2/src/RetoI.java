// Reto1. Con este programa podemos solicitar la cantidad de notas en una materia y el valor de cada una de dichas notas
// y se calcula el promedio y muestra si pasaste o reprobaste.

import java.util.Scanner;
public class RetoI {

// Escribimos el metodo main para poder ejecutar.

    public static void main(String[] args) throws Exception {

// Declarar variables.

        int cNotas;
        float promedio = 0; 
        float sTotal = 0;
        Scanner capturar = new Scanner(System.in);
    
// Escribimos println para que el usuario pueda saber que tiene que realizar.

        System.out.println("Ingresa el numero de notas: ");
        cNotas = capturar.nextInt();
        float [] nota = new float[cNotas];

// Escribimos for para que se pueda repetir las veces que sea necesario.

        for(int p=0; p<cNotas; p++){
            System.out.println("Ingresa la calificacion de la nota # " + (p+1) + " :");
            nota[p] = capturar.nextFloat();
            sTotal+=nota[p];
        }

// Realizamos una operacion el total de las notas dividido (/) entre la cantidad de notas escritas.

        promedio = sTotal/cNotas;

        System.out.println("___________________________________________________________");

// Escribimos if Si el promedio de la nota es menor a 3.


        if (promedio<3) {
            System.out.println("                    Has reprobado. =("                         );
            System.out.println("Reprobaste la nota es menor a 3. tu nota final es de: " +promedio);
            

// Escribimos else if si la nota es  entre  3 y 4.0 .

        } else if(promedio>=3 && promedio<=4){
            System.out.println("              Pasaste raspando. =|           ");
            System.out.println("Pasaste raspando la nota esta entre 3 y 4.0." );
            System.out.println("         tu nota final es de: " +promedio       );

// Si no se cumple lo anterior escribimos else para dar el ultimo resultado, si es mayor a 4.0 .

        } else{
            System.out.println("          Aprobaste con buenos resultados. =)              ");
            System.out.println("La nota final es mayor a 4.0. tu nota final es de: " +promedio);
        }

// Cerramos lo que capturamos.

        capturar.close();
    }
}