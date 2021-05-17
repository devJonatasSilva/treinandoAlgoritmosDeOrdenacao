/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author jony_
 */
public class Main {


    public static void main(String[] args) {         
        
        System.out.println(" programa teste...");
        Vetor teste = new Vetor(5);
        //teste.criarVetor();
        System.out.println("vetor criado, com sucesso!!\n");
        System.out.println("imprimindo valores iniciais do vetor...");
        System.out.println(teste.imprimirValoresVetor());
        System.out.println("atribuindo elementos ao vetor...\n");
        teste.alimentarVetor();
        System.out.println("imprimindo valores atuais do vetor...");
        System.out.println(teste.imprimirValoresVetor());
        //realizando a ordenação
        OrdenaçãoBubbleSort ordenacao = new OrdenaçãoBubbleSort();
        ordenacao.ordenarCrescente(teste);
        System.out.println("imprimindo valores do vetor em ordem crescente ...");
        System.out.println(teste.imprimirValoresVetor()+"\n\n");
        
        
        System.out.println(" programa teste1...");
        //testando outro vetor
        Vetor teste1 = new Vetor(10);
        //teste.criarVetor();
        System.out.println("vetor criado, com sucesso!!\n");
        System.out.println("imprimindo valores iniciais do vetor...");
        System.out.println(teste1.imprimirValoresVetor());
        System.out.println("atribuindo elementos ao vetor...\n");
        teste1.alimentarVetor();
        System.out.println("imprimindo valores atuais do vetor...");
        System.out.println(teste1.imprimirValoresVetor());        
        //realizando a ordenação        
        ordenacao.ordenarCrescente(teste1);
        System.out.println("imprimindo valores do vetor em ordem crescente ...");
        System.out.println(teste1.imprimirValoresVetor());
        
        
        System.out.println("\n\n saindo do programa...");
        
    }
    
}
