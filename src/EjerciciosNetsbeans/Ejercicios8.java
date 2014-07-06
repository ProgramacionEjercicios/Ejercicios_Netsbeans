/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosNetsbeans;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicios8 {
     public static void main(String args[]){  
        int contador=0;
        String s = JOptionPane.showInputDialog("Ingrese una frase");
        s=" "+s;
        int tamano= s.length();
        char[] cadena=s.toCharArray();
        

        for (int i = 0; i < tamano; i++) {
            if ((cadena[i]=='a')||cadena[i]=='A') {
                contador++;
                for (int j = i; j < tamano; j++) {
                    if (cadena[i]==' ') {
                        i=j;
                        j=tamano;
                    }
                }
            }
            
           
        }
        if (contador==0) {
                    JOptionPane.showMessageDialog(null, "En su frase escrita no hay Palabras que contengas la letra 'a'","Lo sentimos",JOptionPane.ERROR_MESSAGE);
        }
        else{
        JOptionPane.showMessageDialog(null, "El número de palabras que contienen la letra a son: " +contador);
        }
    }
    
     
   
    
}
