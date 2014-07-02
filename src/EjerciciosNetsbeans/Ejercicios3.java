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
public class Ejercicios3 {
    public static void main(String[] args) {
        
        int r,proceso;
        int valorx = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero X"));
        int valory=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero Y"));
        if (valorx<=0 || valorx>255)
        {
            r=-1;
            JOptionPane.showMessageDialog(null,"Resultado de la serie es: "+r);
        }
        else
        {
            int[] arreglo=new int[valory];
            arreglo[0]=valorx;
            for (int i = 1;i<arreglo.length; i++) 
            {
               proceso=valorx/(i+1);
               arreglo[i]=proceso;           
            }
            for (int i = 0; i < arreglo.length; i++) 
            { 
                
              if(i==(valory-1))
                {
                    
                    JOptionPane.showMessageDialog(null,"Resultado de la serie "+arreglo[i]);
                }  
            }
        }
    }
    
}
