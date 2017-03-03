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
public class Apuestas extends Fichas{
    //METODO PARA APOSTAR POR UN NUMERO
    public int numero(int ficha){
        int total=0;
        if(ficha>fichas){
           total = ficha*36;
        }
       return total;
    }
    
}
