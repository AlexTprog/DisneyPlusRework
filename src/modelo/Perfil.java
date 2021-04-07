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
public class Perfil {

    private String nombre;
    private String avatar;
    private Boolean infantil;

    public Perfil(String nombre, Boolean infantil) {
        this.nombre = nombre;
        this.infantil = true;
        this.avatar = "/imagenes/Avatar/disney/porDefecto.JPG";
    }

    public String getNombre() {
        return nombre;
    }

    public String getAvatar() {
        return avatar;
    }

    public Boolean getInfantil() {
        return infantil;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setInfantil(Boolean infantil) {
        this.infantil = infantil;
    }

}
