/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Paypal extends MetodoPago {

    private Boolean verif;
    private String correo;

    public Paypal(Boolean verif, String correo, String nombre) {
        super(nombre);
        this.verif = verif;
        this.correo = correo;
    }

    

}
