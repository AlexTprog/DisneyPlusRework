/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import modelo.ArregloUsuario;
import modelo.Paypal;
import modelo.Plan;
import modelo.Suscripcion;
import modelo.Tarjeta;
import vista.frmElegirAvatar;
import vista.frmPrincipal;
import vista.frmSuscribirse4;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControladorSuscribirse4 {

    private frmSuscribirse4 vista;
    private ArregloUsuario modelo;

    Plan eleccion = null;

    public ControladorSuscribirse4(frmSuscribirse4 vista, ArregloUsuario modelo) {
        this.vista = vista;
        this.modelo = modelo;

        //Mostrar Fecha de venc
        LocalDate localDate = LocalDate.now().plusDays(7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedLocalDate = localDate.format(formatter);
        this.vista.lblFecha.setText(formattedLocalDate);

        if (this.vista.rbtnMensual.isSelected()) {
            vista.lblPrecio.setText("PEN " + Float.toString(sistema.Sistema.Anual.getMonto()));
        }

        this.vista.rbtnAnual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.lblPrecio.setText("PEN " + Float.toString(sistema.Sistema.Anual.getMonto()));
                eleccion = sistema.Sistema.Anual;
            }
        });

        this.vista.rbtnMensual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.lblPrecio.setText("PEN " + Float.toString(sistema.Sistema.Mensual.getMonto()));
                eleccion = sistema.Sistema.Mensual;
            }
        });

        this.vista.btnPagarPaypal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String correoPaypal = vista.txtPaypal.getText();
                modelo.getLastUser().setSus(new Suscripcion(new Paypal(Boolean.TRUE, correoPaypal,"Paypal"), eleccion));

                vista.dispose();
                frmElegirAvatar frm = new frmElegirAvatar();
                ControladorElegirAvatar control = new ControladorElegirAvatar(frm, modelo);
                control.iniciar();
            }
        });

        this.vista.btnContinuar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomTarj = vista.txtNomTarjeta.getText();
                String nTarjeta = vista.txtNumTarjeta.getText();
                String fv = vista.txtFven.getText();
                String cvv = vista.txtCVV.getText();
                vista.lblAlerta.setText("");
                if (nomTarj.equals("") && nTarjeta.equals("") && fv.equals("") && cvv.equals("")) {
                    vista.lblAlerta.setText("Complete los datos");
                } else {
                    modelo.getLastUser().setSus(new Suscripcion(new Tarjeta("Tarjeta", nomTarj, nTarjeta, cvv, fv), eleccion));

                    vista.dispose();
                    frmElegirAvatar frm = new frmElegirAvatar();
                    ControladorElegirAvatar control = new ControladorElegirAvatar(frm, modelo);
                    control.iniciar();

                }
            }
        });

        this.vista.btnPaypal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.panPago.removeAll();
                vista.panPago.add(vista.panPaypal);
                vista.panPago.repaint();
                vista.panPago.revalidate();
            }
        });

        this.vista.btnTarjeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.panPago.removeAll();
                vista.panPago.add(vista.panTarjeta);
                vista.panPago.repaint();
                vista.panPago.revalidate();
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
