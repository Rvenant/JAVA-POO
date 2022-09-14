/**
 * @proyecto Practica Final Poo
 * @nombre : Cliente.java
 * @fecha : Mayo 2022
 * @autor : Name
 * @descripcion : Clase con metodos set y get de los diferentes parametros que compone un cliente, estos son inicializados 
 * mediante el contructor de la clase. 
 * Los metodos get son del tipo tipoDeAtributoInterfaz ejemplo private DniInterfaz Dni, excepto nombre e idEntrenamiento que son String 
 * 
 */





package fp2.poo.pfpooname;

import fp2.poo.utilidades.ClienteInterfaz;
import fp2.poo.utilidades.CorreoElectronicoInterfaz;
import fp2.poo.utilidades.DniInterfaz;
import fp2.poo.utilidades.DomicilioInterfaz;
import fp2.poo.utilidades.TelefonoInterfaz;




public class Cliente implements ClienteInterfaz{
    
    private DniInterfaz Dni ;
    private String nombre ;
    private DomicilioInterfaz domicilio ;
    private TelefonoInterfaz telefono ;
    private  CorreoElectronicoInterfaz correoElectronico ;
    private String idEntrenamiento ;
    

    //Constructor
    public Cliente (DniInterfaz dni , String nombre , TelefonoInterfaz tlf,
    DomicilioInterfaz domicilio , CorreoElectronicoInterfaz corrElec , 
    String IdEntrenamiento ){
        Dni = dni ;
        this.nombre = nombre ;
        telefono = tlf ;
        this.domicilio = domicilio ;
        correoElectronico = corrElec;
        idEntrenamiento = IdEntrenamiento ;
    }

    // Metodos DNI
    public DniInterfaz getDni (){
        
        return Dni;
    }
    public void setDni (DniInterfaz Dni){
        this.Dni = Dni ;
    }

    //Metodos Telefono
    public TelefonoInterfaz  getTelefono() {
        return telefono;
    }
    public void setTelefono(TelefonoInterfaz  telefono) {
        this.telefono = telefono;
    }

    // Metodos Nombre
    public String getNombre() {
        return nombre ;
    }
    public void setNombre(String nombre){
        this.nombre = nombre ;
    }

    //Metodos Domicilio
    public DomicilioInterfaz getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(DomicilioInterfaz domicilio ) {
        this.domicilio = domicilio ;
        
    }

    //Metodos Correo Electronicp
    public void setCorreoElectronico( CorreoElectronicoInterfaz correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
  
    public CorreoElectronicoInterfaz getCorreoElectronico() {
        return correoElectronico;
    }

    // Metodos Rutina de entrenamiento 
    
    public String getEntrenamiento() {
        
        return idEntrenamiento;
    }
    
    public void setEntrenamiento(String unEntrenamiento) {
        idEntrenamiento = unEntrenamiento ;
        
    }   
}
