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
public class questao4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final float ano = (float) 365.25; //o modificador final impede que a variável tenha seu valor alterado, 
                                          //tornando-se, assim uma constante
        int idade;
    
        System.out.println("Digite sua idade em anos, retornaremos o valor aproximado de dias: ");
        idade = sc.nextInt();
        
        System.out.printf("Sua idade aproximada é de %.2f dias\n", idade*ano);
        
    }
    
}
