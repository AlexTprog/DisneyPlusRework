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
public class Tarjeta extends MetodoPago {

    private String nomTarjeta;
    private String numTarjeta;
    private String cvv;
    private String fv;

    public Tarjeta(String nomTarjeta, String numTarjeta, String cvv, String fv, String nombre) {
        super(nombre);
        this.nomTarjeta = nomTarjeta;
        this.numTarjeta = numTarjeta;
        this.cvv = cvv;
        this.fv = fv;
    }

}
