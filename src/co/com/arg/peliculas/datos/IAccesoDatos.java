/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.arg.peliculas.datos;

import co.com.arg.peliculas.domain.Pelicula;
import co.com.arg.peliculas.excepciones.*;
import java.util.List;

/**
 *
 * @author alejo
 */
public interface IAccesoDatos {

    boolean existe(String nombreArchivo) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

    void crear(String nombreArchivo) throws AccesoDatosEx;

    void eliminar(String nombreArchivo) throws AccesoDatosEx;

}
