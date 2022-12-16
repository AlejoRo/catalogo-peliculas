/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.arg.peliculas.presentacion;

import co.com.arg.peliculas.servicio.*;
import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {
        
        int opcion = -1;
        Scanner scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        
        while (opcion !=0) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Elige una opcion: \n" 
                    + "1. Inicar catalogo peliculas. \n"
                    + "2. Agregar pelicula. \n"
                    + "3. Listar peliculas. \n"
                    + "4. Buscar pelicula. \n"
                    + "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());
            
            switch(opcion){
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la pelicula");
                    String nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce una pelicula a buscar");
                    String buscar = scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }
            
        }
        
    }
}
