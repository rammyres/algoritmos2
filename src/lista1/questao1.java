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
public class questao1 {
    public static void main(String[] args){
        String nome;
        int idade;
        float salario;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Digite seu salário: ");
        salario = sc.nextFloat();
        
        System.out.printf("Olá %s, você tem %d anos e recebe %.2f por mês\n", nome, idade, salario);
                
    }
    
}
