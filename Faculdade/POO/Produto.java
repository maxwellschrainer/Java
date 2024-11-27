public class Produto {
    
    // Atributos
    String nome;
    String marca;
    float valor;

    // Construtores.

    // Construtor padrão, sem parâmetros (o construtor padrão é muito importante, pois sem ele não será possível testar a classe, para ter a opção de criar um objeto sem definir parâmetros).
    Produto(){

    }

    // Construtor com o parâmetro String nome.
    Produto(String nome){
        this.nome = nome; // this.nome == variável = nome == parâmetro do construtor.
    }

    Produto(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    Produto(String nome, String marca, float valor){
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }
}