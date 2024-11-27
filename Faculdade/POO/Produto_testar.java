
public class Produto_testar {

    public static void main(String[] args) {

        // Construtor padrão;
        Produto p1 = new Produto(); // Objeto p1 sem parâmetros definidos no construtor, ou seja, posso definir os parâmetros aqui no objeto.
        p1.nome = "Caneta Preta";
        p1.marca = "Bic";
        p1.valor = 1.50f; // O "f" foi necessário informar no fim do número, para indicar que o valor é do tipo "float".

        // Construtor de dois parâmetros:
        Produto p2 = new Produto("Caneta Vermelha", "Faber"); // Objeto com o terceiro construtor criado (dois parâmetros foram definidos neste construtor, faltando apenas o valor).
        p2.valor = 1.69f;

        // Construtor de três parâmetros:
        Produto p3 = new Produto("Borracha", "Mercur", 1.89f); // Aqui todos os parâmetros já foram definidos no objeto.

        // Objeto p1:
        System.out.println("Nome: " + p1.nome + ", Marca: " + p1.marca + ", Valor: " + p1.valor);
    
        // Objeto p2:
        System.out.println("Nome: " + p2.nome + ", Marca: " + p2.marca + ", Valor: " + p2.valor);
    
        // Objeto p3:
        System.out.println("Nome: " + p3.nome + ", Marca: " + p3.marca + ", Valor: " + p3.valor);
    }
}
