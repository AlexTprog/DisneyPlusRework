/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ArregloUsuario;
import vista.frmCrearperfil;
import vista.frmElegirAvatar;
import vista.frmElegirPerfil;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControladorCrearPerfil {

    private frmCrearperfil vista;
    private ArregloUsuario modelo;

    public ControladorCrearPerfil(frmCrearperfil vista, ArregloUsuario modelo) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource(modelo.getLastUser().getPerfiles().getLastPerfil().getAvatar())));

        this.vista.btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.lblAlerta.setText("");
                if (!vista.TxtNomPerfil.getText().equals("")) {
                    modelo.getLastUser().getPerfiles().getLastPerfil().setNombre(vista.TxtNomPerfil.getText());
                    modelo.getLastUser().getPerfiles().getLastPerfil().setInfantil(vista.chkInfanitl.isSelected());

                    vista.dispose();
                    frmElegirPerfil frm = new frmElegirPerfil();
                    ControladorElegirPerfil control = new ControladorElegirPerfil(frm, modelo);
                    control.iniciar();
                } else {
                    vista.lblAlerta.setText("Escriba un nombre para el perfil.");
                }
            }
        });

        this.vista.btnEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                modelo.getLastUser().getPerfiles().borrarPerfil();
                frmElegirAvatar frm = new frmElegirAvatar();
                ControladorElegirAvatar control = new ControladorElegirAvatar(frm, modelo);
                control.iniciar();
            }
        });

        this.vista.btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.getLastUser().getPerfiles().borrarPerfil();

                vista.dispose();
                frmElegirAvatar frm = new frmElegirAvatar();
                ControladorElegirAvatar control = new ControladorElegirAvatar(frm, modelo);
                control.iniciar();

            }
        });

    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
