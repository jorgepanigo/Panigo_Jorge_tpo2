
package logica;


import javax.persistence.RollbackException;
import javax.swing.JOptionPane;

import persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    
    ControladoraPersistencia Persis = new ControladoraPersistencia();
    
    
    //Se delega a la capa de persistencia la carga de lo datos que se reciben desde la
    public void nuevoPerro(String numCliente, String nombrePerro, String raza, String color, String alergico, String atenciónEspecial, String nombreDuenio, String celularDuenio, String observaciones){
        
        
            Persis.nuevoCliente(new Perro(numCliente, nombrePerro, raza, color, alergico, atenciónEspecial, nombreDuenio, celularDuenio, observaciones));
        
            
    }
    
    //Metodo esNumero validad si un String contiene solo numeros
    public boolean esNumero(String dato){
        try {
            Integer.parseInt(dato);
            return true;
        } catch (Exception e) {
            return false;
        }
    }      
    
    //Metodo esNumero validad si un String contiene solo numeros
    public boolean estaVacio(String dato){
        
        return dato.equals("");
    }     
    
}
