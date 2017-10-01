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
public class questao6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite um inteiro, ele será dobrado e caso seu valor seja maior que 30, terá a multiplicação exibida: ");
        numero = sc.nextInt();
        
        if(numero*2>30){
            System.out.println("Numero maior que 30: "+numero*2);
        }
    
    }
    
}
