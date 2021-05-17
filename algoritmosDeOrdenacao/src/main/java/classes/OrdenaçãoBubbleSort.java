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
public  class OrdenaçãoBubbleSort {  
    
    private Vetor vetorOrdenado;    
    private int[] vetorDeInteirosOrdenado;
    
    public OrdenaçãoBubbleSort() {
    }
    
    public final int[] ordenarCrescente(Vetor vetor){ 
        
        vetorDeInteirosOrdenado = new int[vetor.getTamanhoVetor()];
        Vetor vetorProvisorio = new Vetor(vetor.getTamanhoVetor());
        
        vetorProvisorio = vetor;      
                   
        for(int i = 0; i < vetorProvisorio.getTamanhoVetor()-1; i++){
            boolean trocado = true;
            int provisorio;
            for(int j = 0; j < vetorProvisorio.getTamanhoVetor()-1; j++){                
                if(vetorProvisorio.getElementoVetor(j) > vetorProvisorio.getElementoVetor(j + 1)){
                    provisorio = vetorProvisorio.getElementoVetor(j + 1);
                    vetorProvisorio.setElementoVetor(j + 1, vetorProvisorio.getElementoVetor(j));                   
                    vetorProvisorio.setElementoVetor(j, provisorio);
                    trocado = false;
                    System.out.println("valor trocado!!");
                }                    
            }
            if(trocado){
                break;
            }
        }
        
        for(int i = 0; i < vetorProvisorio.getTamanhoVetor(); i++){
            vetorDeInteirosOrdenado[i] = vetorProvisorio.getElementoVetor(i);
        }
        
        vetorOrdenado = vetorProvisorio;
        vetor.setVetor(vetorDeInteirosOrdenado);
        return vetorDeInteirosOrdenado;        
    }
    
    public final Vetor retornarObjetoTipoVetorOrdenado(){      
        return vetorOrdenado;
    }    
}
