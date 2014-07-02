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
public class Ejercicios4 {
     public static void main(String args[]){  
        String frase1 ;
        String frase2 ;
        int tamano1,tamano2;
        frase1 =JOptionPane.showInputDialog(null,"Ingrese una frase","Frase 1",JOptionPane.QUESTION_MESSAGE);
        frase2= JOptionPane.showInputDialog(null,"Ingrese otra frase","Frase 2",JOptionPane.QUESTION_MESSAGE);
        frase1=frase1.toLowerCase();
        frase2=frase2.toLowerCase();
        tamano2=frase2.length();
        tamano1=frase1.length();
              
        char [] cadenaS1=frase1.toCharArray();
        char[] cadenaS2=frase2.toCharArray();
        //String cadenaSalida = null;
        
        for (int i = 0; i < tamano2; i++) {
            for (int j = 0; j < tamano1; j++) {
                if (cadenaS1[j]==cadenaS2[i]) {
                    cadenaS1[j]=' ';
                }
            }
            
        }
        String salida="";
        for (int i=0;i<tamano1;i++)
               if (cadenaS1[i]!=' ') {
                   
                  salida=salida+cadenaS1[i]; 
                   //System.out.println(" " + cadenaS1[i]);
               }
        JOptionPane.showMessageDialog(null,salida,"Resultado",JOptionPane.INFORMATION_MESSAGE);

    }
    
}
