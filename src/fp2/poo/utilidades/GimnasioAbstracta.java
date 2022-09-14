/*
 *  @(#)GimnasioAbstracta.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de University name
 *  
 */

package fp2.poo.utilidades;

import fp2.poo.utilidades.RutinaDeEntrenamientoInterfaz;
import fp2.poo.utilidades.TelefonoInterfaz; 
import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;

/**
 * Esta es una clase que representa un gimnasio.
 * Mantiene un conjunto de clientes y rutinas de entrenamiento.
 *
 * @version version 1.0 Abril 2022
 * @author  Fundamentos de Programacion II
 */
public abstract class GimnasioAbstracta {



    /**
     *  Inserta un nuevo cliente, proporcionandolo como parametro.
     *  En el caso de que ya exista un cliente con el mismo dni
     *  se lanzara la excepcion OperacionNoPermitidaExcepcion,
     *  o bien, que la referencia al cliente sea nula (null).
     */
    public abstract void insertarCliente(ClienteInterfaz cliente) 
           throws OperacionNoPermitidaExcepcion;

    /**
     *  Inserta una nueva rutina, proporcionandola como parametro.
     *  En el caso de que ya exista una rutina de entrenamiento con el mismo 
     *  identificador se lanzara la excepcion OperacionNoPermitidaExcepcion,
     *  o bien, que la referencia a la rutina de entrenamiento sea nula (null).     
     */
    public abstract void insertarRutinaEntrenamiento(RutinaDeEntrenamientoInterfaz rut) 
           throws OperacionNoPermitidaExcepcion;

    /**
     *  Muestra por la salida estandar (System.out) cada cliente del gimnasio 
     *  en una l�nea.
     *  El orden de salida de los datos es el siguiente:
     *  DNI, Nombre, Numero de telefono, Domicilio, Correo electr�nico 
     *  y el identificador de la rutina de este cliente. 
     *  No se inserta ninguna informacion adicional a la especificada.
     */
    public abstract void mostrarClientes();

    /**
     *  Muestra por la salida estandar (System.out) todas las rutinas que hay en el
     *  gimnasio (cada rutina en una l�nea).
     *  El orden de salida de los datos es el siguiente:
     *  identificador, descripcion, frecuencia y tiempo.
     */
    public abstract void mostrarRutinas();


    /**
     * Ordena los clientes del gimnasio seg�n el Dni.
     * 
     */
     public abstract void ordenarClientesPorDni();


} 
