/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecicio2;

/**
 * @author Diego Pinto and lizbeth Pacheco
 */
public class Ejecutor {
    
    public static void main(String args[]) {
        Apellidos aplicacion = new Apellidos();

        aplicacion.abrirArchivo();
        aplicacion.leer_informacion();
        aplicacion.cerrarArchivo();
    } // fin de main
} // fin de la clase PruebaCrearArchivoTexto

