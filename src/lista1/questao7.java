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
public class questao7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ano;
        
        System.out.println("Digite um ano, verificaremos se ele é bissexto: ");
        ano = sc.nextInt();
        
        if (ano%400 == 0){
            System.out.println(ano+" é um ano bissexto");
        } else {
            if (ano%4 == 0 && ano%10 !=0){
                System.out.println(ano+" é um ano bissexto");
            } else {
                System.out.println(ano+" não é um ano bissexto");
            }
        }
    
    }
    
}
