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
public class questao5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2, maior=0;
        
        System.out.println("Digite, na sequência, 2 números, verificaremos qual é o maior");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        if (num1 == num2){
            System.err.println("Números iguais");
        } else {
            if (num1 > num2){
                maior = num1;
            } else {
                if (num2 > num1){
                    maior = num2;
                }
            }
            System.out.println("O maior número é "+maior);
        }
        
    }       
}
