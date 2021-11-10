
package persistencia;

import logica.Perro;

// Controladora para manejo de la capa de persistencia
public class ControladoraPersistencia {
    
    
   PerroJpaController PerroJPA = new PerroJpaController();
   
    //Carga de datos en la DB mediante la controladora de la Entity Class
    public void nuevoCliente(Perro p)
    {
        PerroJPA.create(p);
    }
    
   
}
