/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoruleta;

import javax.swing.JOptionPane;

/**
 *
 * @author ricky_000
 */
public class ProyectoRuleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fichas nuevo = new Fichas();
        Apuestas unNumero = new Apuestas();
        
        
        String br = System.getProperty("line.separator");
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoge una opcion" + br + "0: Ingresar fichas." +
                br + "1: Apostar fichas." + br + "2: Retirar fichas." + br + "3: Ver cantidad de fichas."));
        
       switch(opcion){
           case 0:
               System.out.println(nuevo.CambioaFichas(1)+" fichas.");
               break;
           case 1:
               System.out.println("Has ganado "+unNumero.numero(2)+" fichas.");
               break;
           case 2:
               System.out.println(nuevo.CambioaEuros(nuevo.fichas)+" euro.");
               break;
           case 3:
               System.out.println("Tienes " + nuevo.fichas + " fichas");
               break;
       }
    }
    
}
