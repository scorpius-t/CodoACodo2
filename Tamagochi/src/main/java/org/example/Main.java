package org.example;

import org.example.modelos.Tamagochi;
import org.example.servicios.ScannerServicio;

public class Main {
    private static final ScannerServicio scannerServicio=new ScannerServicio();
    public static void main(String[] args) {
        String opcion ="";
        Tamagochi tamagochi = null;

        while (!opcion.equalsIgnoreCase(("9"))&&!opcion.equalsIgnoreCase(("1"))){
            opcion= scannerServicio.menuPrincipal();
            switch (opcion){
                case "1":
                    String nombre=scannerServicio.crearTamagochi();
                    tamagochi=new Tamagochi(nombre);
                    break;
                case "9":
                    break;
                default:
                    System.out.println("La opcion ingresada no existe");
            }

        }
        // si la opcion es salir (9) no se ejecuta el submenu
        while (!opcion.equalsIgnoreCase(("9"))){
            opcion= scannerServicio.menuTamagochi(tamagochi);
            switch (opcion){
                case "1":
                    tamagochi.comer();
                    break;
                case "2":
                    tamagochi.jugar();
                    break;
                case "4":
                    tamagochi.sumar40MinAburrido();
                    break;
                case "9":
                    break;
                default:
                    System.out.println("La opcion ingresada no existe");
            }

        }


        System.out.println("Saliendo...");
        try {
            Thread.sleep(2000);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("FIN");



    }
}