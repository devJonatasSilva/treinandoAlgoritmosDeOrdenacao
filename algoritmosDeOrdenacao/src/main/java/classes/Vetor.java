/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author jony_
 */
public class Vetor {
    
    private Scanner input = new Scanner(System.in);
    final Random randomicNumber = new Random();
    
    private int[] vetorDeInteiros;
    final private int tamanhoVetor;
    
    public Vetor(int tamanhoVetor){
        this.tamanhoVetor = tamanhoVetor;
        this.vetorDeInteiros = new int[this.tamanhoVetor];
    }    
    
    public void alimentarVetor(){
        for(int i = 0; i < this.vetorDeInteiros.length; i++){
            this.vetorDeInteiros[i] = this.randomicNumber.nextInt(20);
        }
    }
    
    public String imprimirValoresVetor(){
        String print = "";
        for(int i = 0; i < this.vetorDeInteiros.length; i++){
            print += " | " + this.vetorDeInteiros[i];
        }
        return print +=" |";
    }
    
    public int getElementoVetor(int indice){        
        return this.vetorDeInteiros[indice];
    }
    
    public int[] getVetor(){        
        return this.vetorDeInteiros;
    }
    
    public void setVetor(int[] vetor){
        this.vetorDeInteiros = vetor;    
    }    
    
    public void setElementoVetor(int indice, int valor){
        this.vetorDeInteiros[indice] = valor;    
    } 
    
    public int getTamanhoVetor(){
        return this.vetorDeInteiros.length;
    }
}
