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
public class ArregloUsuario {

    private Usuario[] users;
    private int indice;

    public ArregloUsuario(int tamaño) {
        this.users = new Usuario[tamaño];
        this.indice = 0;
    }

    public Boolean add(Usuario u) {
        Boolean result = false;
        if (this.indice < this.users.length) {
            this.users[this.indice] = u;
            this.indice++;
            result = true;
        }
        return result;
    }

    public Usuario getLastUser() {
        Usuario u = users[indice - 1];
        return u;
    }

    public Boolean buscarxCorreo(String correo) {
        Boolean result = false;
        for (int i = 0; i < indice; i++) {
            if (correo.equals(users[i].getCorreo())) {
                result = true;
            }
        }
        return result;
    }

    public void borrarUsuario() {
        users[indice] = null;
        indice--;
    }
}
