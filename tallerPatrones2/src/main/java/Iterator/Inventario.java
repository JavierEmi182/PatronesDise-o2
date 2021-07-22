/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Javier
 */
public class Inventario implements IteradorInventario {
    private String nombre;
    private Collection[] Articulo;
    
    @Override
    public Iterator crearIterator() {
        //implementacion
        Iterator i= null;
        return i;
    }
}
