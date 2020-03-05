package cadastrodecompras;


import java.util.LinkedList;

import java.util.Scanner;


public class CadastroDeCompras {
    
    //classe interna
    public static class Vetor {
    public String nome;
    public int quantidade;
}


   
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     
     
     //criando lista com metodo LinkedList**********************
     LinkedList<Vetor> lista = new LinkedList<>();
     
     //variavel para escolha
     int op;
    
     //estrutura de repetição para escolha
     
     do{
         System.out.println("*******Escolha as opcoes********");
         System.out.println("1 - Adicionar elementos");
         System.out.println("2 - Verificar elementos");
         System.out.println("3 - Remover elementos");
         System.out.println("4 - sair");
         System.out.print("R: ");
         op = teclado.nextInt();
            
         //adicionando elemento (OP-1)
         if(op == 1){
                //chamar objeto
                Vetor v1 = new Vetor();
                //
                System.out.println("===========ADICIONAR ELEMENTO==========");
                System.out.print("Digite o nome do produto: ");
                v1.nome = teclado.next();
                
                System.out.print("Digite a quantidade: ");
                v1.quantidade = teclado.nextInt();
                //metodo para adicionar elemento da lista
                lista.add(v1); 
            }//Fim op-1
            
            
         //verificar elementos (OP-2)   
         if(op == 2){
             System.out.println("=============Consultando lista===========");
             if(lista.isEmpty()){
                 System.out.println("Lista vazia!");
                }
             //fazer a listagem 
             else{
             //Consultar lista com o metodo foreach//
             for(Vetor consulta: lista){
                 System.out.println("Nome: "+ consulta.nome);
                 System.out.println("Quantidade: "+ consulta.quantidade);
                 System.out.println("------------------------------------");
                    }
                }
             System.out.println("==============================");
            }//Fim op-2
         
         
         //Remover elementos da lista
         if(op == 3){
             System.out.println("============REMOVENDO ELEMENTO==============");
             if(lista.isEmpty()){
                 System.out.println("Lista vazia");
             }else{
                 System.out.print("Digite o nome do produto para remocao: ");
                 String nomeR = teclado.next();
                 //metodo para remover
                 for(Vetor remover: lista){
                     if(remover.nome.equalsIgnoreCase(nomeR))
                         lista.remove(remover);
                     System.out.println("Produto removido com sucesso!");
                    }
                }  
            }    
     }while(op != 4);
        
        
        
    } 
}