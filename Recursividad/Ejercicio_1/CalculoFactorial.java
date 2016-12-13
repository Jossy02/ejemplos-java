/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

public class CalculoFactorial {

    // Declaracion recursiva del metodo factorial
    public double factorial(double num) {

        if (num <= 1) { // evalua el caso base
            return 1; // caso base: 0!=1 y 1!=1
        } else { // paso recurvivo
            return num * factorial(num - 1);
        }
    } // Fin del metodo factorial

    public void mostrarFactoriales() {

        // Calculo de los factoriales
        for (int i = 0; i <= 4; i++) {
            System.out.printf("%d! = %.0f\n", i, factorial(i));
        }
    } // Fin del metodo mostrarFactorial

} // Fin de la clase principal
