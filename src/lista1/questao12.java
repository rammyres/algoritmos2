/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

/**
 *
 * @author rammyres
 */
public class questao12 {
    
    public static void main(String[] args){
                
        if(args.length==2){
            int sup = Integer.parseInt(args[1]);
            int inf = Integer.parseInt(args[0]);
            if (sup > inf){
                for(int i=inf; i<=sup; i++){
                    System.out.print(i+" ");
                }                         
            } else {
                System.out.println("O argumento 2 deve ser maior que o argumento 1");
            }               
        } else {
            System.out.println("Passe como argumentos um limite inferior e um limite superior, mostraremos os valores entre os dois");
        }
        
        System.out.println("");
            
    }
    
}
    

