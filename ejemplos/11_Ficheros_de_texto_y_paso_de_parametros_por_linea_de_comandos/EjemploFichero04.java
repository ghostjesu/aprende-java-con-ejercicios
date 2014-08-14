/*
 *
 * Ejemplo de uso de la clase File
 * Listado de los archivos del directorio actual
 *
 */

import java.io.*;

class EjemploFichero04 {

	public static void main(String[] args) {

        File fichero = new File(".");	// se indica la ruta entre comillas
										// el punto (.) es el directorio actual

        String[] listaArchivos = fichero.list();
        for(int i = 0; i < listaArchivos.length; i++){
            System.out.println(listaArchivos[i]);
        }	
	}
}
