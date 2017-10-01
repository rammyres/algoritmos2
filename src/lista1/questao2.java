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
public class questao2 {
    public static void main(String[] args){
        String nome;
        float media;
        float[] nota = new float[5];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Olá, digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite agora suas notas, para que possamos calcular a média");
              for(int i=1; i<5; i++) {
            System.out.println("Nota "+i);
            nota[i] = sc.nextFloat();           
        }
        
        for (int i=1; i<5; i++){
            nota[0]+=nota[i];         
        }
        
        System.out.printf("Olá %s, sua média é %.2f\n", nome, nota[0]/4);
    }    
}