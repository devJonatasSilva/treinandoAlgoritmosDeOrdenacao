/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inclass;

/*
 * @author Jonatas
 */
public class Recursividade {
    
    public static void main(String[] args) {
        mensagemRecursiva("recursividade", 5);
    }
    
    public static void mensagemRecursiva(String mensagem, int contador){
        if(contador > 0){
            System.out.println("loop -> " + contador);
            System.out.println(mensagem);
            contador--;
            mensagemRecursiva(mensagem, contador);
        }
    }   
}
