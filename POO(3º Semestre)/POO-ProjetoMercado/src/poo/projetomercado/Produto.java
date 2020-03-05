
package poo.projetomercado;


public class Produto {
    
    private String nome;
    private double preco;
    private double peso;
    private double precoDesc;


    //construtor
    Produto(){
        this.nome = null;
        this.preco = 0;
        this.peso = 0;
        
    }
    
    Produto(String nome2,double preco2, double peso2){
        this.nome = nome2;
        this.preco = preco2;
        this.peso = peso2;
    }
    
    //estado
    void estado(){
        System.out.println("==================================================");
        System.out.println("O nome do produto é " + this.getNome());
        System.out.println("O preço do produto é " + this.getPreco());
        System.out.println("O peso do produto é " + this.getPeso());
        System.out.println("O preço atual com desconto é " + this.getPrecoDesc());
    }
    
    //metodos
    
    public double desconto(double desconto){
        double porcentagem = desconto/100;
        double desconto2 = porcentagem * this.getPreco();
        double aplicacao = this.getPreco() - desconto2;
        this.precoDesc = aplicacao;
        return this.getPrecoDesc();
       
    }
    
    //Metodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length()>2){
        this.nome = nome;
        }else{
            System.err.println("Nome invalido");
            System.exit(0);
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco){
        if(preco >0){
        this.preco = preco;
        }else{
            System.err.println("Valor invalido");
            System.exit(0);
        }
        
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso){
         if(peso >0){
            this.peso = peso;
        }else{
            System.err.println("Valor invalido");
            System.exit(0);
        }
        
    }
    
    public double getPrecoDesc(){
        return precoDesc;
    }

    public void setPrecoDesc(double precoDesc){
        if(precoDesc<0){
        this.precoDesc = precoDesc;
        }else{
            System.err.println("Desconto invalido");
            System.exit(0);
        }
    }
    //Fim get e set

    
    
    
    
    
    
    
    
    
    
}
