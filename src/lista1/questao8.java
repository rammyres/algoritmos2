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
/* 
Exemplificando o que disse na questão 1. Ao invés de declarar diretamente as 
variáveis vou criar a classe pessoa, que conterá nela a variável idade e os 
métodos para receber a idade (getIdade) e verificar a categoria (printIdade).
Essa abordagem permite um retrabalho menor, numa equipe poderiamos ter uma pessoa
responsável só por uma determinada classe. A pessoa resposável por outra parte
não precisaria entender o que o outro faz, somente faria uso (encapsulamento).
*/
class pessoa{
    Scanner sc = new Scanner(System.in);
    public static int idade;
    
    public void getIdade(){
        System.out.println("Digite sua idade, verificaremos se você é maior, menor ou idoso: ");
        this.idade = sc.nextInt();        
    }
    
    public void printIdade(int idade){
        if(this.idade>=65){//this quer dizer que a classe deve fazer referência a um membro dela prória
                           //como seus próprios métodos, variáveis globais (públicas) e subclasses
            System.out.println("Idade igual ou superior a 65 anos, você é idoso");
        } else {
            if (this.idade < 65 && this.idade >=18) {
                System.out.println("Idade igual ou superior a 18 anos, mas menor que 65, você é maior de idade");
            } else {
            System.out.println("Idade inferior a 18 anos, você é menor de idade");
            }
        }
    }
}
public class questao8 {
    /*
        A classe principal aqui é bem simples, já que tudo está encapsulado na 
        classe pessoa: somente instanciamos a classe pessoa no objeto fulano e
        usamos seus métodos para obter a idade e avaliar a categoria. 
    */
    public static void main(String[] args){
    pessoa fulano = new pessoa(); 
    
    fulano.getIdade();
    fulano.printIdade(fulano.idade);
    
    }   
}
