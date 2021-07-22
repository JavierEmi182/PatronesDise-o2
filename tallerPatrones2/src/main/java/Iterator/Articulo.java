/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author Javier
 */
public class Articulo {
    private String nombre;
    private String tipo;
    private String nomBodega;
    private boolean disponibilidad;
    private Estado estado;

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNomBodega() {
        return nomBodega;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public Estado getEstado() {
        return estado;
    }
    
    
}
