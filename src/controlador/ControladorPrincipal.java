/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.ArregloUsuario;
import vista.frmPrincipal;
import vista.frmSuscribirse1;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControladorPrincipal {

    private frmPrincipal vista;
    private ArregloUsuario modelo;

    public ControladorPrincipal(frmPrincipal vista, ArregloUsuario modelo) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.btnContinuar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.lblAlerta.setText("");
                if (modelo.buscarxCorreo(vista.TxtCorreo.getText())) {

                } else {
                    vista.lblAlerta.setText("Correo no registrado");
                }
            }
        });

        this.vista.btnSuscribirse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.btnSuscribirse.setForeground(new java.awt.Color(204, 204, 204));
                vista.dispose();
                frmSuscribirse1 frm = new frmSuscribirse1();
                ControladorSuscribirse1 control = new ControladorSuscribirse1(frm, modelo);
                control.iniciar();
            }
        });

    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

}
