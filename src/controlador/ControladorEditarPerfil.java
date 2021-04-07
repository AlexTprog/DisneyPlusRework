/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ArregloUsuario;
import vista.frmEditarPerfil;
import vista.frmEditarPerfiles;
import vista.frmElegirAvatar;
import vista.frmElegirPerfil;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControladorEditarPerfil {

    private frmEditarPerfil vista;
    private ArregloUsuario modelo;

    public ControladorEditarPerfil(frmEditarPerfil vista, ArregloUsuario modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        this.vista.TxtNomPerfil.setText(modelo.getLastUser().getPerfiles().getEleccion().getNombre());
        this.vista.btnAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource(modelo.getLastUser().getPerfiles().getEleccion().getAvatar())));
        this.vista.chkInfanitl.setSelected(modelo.getLastUser().getPerfiles().getEleccion().getInfantil());

        this.vista.btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.getLastUser().getPerfiles().getEleccion().setNombre(vista.TxtNomPerfil.getText());
                modelo.getLastUser().getPerfiles().getEleccion().setInfantil(vista.chkInfanitl.isSelected());

                vista.dispose();
                frmEditarPerfiles frm = new frmEditarPerfiles();
                ControladorEditarPerfiles control = new ControladorEditarPerfiles(frm, modelo);
                control.iniciar();
            }
        });
        
        this.vista.btnAvatar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                vista.dispose();
                
                frmElegirAvatar frm = new frmElegirAvatar();
                ControladorEditarAvatar control = new ControladorEditarAvatar(frm, modelo);
                control.iniciar();
            }
        });
        
        
        this.vista.btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmEditarPerfiles frm = new frmEditarPerfiles();
                ControladorEditarPerfiles control = new ControladorEditarPerfiles(frm, modelo);
                control.iniciar();
            }
        });

    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

}
