package org.example.servicios;

import org.example.modelos.Tamagochi;

import java.util.Scanner;

public class ScannerServicio {

    public String menuPrincipal(){
        System.out.println("Tamagochi v0.1");
        System.out.println("-------------------------------\n\n\n");
        System.out.println("Seleccione una opción:");
        System.out.println("1- Crear Tamagochi");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("9- Salir.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Opción>:");

        String opcion  = scanner.nextLine();
        return opcion;

    }

    public String menuTamagochi(Tamagochi tamagochi){
        System.out.println("Tamagochi v0.1");
        System.out.println("-------------------------------\n\n\n"+tamagochi.toString());
        System.out.println("Seleccione una opción:");
        System.out.println("1- Comer");
        System.out.println("2- Jugar ");
        System.out.println("4- +40 Min aburrido ");
        System.out.println(" ");
        System.out.println("9- Salir.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Opción>:");

        String opcion  = scanner.nextLine();
        return opcion;

    }



    public String crearTamagochi(){
        Scanner scanner=new Scanner(System.in);
        String nombre=checkNombre(scanner, "Ingrese nombre del tamagochi: ");
        return nombre;
    }

    private String checkNombre(Scanner scanner, String print){
        String valor="";
        while (valor.equalsIgnoreCase("")){
            System.out.println(print);
            valor=scanner.nextLine();
        }
        return valor;
    }


}
