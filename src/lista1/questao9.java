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


public class questao9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int escolha;
        
        System.out.println("Digite um número entre 1 e 7, retornaremos o dia da semana correspondente: ");
        
        escolha = sc.nextInt();
        
        switch(escolha){
            case 1: System.out.println("Domingo");
                    break;
            case 2: System.out.println("Segunda");
                    break;
            case 3: System.out.println("Terça");
                    break;
            case 4: System.out.println("Quarta");
                    break;
            case 5: System.out.println("Quinta");
                    break;
            case 6: System.out.println("Sexta");
                    break;
            case 7: System.out.println("Sábado");
                    break;
                
        }
            
    }
    
}
