/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ArregloUsuario;
import modelo.Usuario;
import vista.frmPrincipal;
import vista.frmSuscribirse1;
import vista.frmSuscribirse2;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControladorSuscribirse1 {

    private frmSuscribirse1 vista;
    private ArregloUsuario modelo;

    public ControladorSuscribirse1(frmSuscribirse1 vista, ArregloUsuario modelo) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.btnContinuar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.lblAlerta.setText("");
                if (!vista.TxtCorreo.getText().equals("")) {
                    if (modelo.buscarxCorreo(vista.TxtCorreo.getText())) {
                        vista.lblAlerta.setText("El correo ya registrado");
                    } else {
                        modelo.add(new Usuario(vista.TxtCorreo.getText(), ""));
                        if (vista.checkCorreos.isSelected()) {
                            modelo.getLastUser().setPublicidad(Boolean.TRUE);
                        }
                        vista.dispose();
                        frmSuscribirse2 frm = new frmSuscribirse2();
                        ControladorSuscribirse2 control = new ControladorSuscribirse2(frm, modelo);
                        control.iniciar();

                    }
                } else {
                    vista.lblAlerta.setText("Ingrese un correo valido");
                }
            }
        });

        this.vista.btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                vista.dispose();
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
