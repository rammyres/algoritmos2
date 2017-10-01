/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author rammyres
 */
public class questao13 {
    public static int fatorial(int num){
        if (num<=1){
            return 1;
        } else {
            return fatorial(num-1)*num;
        }
       
    }
    
    public static void main(String[] args){
        if(args.length==1){
            
            int numero = Integer.parseInt(args[0]);
            System.out.printf("%d! é %d \n", numero, fatorial(numero));
        } else {
            System.out.println("Você deve passar como argumento um único parâmetro um número inteiro, retornaremos o fatorial (!) dele");
        }      
        
    }
    
}
