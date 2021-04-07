/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Usuario {

    private String correo;
    private String contraseña;
    private Boolean publicidad;

    private Suscripcion sus;
    private ArregloPerfil perfiles;

    public Usuario(String correo, String contraseña) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.publicidad = Boolean.FALSE;
        this.perfiles = new ArregloPerfil();
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setPublicidad(Boolean online) {
        this.publicidad = online;
    }

    public void setSus(Suscripcion sus) {
        this.sus = sus;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Boolean getPublicidad() {
        return publicidad;
    }

    public Suscripcion getSus() {
        return sus;
    }

    public ArregloPerfil getPerfiles() {
        return perfiles;
    }

}
