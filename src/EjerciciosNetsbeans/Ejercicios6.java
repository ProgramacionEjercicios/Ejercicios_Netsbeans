/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosNetsbeans;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * Author:Cinthya Salvatierra Carranza 
 */
public class Ejercicios6 {
public static void main(String[] args) throws IOException {
    
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

      System.out.printf("Ingrese uns frase : ");
      String frase=br.readLine();
      String []cads=frase.split(" ");

      for(int i=cads.length-1;i>=0;i--){
          System.out.print(cads[i]+" ");
      }

    }

}
