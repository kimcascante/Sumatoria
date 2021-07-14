package Adicional;

/**
 * Nombre del programa: Sumatoria
 * Descripcion: Sumatoria matematica desde i hasta n
 * Autor: Kimberly C.
 * Fecha de creacion: 18-06-2020
 * Modificado por: Kimberly C.
 * fecha de modificacion: 18-06-2020
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class sumatoria {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{

        //Declaracion de variables

        int n = 0; 
        int i = 0;
        int suma = 0;

        escribir.println("Digite el valor de i:");
        i = Integer.parseInt(leer.readLine());

        escribir.println("Digite el valor de n:");
        n = Integer.parseInt(leer.readLine());

        //Interaccion con for
        //En el for es lo mismo poner count = count + 1, que poner count++
        for (int count = i;  count <= n; count++){
            //Es lo mismo poner suma = suma + i, que poner suma+=i
            suma = suma+=count;
        }

        escribir.println("La sumatoria es " +suma);

    } //Final del main
}//Final del programa