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
public class ArregloPerfil {

    private Perfil[] perfil;
    private int indice;
    private int eleccion;

    public ArregloPerfil() {
        this.perfil = new Perfil[7];
        this.indice = 0;
    }

    public Boolean add(Perfil p) {
        Boolean result = false;
        if (this.indice < this.perfil.length) {
            this.perfil[this.indice] = p;
            this.indice++;
            result = true;
        }
        return result;
    }

    public Perfil getLastPerfil() {
        Perfil p = perfil[indice - 1];
        return p;
    }

    public void borrarPerfil() {
        perfil[indice] = null;
        indice--;
    }

    public int getIndice() {
        return indice;
    }

    public Perfil getPerfilxPos(int pos) {
        Perfil p = perfil[pos-1];
        return p;
    }
    
    public void setEleccion(int n){
        eleccion = n;
    }
    
    public Perfil getEleccion(){
        return perfil[eleccion-1];
    }
}
