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
public class Ejercicios2 {
    public static void main(String[] args) {
        
        int valorx,valory,r;
        valorx=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero X"));
        valory=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero Y"));
        if (valorx<=0 || valorx>255)
        {
            r=-1;
            JOptionPane.showMessageDialog(null,"Resultado "+r);
        }
        else
        {
            int[] arreglo=new int[valory];
            arreglo[0]=valorx;
            for (int i = 1; i < arreglo.length; i++) 
            {
               valorx = valorx*(i+1);
               arreglo[i] = valorx;
                System.out.println(i+" "+arreglo[i]);               
            }
            for (int i = 0; i < arreglo.length; i++) 
            {
                if(i==(valory-1))
                {
                    r=arreglo[i];
                    JOptionPane.showMessageDialog(null,"Resultado "+r);
                }
            }
        }
        
    }
    
}
