/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;


/**
 * @author Diego Pinto and lizbeth Pacheco
 */
public class Apellidos {
        private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("estudiantes.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrirArchivo

    // lee registro del archivo
    public void leer_informacion() {

        try // lee registros del archivo, usando el objeto Scanner
        {
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split("\\|")));
                // se crea un objeto de tipo boolean para hacer ala comparacion con el contains con la condicion de "u" o "U"
                //boolean  estudiantes = linea_partes.get(0).("A") || linea_partes.get(0).contains("B") || linea_partes.get(0).contains("C") || linea_partes.get(0).contains("E") || linea_partes.get(0).contains("U");
                String apellido = linea_partes.get(0).substring(0,1);
                if (apellido.equals("A") || apellido.equals("B") || apellido.equals("C") || apellido.equals("E") || apellido.equals("U")) {
                    System.out.printf("%s %s\n", linea_partes.get(0),linea_partes.get(1));
                }
            } // fin de while


        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del metodo leerRegistros
    // cierra el archivo y termina la aplicación

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del metodo cerrarArchivo
} // fin de la clase LeerArchivoTexto

