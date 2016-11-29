/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;


/**
 *
 * @author SALAS
 */
public class Ejecutor {
    public static void main( String args[] )
   {
      Estudiantes cali = new Estudiantes();

      cali.abrirArchivo();
      cali.leer_informacion();
      cali.cerrarArchivo();
   } // fin de main
}
