package com.company.partidoapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean sistema = true;
        do{
            try {
                Scanner entrada = new Scanner(System.in);
                mainMenuImprimir();
                int opc = Integer.parseInt(entrada.nextLine());

                switch (opc) {
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        break;
                    case 6:
                        
                        break;
                    default:
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error de entrada no numerica: "+e);
            }catch(Exception e){
                System.out.println("Ah ocurrido un error:"+e);
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
6.Salir.
======================
Ingrse su Opcion: """);
    }
}