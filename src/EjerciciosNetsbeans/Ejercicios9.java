/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosNetsbeans;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class Ejercicios9 {
    public static void main(String args[]) {
    int numero, numbertest=0;
        boolean rep = false;
        System.out.print("Ingrese un numero ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
       
        while(!rep){
            numbertest++;
            if(numbertest * numbertest == numero){
                rep = true;
                System.out.println("TRUE");
            }
            else if(numbertest * numbertest > numero){
                System.out.println("FALSE");
                rep = true;
            }
        }
    }
   
    
}
