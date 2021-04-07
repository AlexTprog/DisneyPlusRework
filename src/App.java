
import controlador.ControladorPrincipal;
import modelo.Usuario;
import sistema.Sistema;
import vista.frmPrincipal;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alexa
 */
public class App {

    public static void main(String[] arg) {
        Sistema.usuarios.add(new Usuario("alex@", "111"));
        Sistema.usuarios.add(new Usuario("A", "111"));
        Sistema.usuarios.add(new Usuario("B", "111"));

        frmPrincipal frm = new frmPrincipal();
        ControladorPrincipal control = new ControladorPrincipal(frm, Sistema.usuarios);
        control.iniciar();
    }
}
