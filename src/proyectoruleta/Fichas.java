/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoruleta;

/**
 *
 * @author ricky_000
 */
public class Fichas{
     int euros;
     int fichas;

    public Fichas() {
    }

    public Fichas(int euros, int fichas) {
        this.euros = euros;
        this.fichas = fichas;
    }

    public int getEuros() {
        return euros;
    }

    public void setEuros(int euros) {
        this.euros = euros;
    }

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }
    
    public int CambioaFichas(int dinero){
        int cambio = dinero*10;
        fichas= fichas + cambio;
        return fichas;
    }
    
    public int CambioaEuros(int euros){
        euros=fichas/10;
        return euros;
    }
}
