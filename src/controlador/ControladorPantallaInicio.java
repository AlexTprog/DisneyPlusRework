    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import modelo.ArregloUsuario;
import vista.frmEditarPerfil;
import vista.frmPantallaInicio;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControladorPantallaInicio {
    private frmPantallaInicio vista;
    private ArregloUsuario modelo;

    public ControladorPantallaInicio(frmPantallaInicio vista, ArregloUsuario modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        this.vista.btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource(modelo.getLastUser().getPerfiles().getEleccion().getAvatar())));
        ImageIcon img =  new ImageIcon(getClass().getResource(modelo.getLastUser().getPerfiles().getEleccion().getAvatar()));
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(this.vista.btnPerfil.getWidth(), this.vista.btnPerfil.getHeight(), Image.SCALE_DEFAULT));;
        this.vista.btnPerfil.setIcon(icono);
        this.vista.btnPerfil.repaint();
        
        this.vista.lblNombrePerfil.setText(modelo.getLastUser().getPerfiles().getEleccion().getNombre());
        
        this.vista.bntInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmPantallaInicio frm = new frmPantallaInicio();
                ControladorPantallaInicio control = new ControladorPantallaInicio(frm, modelo);
                control.iniciar();
            }
        });
        
        this.vista.btnRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        this.vista.btnLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        this.vista.btnPerfil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmEditarPerfil frm = new frmEditarPerfil();
                ControladorEditarPerfil control = new ControladorEditarPerfil(frm, modelo);
                control.iniciar();
            }
        });
        
    }
    
    public void iniciar(){
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
