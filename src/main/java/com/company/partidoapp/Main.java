package com.company.partidoapp;

import java.util.Scanner;

import com.company.partidoapp.clases.Partido;
import com.company.partidoapp.clases.PartidosLiga;
import com.company.partidoapp.clases.PartidosPlayOff;

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
                        System.out.println("\n============"+"Creando Equipo:");
                        System.out.println("Ingrese el nombre del Equipo Local: ");
                        String eLocal = entrada.next();
                        System.out.println("Ingrese el nombre del Equipo Visitante: ");
                        String eVisitante = entrada.next();
                        System.out.println("Ingrese el lugar del partido: ");
                        String pLugar = entrada.next();
                        System.out.println("Ingrese la fecha del partido: ");
                        String pFecha = entrada.next();
                        System.out.println("Ingrese el tipo de Partido\n1.Partido de Liga.\n2.Partido PlayOffs.");
                        int pOpci = Integer.parseInt(entrada.next());
                        Partido partido;
                        switch (pOpci) {
                            case 1:
                                partido = new PartidosLiga(eLocal,eVisitante,0,0,"Jugando",pFecha,pLugar,1);
                                break;
                            case 2:
                                partido = new PartidosPlayOff(eLocal,eVisitante,0,0,"Jugando",pFecha,pLugar,"Octavos");
                                break;
                            default:
                                break;
                        }
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