/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosNetsbeans;

import javax.swing.JOptionPane;

/**
 *
 * @author: Cinthya Salvatierra
 */
public class Ejercicios10 {
    public static void main(String[] args) {
      int x,y,suma=0;
        x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer número"));
        y=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el segundo número"));
         
        for (int i = x; i <= y; i++) {
            suma=0; 
            for (int j = 1  ; j < i; j++) {
                if ((i % j)==0) {
                    suma =suma+j;
                }
                if ((i==y)&&((i%j)!=0)) {
                    suma=0; 
                }
            }
            if (suma==i) {
                JOptionPane.showMessageDialog(null, "El número perfecto encontrado es = " +suma);
                i=y;
            }
        }
            if(suma==0) {
                JOptionPane.showMessageDialog(null, "-1");
            }
    }
    
}
