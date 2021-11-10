/*
 * Trabajo Practico Obligatorio Nro 2
 * Curso de Desarrollador Web Full Stack
 * Silicon Misiones - Prof. Luisina De Paulo
 */
package logica;

import igu.Pantalla;

/**
 *
 * @author Jorge Panigo
 */
public class PeluqueriaCanina {

    
    public static void main(String[] args) {
        
        ControladoraLogica logica = new ControladoraLogica();
        
        Pantalla igu = new Pantalla(logica);
        
        igu.setVisible(true);
        igu.setLocationRelativeTo(null);
        
    }
    
}
