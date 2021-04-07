/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ArregloUsuario;
import modelo.Perfil;
import vista.frmCrearperfil;
import vista.frmElegirAvatar;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControladorElegirAvatar {

    private frmElegirAvatar vista;
    private ArregloUsuario modelo;

    public ControladorElegirAvatar(frmElegirAvatar vista, ArregloUsuario modelo) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.btnSaltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.getLastUser().getPerfiles().add(new Perfil("", Boolean.FALSE));
                vista.dispose();

                frmCrearperfil frm = new frmCrearperfil();
                ControladorCrearPerfil control  = new ControladorCrearPerfil(frm, modelo);
                control.iniciar();
            }
        });

        this.vista.btnD1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elegirAvatar("/imagenes/Avatar/disney/infantil_1.JPG");
            }
        });

        this.vista.btnD2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elegirAvatar("/imagenes/Avatar/disney/infantil_2.JPG");
            }
        });

        this.vista.btnD3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elegirAvatar("/imagenes/Avatar/disney/infantil_3.JPG");
            }
        });

        this.vista.btnD4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elegirAvatar("/imagenes/Avatar/disney/infantil_4.JPG");
            }
        });

        this.vista.btnD5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elegirAvatar("/imagenes/Avatar/disney/infantil_5.JPG");
            }
        });

        this.vista.btnD6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elegirAvatar("/imagenes/Avatar/disney/infantil_6.JPG");
            }
        });

        this.vista.btnM1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elegirAvatar("/imagenes/Avatar/micky/micky_1.JPG");
            }
        });

        this.vista.btnM2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elegirAvatar("/imagenes/Avatar/micky/micky_2.JPG");
            }
        });

        this.vista.btnM3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elegirAvatar("/imagenes/Avatar/micky/micky_3.JPG");
            }
        });

        this.vista.btnM4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elegirAvatar("/imagenes/Avatar/micky/micky_4.JPG");
            }
        });

        this.vista.btnM5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elegirAvatar("/imagenes/Avatar/micky/micky_5.JPG");
            }
        });

        this.vista.btnM6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elegirAvatar("/imagenes/Avatar/micky/micky_6.JPG");
            }
        });

        this.vista.btnN1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elegirAvatar("/imagenes/Avatar/National/national_1.JPG");
            }
        });

        this.vista.btnN2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elegirAvatar("/imagenes/Avatar/National/national_2.JPG");
            }
        });

        this.vista.btnN3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elegirAvatar("/imagenes/Avatar/National/national_3.JPG");
            }
        });

        this.vista.btnN4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elegirAvatar("/imagenes/Avatar/National/national_4.JPG");
            }
        });

        this.vista.btnN5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elegirAvatar("/imagenes/Avatar/National/national_5.JPG");
            }
        });

        this.vista.btnN6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elegirAvatar("/imagenes/Avatar/National/national_6.JPG");
            }
        });

    }

    private void elegirAvatar(String dir) {
        modelo.getLastUser().getPerfiles().add(new Perfil("", Boolean.FALSE));
        modelo.getLastUser().getPerfiles().getLastPerfil().setAvatar(dir);

        vista.dispose();

        frmCrearperfil frmperfil = new frmCrearperfil();
        ControladorCrearPerfil control = new ControladorCrearPerfil(frmperfil, modelo);
        control.iniciar();

    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
