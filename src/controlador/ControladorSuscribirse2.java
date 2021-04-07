/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ArregloUsuario;
import vista.frmPrincipal;
import vista.frmSuscribirse2;
import vista.frmSuscribirse3;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControladorSuscribirse2 {

    private frmSuscribirse2 vista;
    private ArregloUsuario modelo;

    public ControladorSuscribirse2(frmSuscribirse2 vista, ArregloUsuario modelo) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.btnAceptarCont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                vista.dispose();
                frmSuscribirse3 frm = new frmSuscribirse3();
                ControladorSuscribirse3 control = new ControladorSuscribirse3(frm, modelo);
                control.iniciar();

            }
        });

        this.vista.btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                vista.dispose();

                modelo.borrarUsuario();

                frmPrincipal frm = new frmPrincipal();
                ControladorPrincipal control = new ControladorPrincipal(frm, modelo);
                control.iniciar();

            }
        });
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
