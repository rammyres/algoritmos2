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
public class questao3 {
    public static void main(String[] args){
        int numero;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro, ele será elevado ao quadrado: ");
        
        numero = sc.nextInt();
        
        System.out.printf("O quadrado de %d é %d\n", numero, numero*numero);
    
    }
    
}
