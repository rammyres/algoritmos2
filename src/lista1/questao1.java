/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner; //O pacote utils possui diversos utilitários
                          //A classe Scanner lê a entrada designada pelo usuário

/**
 *
 * @author rammyres
 */
    /*
      Classes publicas são acessíveis de fora do pacote, elas podem ser importadas
      e instânciadas por outras classes
    */
public class questao1 {
   /*
    Como C existem funções no Java, mas aqui elas são chamadas de "métodos". Metódos 
    também podem ser publicos ou privados. Os métodos também podem ser estáticos 
    (static), o que quer dizer que eles só podem ser executados a partir da 
    classe-mãe.
    */
    
    public static void main(String[] args){
        /*
        As classes devem ser instânciadas como objetos ao invés de só declaradas. 
        De forma geral as classes são abstraidas (descritas) e para que sejam
        usadas elas devem ser "criadas" na memória como um objeto útil. 
        Ao instanciar a classe pode receber um paramêtro ou um valor (inicialização).
        No caso o objeto sc é uma instância da classe Scanner que recebeu como 
        entrada o stdin (System.in), que é a entrada do teclado, tanto no console (Windows)
        quanto no terminal (Linux e outros Unix-like).
        */
        Scanner sc = new Scanner(System.in);  
        
        /*
        A rigor as variáveis de tipos comuns (inteiros, reais, etc) também são
        classes e as variáveis também são objetos, mas as mesmas não precisam 
        ser instanciadas. 
        */
        String nome;
        int idade;
        float salario;
                
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine(); //O metodo nextLine captura a proxima linha de entrada do teclado e retorna o mesmo 
                              // como uma String
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt(); //O método nextInt faz o mesmo que o nextLine, mas retorna um inteiro
        System.out.println("Digite seu salário: ");
        salario = sc.nextFloat(); //Acho que já deu pra entender, né?
        
        System.out.printf("Olá %s, você tem %d anos e recebe %.2f por mês\n", nome, idade, salario);
        /*A classe System possui interfaces com os objetos do sistema, como entradas (in) e saidas (out)
          Entre seus metodos estão a possibilidade de impressão del inhas simples (System.out.println),
          com dois parametros. 
          Há também o metodo printf, que funciona de forma identica ao printf do C
        */
                
    }
    
}
