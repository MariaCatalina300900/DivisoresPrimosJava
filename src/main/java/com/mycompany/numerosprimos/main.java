/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numerosprimos;

import java.util.Scanner;

public class main {
   public static void main(String args[]){
      int number;
      Scanner sc = new Scanner(System.in);
      //Con esta clase se lee el numero
      System.out.println("Ingrese numero");
      number = Integer.parseInt(sc.nextLine());
     //Se transforma la linea ingresada a formato de numero
      for(int i = 2; i< number; i++) {
         while(number%i == 0) {
             
            System.out.println(i+" ");
            number = number/i;
            
         }
      }
      if(number >2) {
         //imprime el numero primo
          System.out.println(number);
         
      }
   }
}
