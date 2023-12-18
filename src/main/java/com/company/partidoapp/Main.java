package com.company.partidoapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean sistema = true;
        Scanner entrada = new Scanner(System.in);
        do{
            try {
                mainMenuImprimir();
                int opc = Integer.parseInt(entrada.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error de entrada no numerica: "+e);
            }
        }while(sistema);
    }

    public static void mainMenuImprimir(){
        System.out.println("""
======================
 MENU PARTIDO-MANAGER
1.Crear Partido.
2.Agregar puntos.
3.Mostrar Partido.
4.Mostrar Ganador.
5.Finalizar Partido.
======================
Ingrse su Opcion: """);
    }
}