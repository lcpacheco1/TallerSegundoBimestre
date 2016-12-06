/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecicio4;

/**
 *
 * @author Diego Pinto and lizbeth Pacheco
 */
public class Ejecutor {
     public static void main(String args[]) {
     CrearArchivo aplicacion = new CrearArchivo();

       aplicacion.abrir_archivo();
      aplicacion.agregar_informacion();
      aplicacion.cerrar_archivo();
    } // fin de main
} // fin de la clase PruebaCre

