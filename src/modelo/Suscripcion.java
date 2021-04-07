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
public class Suscripcion {

    private MetodoPago metodo;
    private Plan plan;

    public Suscripcion(MetodoPago metodo, Plan plan) {
        this.metodo = metodo;
        this.plan = plan;
    }

}
