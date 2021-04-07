/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import modelo.ArregloUsuario;
import modelo.Plan;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Sistema {

    public static ArregloUsuario usuarios = new ArregloUsuario(10);

    //Planes
    public static Plan Mensual = new Plan("Mensual", (float) 25.90);
    public static Plan Anual = new Plan("Anual", (float) 259.90);

    //Contenido
}
