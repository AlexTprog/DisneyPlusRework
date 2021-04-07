/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import modelo.ArregloUsuario;
import modelo.Usuario;
import vista.frmEditarPerfiles;
import vista.frmElegirAvatar;
import vista.frmElegirPerfil;
import vista.frmPantallaInicio;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControladorElegirPerfil {

    private frmElegirPerfil vista;
    private ArregloUsuario modelo;

    public ControladorElegirPerfil(frmElegirPerfil vista, ArregloUsuario modelo) {
        this.vista = vista;
        this.modelo = modelo;

        Usuario user = modelo.getLastUser();
        if (user.getPerfiles().getIndice() == 1) {
            cambiarLayout(vista.P1);

            colocarDatos(vista.btnP1, vista.lblP1, 1);

            this.vista.btnCrearPerfil.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    crearPerf();
                }
            });

            this.vista.btnP1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(1);
                }
            });

        } else if (user.getPerfiles().getIndice() == 2) {
            cambiarLayout(vista.P2);

            colocarDatos(vista.btnP1_2, vista.lblP1_2, 1);
            colocarDatos(vista.btnP2, vista.lblP2, 2);

            this.vista.btnCrearPerfil1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    crearPerf();
                }
            });

            this.vista.btnP1_2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(1);
                }
            });

            this.vista.btnP2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(2);
                }
            });

        } else if (user.getPerfiles().getIndice() == 3) {
            cambiarLayout(vista.P3);

            colocarDatos(vista.btnP1_3, vista.lblP1_3, 1);
            colocarDatos(vista.btnP2_1, vista.lblP2_1, 2);
            colocarDatos(vista.btnP3, vista.lblP3, 3);

            this.vista.btnCrearPerfil2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    crearPerf();
                }
            });

            this.vista.btnP1_3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(1);
                }
            });

            this.vista.btnP2_1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(2);
                }
            });

            this.vista.btnP3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(3);
                }
            });

        } else if (user.getPerfiles().getIndice() == 4) {
            cambiarLayout(vista.P4);

            colocarDatos(vista.btnP1_4, vista.lblP1_4, 1);
            colocarDatos(vista.btnP2_2, vista.lblP2_2, 2);
            colocarDatos(vista.btnP3_1, vista.lblP3_1, 3);
            colocarDatos(vista.btnP4, vista.lblP4, 4);

            this.vista.btnCrearPerfil3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    crearPerf();
                }
            });

            this.vista.btnP1_4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(1);
                }
            });

            this.vista.btnP2_2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(2);
                }
            });

            this.vista.btnP3_1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(3);
                }
            });

            this.vista.btnP4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(4);
                }
            });

        } else if (user.getPerfiles().getIndice() == 5) {
            cambiarLayout(vista.P5);

            colocarDatos(vista.btnP1_5, vista.lblP1_5, 1);
            colocarDatos(vista.btnP2_3, vista.lblP2_3, 2);
            colocarDatos(vista.btnP3_2, vista.lblP3_2, 3);
            colocarDatos(vista.btnP4_1, vista.lblP4_1, 4);
            colocarDatos(vista.btnP5, vista.lblP5, 5);

            this.vista.btnCrearPerfil4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    crearPerf();
                }
            });
            
            this.vista.btnP1_5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(1);
                }
            });

            this.vista.btnP2_3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(2);
                }
            });

            this.vista.btnP3_2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(3);
                }
            });

            this.vista.btnP4_1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(4);
                }
            });
            
            this.vista.btnP5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(5);
                }
            });

        } else if (user.getPerfiles().getIndice() == 6) {
            cambiarLayout(vista.P6);

            colocarDatos(vista.btnP1_6, vista.lblP1_6, 1);
            colocarDatos(vista.btnP2_4, vista.lblP2_4, 2);
            colocarDatos(vista.btnP3_3, vista.lblP3_3, 3);
            colocarDatos(vista.btnP4_2, vista.lblP4_2, 4);
            colocarDatos(vista.btnP5_1, vista.lblP5_1, 5);
            colocarDatos(vista.btnP6, vista.lblP6, 6);

            this.vista.btnCrearPerfil5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    crearPerf();
                }
            });
            
            this.vista.btnP1_6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(1);
                }
            });

            this.vista.btnP2_4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(2);
                }
            });

            this.vista.btnP3_3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(3);
                }
            });

            this.vista.btnP4_2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(4);
                }
            });
            
            this.vista.btnP5_1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(5);
                }
            });
            
             this.vista.btnP6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(6);
                }
            });
            
        } else if (user.getPerfiles().getIndice() == 7) {
            cambiarLayout(vista.P7);

            colocarDatos(vista.btnP1_7, vista.lblP1_7, 1);
            colocarDatos(vista.btnP2_5, vista.lblP2_5, 2);
            colocarDatos(vista.btnP3_4, vista.lblP3_4, 3);
            colocarDatos(vista.btnP4_3, vista.lblP4_3, 4);
            colocarDatos(vista.btnP5_2, vista.lblP5_2, 5);
            colocarDatos(vista.btnP6_1, vista.lblP6_1, 6);
            colocarDatos(vista.btnP7, vista.lblP7, 7);
            
            this.vista.btnCrearPerfil5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    crearPerf();
                }
            });
            
            this.vista.btnP1_7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(1);
                }
            });

            this.vista.btnP2_5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(2);
                }
            });

            this.vista.btnP3_4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(3);
                }
            });

            this.vista.btnP4_3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(4);
                }
            });
            
            this.vista.btnP5_2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(5);
                }
            });
            
             this.vista.btnP6_1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(6);
                }
            });
             
             this.vista.btnP7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    elegirPerfil(7);
                }
            });
        }

        this.vista.btnEditarPerfiles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmEditarPerfiles frm = new frmEditarPerfiles();
                ControladorEditarPerfiles control = new ControladorEditarPerfiles(frm, modelo);
                control.iniciar();
            }
        });

    }

    private void elegirPerfil(int n) {
        modelo.getLastUser().getPerfiles().setEleccion(n);
        vista.dispose();
        frmPantallaInicio frm = new frmPantallaInicio();
        ControladorPantallaInicio control = new ControladorPantallaInicio(frm, modelo);
        control.iniciar();
    }

    private void colocarDatos(JButton btn, JLabel lbl, int pos) {
        lbl.setText(modelo.getLastUser().getPerfiles().getPerfilxPos(pos).getNombre());
        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(modelo.getLastUser().getPerfiles().getPerfilxPos(pos).getAvatar())));
    }

    private void cambiarLayout(Component p) {
        vista.panPerfiles.removeAll();
        vista.panPerfiles.add(p);
        vista.panPerfiles.repaint();
        vista.panPerfiles.revalidate();
    }

    private void crearPerf() {
        vista.dispose();
        frmElegirAvatar frm = new frmElegirAvatar();
        ControladorElegirAvatar control = new ControladorElegirAvatar(frm, modelo);
        control.iniciar();
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
