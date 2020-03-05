
package poo.projetomercado;

public class ProjetoMercado {

    
    public static void main(String[] args) {
       
        //Produto nao parametrizado
        Produto p1 = new Produto();
        p1.setNome("Oreo");
        p1.setPreco(10);
        p1.setPeso(0.5);
        p1.desconto(70);
        p1.estado();
        
        //Produto parametrizado
        Produto p2 = new Produto("Miojo",1.5,0.50);
        p2.desconto(10);
        p2.estado();
        
        
        
    }
    
}
