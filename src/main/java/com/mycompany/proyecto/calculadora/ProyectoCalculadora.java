/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto.calculadora;

import java.util.Scanner;

/**
 *
 * @author vladp
 */
public class ProyectoCalculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos numeros:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Elige una operación (+, -, *, /):"); 
        char operacion = scanner.next().charAt(0);
        double resultado = 0;
        switch (operacion) {
            case '+': resultado = num1 + num2; break;
            case '-': resultado = num1 - num2; break;
            case '*': resultado = num1 * num2; break;
            case '/': resultado = num1 / num2; break;
            default: System.out.println("Operación no válida."); return;
        }
        System.out.println("Resultado: " + resultado);
    }
}
