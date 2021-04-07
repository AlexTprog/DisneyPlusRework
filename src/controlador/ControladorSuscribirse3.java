/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ArregloUsuario;
import vista.frmSuscribirse3;
import vista.frmSuscribirse4;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControladorSuscribirse3 {

    private frmSuscribirse3 vista;
    private ArregloUsuario modelo;

    public ControladorSuscribirse3(frmSuscribirse3 vista, ArregloUsuario modelo) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.lblCORREO.setText(modelo.getLastUser().getCorreo());

        this.vista.btnContinuar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.lblAlerta.setText("");
                if (!vista.txtContra.getText().equals("")) {
                    if (vista.txtContra.getText().length() < 6) {
                        vista.lblAlerta.setText("Use al menos 6 caracteres.");
                    } else {
                        modelo.getLastUser().setContraseña(vista.txtContra.getText());

                        vista.dispose();
                        frmSuscribirse4 frm = new frmSuscribirse4();
                        ControladorSuscribirse4 control = new ControladorSuscribirse4(frm, modelo);
                        control.iniciar();

                    }
                } else {
                    vista.lblAlerta.setText("Ingrese un contraseña.");
                }
            }
        });

    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

}
