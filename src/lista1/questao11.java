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
public class questao11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Digite um número inteiro, positivo e não-nulo, mostraremos os numeros entre ele e 0 em ordem decrescente: ");
        n = sc.nextInt();
        
        for (int i=n; i>=0; i--){
            System.out.print(" "+i);
        }
        
        System.out.println("");
    }    
}
