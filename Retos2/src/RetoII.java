// Reto2. En una competencia de natacion se registran el tiempo del nadador se quiere saber cual competidor gano por el mejor tiempo.

import java.util.Scanner;
public class RetoII {

    public static void main(String[] args) {

// Declarar variables.        

        int cNadadores;
        float  tCompetidor = -1;
        String ganador = "";
        Scanner capturar= new Scanner(System.in);

// Escribimos println para que el usuario pueda saber que tiene que realizar.

        System.out.println("¿Cuantos nadadores van a participar en la competencia?:");
        cNadadores = capturar.nextInt();
        capturar.nextLine();

// Escribimos for para que se pueda repetir las veces que sea necesario.

        for(int p=0; p<cNadadores; p++){
            String nNadador;
            float tiempo;
            System.out.print("Ingrese el nombre del nadador # "+(p+1) + " : ");
            nNadador = capturar.nextLine();

            System.out.print("Ingrese el tiempo del nadador "+nNadador+" :");
            tiempo = capturar.nextFloat();
            capturar.nextLine();

// mostramos el nombre y el tiempo del nadador.

            System.out.println("El nadador " + (p+1) + ": " + nNadador + " tuvo un tiempo de :" + tiempo);
            System.out.println("________________________________________________");
            
// Escribimos if para saber cual fue el mejor tiempo.

            if(tCompetidor == -1 || tiempo < tCompetidor){
                tCompetidor = tiempo;
                ganador = nNadador;
            }
        }

// Mostramos cual fue el competidor ganador.

        System.out.println("El ganador es " + ganador + " con el mejor tiempo estimado de: " + tCompetidor);

// Cerramos lo que capturamos.

        capturar.close();
    }
}