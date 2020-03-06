

package projetofila;

import java.util.LinkedList;
import java.util.Queue;


public class Projetofila {

    public static void main(String[] args) {
     
    Queue<String> filaEspera = new LinkedList<>();
    
    //ADICIONAR ELEMENTOS NA FILA
        filaEspera.add("Rodrigo");
        filaEspera.add("Joao");
        filaEspera.add("Adriana");
        
    //consultar toda a fila
        System.out.println("Elementos da fila: " + filaEspera);
        
    //verificar se a fila esta vazia
        System.out.println("A fila esta vazia " + filaEspera.isEmpty());    
    
    //verificar o tamanho da fila
        System.out.println("Tamanho da fila: "+filaEspera.size());
        
        
    //verificar se há um elemento especifico na fila
        String nome = "Ricardo";
        if(filaEspera.contains(nome))System.out.println(nome + " esta na fila!");
        else System.out.println(nome + " não esta na fila");
        
     //Obtem um elemento da fila (quem esta no inicio da fila)
        System.out.println("Nome: " + filaEspera.peek());
        
     ////remove quem esta no inicio da fila
        System.out.println("Removendo da fila: " + filaEspera.poll());
        System.out.println("Nova configuracao: "+ filaEspera);
        
        
    }  
}
