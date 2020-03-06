
package Biblioteca;

import java.util.Scanner;
import java.util.Stack;


public class Biblioteca {
    public static class STACK {
       //Atributos
       public String usuario;
       public String titulo;
       public String Autor;
       public int ano;
       public STACK prox;
    }
         
   
   public static void main(String[] args){
       Scanner teclado = new Scanner(System.in);
       
       STACK pilha = new STACK();
       
       STACK top = null;
       STACK aux;
       
       int op;
       
       do{
           System.out.println("1-Inserir livro na pilha");
           System.out.println("2-Remover livro da pilha");
           System.out.println("3-Exibir todos os livros");
           System.out.println("4-Sair");
           System.out.print("R: ");
           op = teclado.nextInt();
           
           //opçao-1
            if(op == 1){
                System.out.print("Digite o nome do usuario: ");
                pilha.usuario =(teclado.next());
                
                System.out.print("Digite o titulo do livro: ");
                pilha.titulo =(teclado.next());
                
                System.out.print("Digite o nome do autor: ");
                pilha.Autor = (teclado.next());
                
                System.out.print("Digite o ano do livro: ");
                pilha.ano =(teclado.nextInt());
                
                //armazenar
                pilha.prox = top;
                top = pilha;
                System.out.println("================");
                System.out.println("Dados inseridos");
                System.out.println("================");
            }
            //opcao-2
            else if(op == 2){
                if(top == null) System.out.println("Pilha vazia!");
                    else {
                        System.out.println("++++++++++++++++++++++++++++++++");
                        System.out.println("Usuario " + top.usuario + " Removido");
                        System.out.println("Livro " + top.titulo + " Removido");
                        System.out.println("Autor " + top.Autor + " Removido");
                        System.out.println("Ano "+ top.ano + "Removido");
                        System.out.println("+++++++++++++++++++++++++++++");
                        top = top.prox;
                }
            }
            //opcao-3
            else if(op == 3){
                
                if(top == null) System.out.println("Pilha vazia!");
                    else {
                    
                        aux = top;
                        while(aux != null){
                            System.out.println("+++++++++++++++");
                            System.out.println(aux.usuario + " ");
                            System.out.println(aux.titulo + " ");
                            System.out.println(aux.Autor + " ");
                            System.out.println(aux.ano + " ");
                            System.out.println("++++++++++++++");
                            aux = aux.prox;
                        }
            }
            
            
            }else{
                System.exit(0);
            }
           
           
           
           
           
           
           
       
       
       
       
       }while(op != 4);
       
       
       
       
   } 
}
